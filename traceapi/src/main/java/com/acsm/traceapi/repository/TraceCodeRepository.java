package com.acsm.traceapi.repository;

import com.acsm.traceapi.entity.TraceCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LiYu on 2018/4/12.
 */
public interface TraceCodeRepository extends JpaRepository<TraceCodeEntity, Integer> {
}
