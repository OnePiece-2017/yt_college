package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.respons.DataDicDto;
import com.acsm.ytcollege.dto.respons.DataDicListDto;
import com.acsm.ytcollege.entity.DataDic;
import com.acsm.ytcollege.repository.DataDicRepository;
import com.acsm.ytcollege.service.DataDicItemService;
import com.acsm.ytcollege.service.DataDicService;
import com.acsm.ytcollege.utils.DataDicUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 16:12 2017/12/19
 */
@Service
public class DataDicServiceImpl implements DataDicService{
    @Autowired
    DataDicRepository dataDicRepository;

    @Autowired
    DataDicItemService dataDicItemService;
    @Override
    public DataDic findOne(Integer dataDicId) {
        return dataDicRepository.findByDicId(dataDicId);
    }

    @Override
    public List<DataDicDto> getPositionTypeList() {

        List<DataDicDto> dataDicDtoList = new ArrayList<DataDicDto>();

        DataDicDto dataDicDto = new DataDicDto();
        //生产类
        DataDic datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_PRODUCTION);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_PRODUCTION));
        dataDicDtoList.add(dataDicDto);

        //办公运营类
        dataDicDto = new DataDicDto();
        datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_OFFICEOPERATION);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_OFFICEOPERATION));
        dataDicDtoList.add(dataDicDto);

        //服务类
        dataDicDto = new DataDicDto();
        datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_SERVE);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_SERVE));
        dataDicDtoList.add(dataDicDto);

        //销售类
        dataDicDto = new DataDicDto();
        datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_SALES);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_SALES));
        dataDicDtoList.add(dataDicDto);

        //政企类
        dataDicDto = new DataDicDto();
        datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_GOVERNMENTANDENTERPRISES);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_GOVERNMENTANDENTERPRISES));
        dataDicDtoList.add(dataDicDto);

        //车间库管类
        dataDicDto = new DataDicDto();
        datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_CHEJIANKUGUAN);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_CHEJIANKUGUAN));
        dataDicDtoList.add(dataDicDto);

        //研发类
        dataDicDto = new DataDicDto();
        datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_DEVELOP);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_DEVELOP));
        dataDicDtoList.add(dataDicDto);

        //管理类
        dataDicDto = new DataDicDto();
        datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_MANAGE);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_MANAGE));
        dataDicDtoList.add(dataDicDto);

        //短工类
        dataDicDto = new DataDicDto();
        datadic = dataDicRepository.findByDicId(DataDicUtil.DATADIC_CASUAL);
        dataDicDto.setDicId(datadic.getDicId());
        dataDicDto.setDicName(datadic.getDicName());
        dataDicDto.setDataDicItemsList(dataDicItemService.getPositionTypeList(DataDicUtil.DATADIC_CASUAL));
        dataDicDtoList.add(dataDicDto);


        return dataDicDtoList;
    }

}
