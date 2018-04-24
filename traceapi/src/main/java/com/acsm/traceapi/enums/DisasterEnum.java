package com.acsm.traceapi.enums;

/**
 * Created by LiYu on 2018/4/23.
 */
public enum DisasterEnum {
    DISASTER_UNKNOW("00", "未知"),
    TYPHOON("01","台风"),
    RAINSTORM("02","暴雨"),
    SNOWFALL("03","暴雪"),
    COLDWAVE("04","寒潮"),
    GALE("05","大风"),
    SANDSTORM("06","沙尘暴"),
    HIGHTEM("07","高温"),
    DROUGHT("08","干旱"),
    THUNDER("09","雷电"),
    HAILSTONE("10","冰雹"),
    FROST("11","霜冻"),
    FROG("12","大雾"),
    HAZE("13","霾"),
    ICYROAD("14","道路结冰"),
    COLD("91","寒冷"),
    GREYHAZE("92","灰霾"),
    THUNDERWIND("93","雷雨大风"),
    FORESTFIRE("94","森林火险"),
    COOLING("95","降温"),
    ROADSNOW("96","道路冰雪"),
    DRYHOTWIND("97","干热风"),
    AIRPOLLUTION("98","空气重污染"),
    LOWTEM("99","低温"),
    ;


    DisasterEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static DisasterEnum getByCode(String code){
        for(DisasterEnum disasterEnum : DisasterEnum.values()) {
            if(disasterEnum.code.equals(code)) {
                return disasterEnum;
            }
        }
        return DisasterEnum.DISASTER_UNKNOW;
    }

}
