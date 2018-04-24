package com.acsm.traceapi.service;

import com.acsm.traceapi.domain.Commodity;
import com.acsm.traceapi.domain.TraceNode;
import com.acsm.traceapi.dto.request.FilterParam;
import com.acsm.traceapi.dto.response.CommodityDto;
import com.acsm.traceapi.dto.response.FilterDto;
import com.acsm.traceapi.dto.response.TraceDto;
import com.acsm.traceapi.entity.CommodityInfoEntity;
import com.acsm.traceapi.entity.CommodityTraceNodeEntity;
import com.acsm.traceapi.enums.CommodityStatusEnum;
import com.acsm.traceapi.enums.TraceStageEnum;
import com.acsm.traceapi.repository.CommodityRepository;
import com.acsm.traceapi.repository.CommodityTraceNodeRepository;
import com.acsm.traceapi.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by LiYu on 2018/4/12.
 */
@Service
public class CommodityService {

    @Autowired
    private CommodityRepository commodityRepository;

    @Autowired
    private CommodityTraceNodeRepository commodityTraceNodeRepository;

    /**
     * 上传商品信息
     * @param commodity
     */
    @Transactional
    public void submitCommodityInfo(Commodity commodity){

    }


    /**
     * 获取商品列表
     * @return
     */
    public List<CommodityDto> getCommodityList(FilterParam filterParam){
        List<CommodityDto> list = new ArrayList<>();
        List<CommodityInfoEntity> entityList = null;
        if (null == filterParam.getSearchStr() || filterParam.getSearchStr().isEmpty()){
            entityList= commodityRepository.findAll();
        }else {
            //TODO 现在只有按照追溯码搜索
            String traceCode = filterParam.getSearchStr();
            entityList = commodityRepository.queryByTraceCode(traceCode);
        }

        for(CommodityInfoEntity commdityEntity : entityList){
            list.add(this.genCommodityDtoByCommodityInfoEntity(commdityEntity));
        }
        return list;
    }

    /**
     * 根据追溯码查询追溯路径
     * @return
     */
    public TraceDto getTraceNodeByTraceCode(String traceCode){
        TraceDto traceDto = new TraceDto();
        //查询到商品
        CommodityInfoEntity commodityInfoEntity = commodityRepository.findByTraceCode(traceCode);
        if(null != commodityInfoEntity){
            Set<Integer> commodityIds = this.getAllCommodityId(commodityInfoEntity);
            List<CommodityTraceNodeEntity> list = commodityTraceNodeRepository.findByCommodityIntoIdIn(commodityIds);
            List<TraceNode> nodeList = new ArrayList<>();
            for (CommodityTraceNodeEntity commodityTraceNodeEntity : list){
                nodeList.add(this.genTraceNodeByCommodityTraceNodeEntity(commodityTraceNodeEntity));
            }
            traceDto.setNodeList(nodeList);
        }
        return traceDto;
    }

    /**
     * 获取所有商品id
     * @param commodityInfoEntity
     * @return
     */
    private Set<Integer> getAllCommodityId(CommodityInfoEntity commodityInfoEntity){
        Set<Integer> set = new HashSet<>();
        this.recursionCommodityTree(set, commodityInfoEntity);
        return set;
    }

    /**
     * 递归获取所有商品id
     * @param set
     * @param commodityInfoEntity
     */
    private void recursionCommodityTree(Set<Integer> set, CommodityInfoEntity commodityInfoEntity){
        set.add(commodityInfoEntity.getCommodityInfoId());
        if(commodityInfoEntity.getParentCommodityId() != 0){
            CommodityInfoEntity parentCommodityInfoEntity = commodityRepository.findByCommodityInfoId(commodityInfoEntity.getParentCommodityId());
            this.recursionCommodityTree(set, parentCommodityInfoEntity);
        }
    }

    /**
     * 根据商品追溯节点实体生成追溯节点对象
     * @param commodityTraceNodeEntity
     * @return
     */
    private TraceNode genTraceNodeByCommodityTraceNodeEntity(CommodityTraceNodeEntity commodityTraceNodeEntity){
        TraceNode traceNode = new TraceNode();
        traceNode.setSubjectName(commodityTraceNodeEntity.getSubjectName());
        traceNode.setDateTime(DateUtil.formatDateByPattern("yyyy-MM-dd HH:mm:SS", commodityTraceNodeEntity.getInsertTime()));
        traceNode.setTraceStage(TraceStageEnum.getByCode(commodityTraceNodeEntity.getTraceStage()).getComment());
        traceNode.setTraceAddr(commodityTraceNodeEntity.getSubjectAddr());
        traceNode.setLng(commodityTraceNodeEntity.getLng());
        traceNode.setLat(commodityTraceNodeEntity.getLat());
        return traceNode;
    }

    /**
     * 根据商品实体生成商品返回dto
     * @param commodityInfoEntity
     * @return
     */
    private CommodityDto genCommodityDtoByCommodityInfoEntity(CommodityInfoEntity commodityInfoEntity){
        CommodityDto commodityDto = new CommodityDto();
        commodityDto.setCommodityId(commodityInfoEntity.getCommodityInfoId());
        commodityDto.setCommodityStatus(CommodityStatusEnum.NORMAL.getComment());//TODO 暂时都是正常
        commodityDto.setDate(DateUtil.formatDateByPattern("yyyy-MM-dd", commodityInfoEntity.getInsertTime()));
        commodityDto.setTraceCode(commodityInfoEntity.getTraceCode());
        commodityDto.setCommodityName(commodityInfoEntity.getCommodityName());
        return commodityDto;
    }


    /**
     * 搜索方法
     * @param filterParam
     * @return
     */
    public FilterDto searchCommodity(FilterParam filterParam){
        FilterDto filterDto = new FilterDto();
        TraceDto traceDto = new TraceDto();
        String traceCode = filterParam.getSearchStr();
        CommodityInfoEntity commodityInfoEntity = commodityRepository.findByTraceCode(traceCode);
        if(null != commodityInfoEntity){
            Set<Integer> commodityIds = this.getAllCommodityId(commodityInfoEntity);
            List<CommodityTraceNodeEntity> list = commodityTraceNodeRepository.findByCommodityIntoIdIn(commodityIds);
            List<TraceNode> nodeList = new ArrayList<>();
            for (CommodityTraceNodeEntity commodityTraceNodeEntity : list){
                nodeList.add(this.genTraceNodeByCommodityTraceNodeEntity(commodityTraceNodeEntity));
            }
            traceDto.setNodeList(nodeList);
            filterDto.setTraceNode(traceDto);
            List<CommodityDto> commodityDtos = new ArrayList<>();
            commodityDtos.add(this.genCommodityDtoByCommodityInfoEntity(commodityInfoEntity));
            filterDto.setCommodities(commodityDtos);
        }
        return filterDto;
    }

}
