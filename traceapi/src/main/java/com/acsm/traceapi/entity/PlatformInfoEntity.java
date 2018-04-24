package com.acsm.traceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by LiYu on 2018/4/24.
 */
@Entity
@Table(name = "platform_info", schema = "trace_db", catalog = "")
public class PlatformInfoEntity {
    private int platformInfoId;
    private String platformName;
    private String appid;
    private String appsecret;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private byte deleted;

    @Id
    @Column(name = "platform_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPlatformInfoId() {
        return platformInfoId;
    }

    public void setPlatformInfoId(int platformInfoId) {
        this.platformInfoId = platformInfoId;
    }

    @Basic
    @Column(name = "platform_name")
    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    @Basic
    @Column(name = "appid")
    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Basic
    @Column(name = "appsecret")
    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
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
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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
        PlatformInfoEntity that = (PlatformInfoEntity) o;
        return platformInfoId == that.platformInfoId &&
                deleted == that.deleted &&
                Objects.equals(platformName, that.platformName) &&
                Objects.equals(appid, that.appid) &&
                Objects.equals(appsecret, that.appsecret) &&
                Objects.equals(insertTime, that.insertTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(platformInfoId, platformName, appid, appsecret, insertTime, updateTime, deleted);
    }
}
