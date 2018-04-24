package com.acsm.traceapi.repository;

import com.acsm.traceapi.entity.CommodityInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by LiYu on 2018/4/13.
 */
public interface CommodityRepository extends JpaRepository<CommodityInfoEntity, Integer> {

    public CommodityInfoEntity findByTraceCode(String traceCode);

    @Query("select t from CommodityInfoEntity t where t.traceCode = ?1")
    public List<CommodityInfoEntity> queryByTraceCode(String traceCode);


    public CommodityInfoEntity findByCommodityInfoId(int id);
}
