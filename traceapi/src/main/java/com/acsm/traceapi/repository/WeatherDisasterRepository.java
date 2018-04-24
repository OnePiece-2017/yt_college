package com.acsm.traceapi.repository;

import com.acsm.traceapi.entity.WeatherDisasterInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LiYu on 2018/4/23.
 */
public interface WeatherDisasterRepository extends JpaRepository<WeatherDisasterInfoEntity, Integer> {

}
