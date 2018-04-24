package com.acsm.traceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by LiYu on 2018/4/24.
 */
@Entity
@Table(name = "trace_code_batch", schema = "trace_db", catalog = "")
public class TraceCodeBatchEntity {
    private int batchId;
    private int platformInfoId;
    private String batchName;
    private Timestamp insertTime;

    @Id
    @Column(name = "batch_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
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
    @Column(name = "batch_name")
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Basic
    @Column(name = "insert_time")
    public Timestamp getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Timestamp insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TraceCodeBatchEntity that = (TraceCodeBatchEntity) o;
        return batchId == that.batchId &&
                platformInfoId == that.platformInfoId &&
                Objects.equals(batchName, that.batchName) &&
                Objects.equals(insertTime, that.insertTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(batchId, platformInfoId, batchName, insertTime);
    }
}
