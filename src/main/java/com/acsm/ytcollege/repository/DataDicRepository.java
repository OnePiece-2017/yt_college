package com.acsm.ytcollege.repository;

import com.acsm.ytcollege.entity.DataDic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 16:12 2017/12/19
 */
public interface DataDicRepository extends JpaRepository<DataDic,Integer> {
    DataDic findByDicId(Integer dicId);
}
