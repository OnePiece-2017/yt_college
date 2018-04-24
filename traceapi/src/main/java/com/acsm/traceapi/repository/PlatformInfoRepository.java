package com.acsm.traceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LiYu on 2018/4/11.
 */
public interface PlatformInfoRepository extends JpaRepository<PlatformInfoEntity, Integer> {

    public PlatformInfoEntity findByAppidAndAppsecret(String appid, String appsecret);
}
