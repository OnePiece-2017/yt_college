package com.acsm.traceapi.service;

import com.acsm.traceapi.dto.request.BatchTraceCodeParam;
import com.acsm.traceapi.dto.response.TraceCodesWithBatchDto;
import com.acsm.traceapi.entity.TraceCodeEntity;
import com.acsm.traceapi.enums.ExceptionEnum;
import com.acsm.traceapi.enums.RedisKeyEnum;
import com.acsm.traceapi.enums.StatusEnum;
import com.acsm.traceapi.exception.BusinessException;
import com.acsm.traceapi.repository.PlatformInfoRepository;
import com.acsm.traceapi.repository.TraceCodeBatchRepository;
import com.acsm.traceapi.repository.TraceCodeRepository;
import com.acsm.traceapi.utils.CodeUtil;
import com.acsm.traceapi.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by LiYu on 2018/4/11.
 */
@Service
public class TraceCodeService {

    @Autowired
    private RedisService redisService;

    @Autowired
    private PlatformInfoRepository platformInfoRepository;

    @Autowired
    private TraceCodeBatchRepository traceCodeBatchRepository;

    @Autowired
    private TraceCodeRepository traceCodeRepository;

    @Transactional
    public TraceCodesWithBatchDto requestTraceCodesInBatch(BatchTraceCodeParam batchTraceCodeParam) throws Exception{
        PlatformInfoEntity platformInfoEntity = platformInfoRepository.findByAppidAndAppsecret(batchTraceCodeParam.getAppId(), batchTraceCodeParam.getAppSecret());
        if (null != platformInfoEntity){
            TraceCodeBatchEntity traceCodeBatchEntity = new TraceCodeBatchEntity();
            traceCodeBatchEntity.setBatchName(batchTraceCodeParam.getBatchName());
            traceCodeBatchEntity.setInsertTime(new Timestamp(System.currentTimeMillis()));
            traceCodeBatchEntity = traceCodeBatchRepository.save(traceCodeBatchEntity);

            int num = batchTraceCodeParam.getNumber();
            List<String> codeList = new ArrayList<>();
            //前缀拼上日期
            String dateStr = DateUtil.formatDateByPattern("yyyyMMdd", new Date());
            for(int i=0; i<num; i++){
                String traceCode = dateStr + CodeUtil.genTraceCode(redisService.incr(RedisKeyEnum.TRACE_CODE_INDEX_PREFIX.getKeyPrefix() + dateStr));
                TraceCodeEntity traceCodeEntity = new TraceCodeEntity();
                traceCodeEntity.setTraceCode(traceCode);
                traceCodeEntity.setTraceCodeBatchId(traceCodeBatchEntity.getBatchId());
                traceCodeEntity.setAppid(platformInfoEntity.getAppid());
                traceCodeEntity.setInsertTime(new Timestamp(System.currentTimeMillis()));
                traceCodeEntity.setPlatformInfoId(platformInfoEntity.getPlatformInfoId());
                traceCodeEntity.setStatus(StatusEnum.UNUSE.getStatus());
                traceCodeRepository.save(traceCodeEntity);
                codeList.add(traceCode);
            }
            TraceCodesWithBatchDto traceCodesWithBatchDto = new TraceCodesWithBatchDto();
            traceCodesWithBatchDto.setBatchName(batchTraceCodeParam.getBatchName());
            traceCodesWithBatchDto.setCodeList(codeList);
            return traceCodesWithBatchDto;

        }else {
            throw new BusinessException(ExceptionEnum.APPID_ERROR);
        }
    }
}
