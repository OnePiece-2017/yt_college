package com.acsm.traceapi.repository;

import com.acsm.traceapi.entity.CommodityTraceNodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

/**
 * Created by LiYu on 2018/4/13.
 */
public interface CommodityTraceNodeRepository extends JpaRepository<CommodityTraceNodeEntity, Integer> {

    public List<CommodityTraceNodeEntity> findByCommodityIntoIdIn(Set<Integer> ids);
}
