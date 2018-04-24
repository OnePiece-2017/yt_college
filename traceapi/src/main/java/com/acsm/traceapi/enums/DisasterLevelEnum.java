package com.acsm.traceapi.enums;

/**
 * Created by LiYu on 2018/4/23.
 */
public enum DisasterLevelEnum {
    BLUE("01","蓝色"),
    YELLOW("02","黄色"),
    ORANGE("03","橙色"),
    RED("04","红色"),
    WHITE("05","白色"),
    ;

    private String code;
    private String name;

    DisasterLevelEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static DisasterLevelEnum getByCode(String code){
        for(DisasterLevelEnum disasterLevelEnum : DisasterLevelEnum.values()) {
            if(disasterLevelEnum.code.equals(code)) {
                return disasterLevelEnum;
            }
        }
        return DisasterLevelEnum.BLUE;
    }
}
