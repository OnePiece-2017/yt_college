package com.acsm.traceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by LiYu on 2018/4/23.
 */
@Entity
@Table(name = "weather_disaster_info", schema = "trace_db", catalog = "")
public class WeatherDisasterInfoEntity {
    private int weatherDisasterInfoId;
    private String areaName;
    private String disasterCode;
    private String disasterLevel;
    private Timestamp publishTime;
    private Timestamp insertTime;
    private byte deleted;

    @Id
    @Column(name = "weather_disaster_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getWeatherDisasterInfoId() {
        return weatherDisasterInfoId;
    }

    public void setWeatherDisasterInfoId(int weatherDisasterInfoId) {
        this.weatherDisasterInfoId = weatherDisasterInfoId;
    }

    @Basic
    @Column(name = "area_name")
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "disaster_code")
    public String getDisasterCode() {
        return disasterCode;
    }

    public void setDisasterCode(String disasterCode) {
        this.disasterCode = disasterCode;
    }

    @Basic
    @Column(name = "disaster_level")
    public String getDisasterLevel() {
        return disasterLevel;
    }

    public void setDisasterLevel(String disasterLevel) {
        this.disasterLevel = disasterLevel;
    }

    @Basic
    @Column(name = "publish_time")
    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }

    @Basic
    @Column(name = "insert_time")
    public Timestamp getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Timestamp insertTime) {
        this.insertTime = insertTime;
    }

    @Basic
    @Column(name = "deleted")
    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherDisasterInfoEntity that = (WeatherDisasterInfoEntity) o;
        return weatherDisasterInfoId == that.weatherDisasterInfoId &&
                deleted == that.deleted &&
                Objects.equals(areaName, that.areaName) &&
                Objects.equals(disasterCode, that.disasterCode) &&
                Objects.equals(disasterLevel, that.disasterLevel) &&
                Objects.equals(publishTime, that.publishTime) &&
                Objects.equals(insertTime, that.insertTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(weatherDisasterInfoId, areaName, disasterCode, disasterLevel, publishTime, insertTime, deleted);
    }
}
