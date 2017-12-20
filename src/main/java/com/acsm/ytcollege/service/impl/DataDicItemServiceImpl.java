package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.respons.DataDicListDto;
import com.acsm.ytcollege.entity.DataDicItem;
import com.acsm.ytcollege.utils.DataDicUtil;
import com.acsm.ytcollege.repository.DataDicItemRepository;
import com.acsm.ytcollege.service.DataDicItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 15:55 2017/12/19
 */
@Service
public class DataDicItemServiceImpl implements DataDicItemService {
    @Autowired
    DataDicItemRepository dataDicItemRepository;


    @Override
    public List<DataDicItem> getPositionTypeList(Integer dataDicId) {
        return dataDicItemRepository.findByDicId(dataDicId);
    }

    @Override
    public List<DataDicItem> getDegreeTypeList() {
        return dataDicItemRepository.findByDicId(DataDicUtil.DATADIC_DEGREE);
    }

    @Override
    public List<DataDicItem> getSocialBenefitsTypeList() {
        return dataDicItemRepository.findByDicId(DataDicUtil.DATADIC_SOCIALBENEFITS);
    }

    @Override
    public List<DataDicItem> getSalaryMinTypeList() {
        return dataDicItemRepository.findByDicId(DataDicUtil.DATADIC_SALARYMIN);
    }

    @Override
    public List<DataDicItem> getSalaryMaxTypeList() {
        return dataDicItemRepository.findByDicId(DataDicUtil.DATADIC_SALARYMAX);
    }

    @Override
    public List<DataDicItem> getExperienceList() {
        return dataDicItemRepository.findByDicId(DataDicUtil.DATADIC_EXPERIENCE);
    }
}
