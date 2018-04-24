package com.acsm.traceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by LiYu on 2018/4/12.
 */
@Entity
@Table(name = "trace_code", schema = "trace_db", catalog = "")
public class TraceCodeEntity {
    private int traceCodeId;
    private String traceCode;
    private int status;
    private int platformInfoId;
    private String appid;
    private Integer traceCodeBatchId;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private byte deleted;

    @Id
    @Column(name = "trace_code_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTraceCodeId() {
        return traceCodeId;
    }

    public void setTraceCodeId(int traceCodeId) {
        this.traceCodeId = traceCodeId;
    }

    @Basic
    @Column(name = "trace_code")
    public String getTraceCode() {
        return traceCode;
    }

    public void setTraceCode(String traceCode) {
        this.traceCode = traceCode;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "platform_info_id")
    public int getPlatformInfoId() {
        return platformInfoId;
    }

    public void setPlatformInfoId(int platformInfoId) {
        this.platformInfoId = platformInfoId;
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
    @Column(name = "trace_code_batch_id")
    public Integer getTraceCodeBatchId() {
        return traceCodeBatchId;
    }

    public void setTraceCodeBatchId(Integer traceCodeBatchId) {
        this.traceCodeBatchId = traceCodeBatchId;
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
        TraceCodeEntity that = (TraceCodeEntity) o;
        return traceCodeId == that.traceCodeId &&
                status == that.status &&
                platformInfoId == that.platformInfoId &&
                deleted == that.deleted &&
                Objects.equals(traceCode, that.traceCode) &&
                Objects.equals(appid, that.appid) &&
                Objects.equals(traceCodeBatchId, that.traceCodeBatchId) &&
                Objects.equals(insertTime, that.insertTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(traceCodeId, traceCode, status, platformInfoId, appid, traceCodeBatchId, insertTime, updateTime, deleted);
    }
}
