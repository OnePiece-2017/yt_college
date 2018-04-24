package com.acsm.traceapi.utils;

import java.text.DecimalFormat;
import java.util.UUID;

/**
 * Created by LiYu on 2018/4/11.
 */
public class CodeUtil {

    /**
     * 生成appid
     * @return
     */
    public static String genAppidByUUID(){
        String uuidStr = UUID.randomUUID().toString().replace("-","");
        return uuidStr.substring(0, 16);
    }

    /**
     * 生成appsecret
     * @return
     */
    public static String genAppsecretByUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

    /**
     * 生成追溯序列号
     * @return
     */
    public static String genTraceCode(String str){
        DecimalFormat df=new DecimalFormat("0000000000");
        String str2=df.format(Integer.parseInt(str));
        return str2;
    }
}
