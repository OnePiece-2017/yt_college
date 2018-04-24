package com.acsm.traceapi.service;

import com.acsm.traceapi.dto.request.RequestTracePermissionParm;
import com.acsm.traceapi.dto.response.AppidAppsecretDto;
import com.acsm.traceapi.repository.PlatformInfoRepository;
import com.acsm.traceapi.utils.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;

/**
 * Created by LiYu on 2018/4/11.
 */
@Service
@RequestMapping("/auth")
public class AuthPermissionService {

    @Autowired
    private PlatformInfoRepository platformInfoRepository;

    /**
     * 获取追溯平台调用权限
     * @param requestTracePermissionParm
     * @return
     */
    public AppidAppsecretDto requestTracePermission(RequestTracePermissionParm requestTracePermissionParm){
        String appid = CodeUtil.genAppidByUUID();
        String appsecret = CodeUtil.genAppsecretByUUID();
        PlatformInfoEntity platformInfoEntity = new PlatformInfoEntity();
        platformInfoEntity.setAppid(appid);
        platformInfoEntity.setAppsecret(appsecret);
        platformInfoEntity.setPlatformName(requestTracePermissionParm.getPlatformName());
        platformInfoEntity.setInsertTime(new Timestamp(System.currentTimeMillis()));
        platformInfoRepository.save(platformInfoEntity);
        AppidAppsecretDto appidAppsecretDto = new AppidAppsecretDto();
        appidAppsecretDto.setAppid(platformInfoEntity.getAppid());
        appidAppsecretDto.setAppSecret(platformInfoEntity.getAppsecret());
        return appidAppsecretDto;
    }

}
