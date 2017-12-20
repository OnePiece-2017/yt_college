package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.respons.DataDicListDto;
import com.acsm.ytcollege.entity.DataDicItem;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 15:25 2017/12/19
 */
public interface DataDicItemService {
    List<DataDicItem> getPositionTypeList(Integer dataDicId);

    List<DataDicItem> getDegreeTypeList();

    List<DataDicItem> getSocialBenefitsTypeList();

    List<DataDicItem> getSalaryMinTypeList();

    List<DataDicItem> getSalaryMaxTypeList();

    List<DataDicItem> getExperienceList();
}
