package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.respons.DataDicDto;
import com.acsm.ytcollege.entity.DataDic;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 16:11 2017/12/19
 */
public interface DataDicService {
    DataDic findOne(Integer dataDicId);

    List<DataDicDto> getPositionTypeList();

}
