package com.acsm.ytcollege.repository;

import com.acsm.ytcollege.entity.DataDicItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 15:56 2017/12/19
 */
public interface DataDicItemRepository extends JpaRepository<DataDicItem,Integer>{
    List<DataDicItem> findByDicId(Integer dataDicId);
}
