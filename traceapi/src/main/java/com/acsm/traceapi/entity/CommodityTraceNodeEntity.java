package com.acsm.traceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by LiYu on 2018/4/13.
 */
@Entity
@Table(name = "commodity_trace_node", schema = "trace_db", catalog = "")
public class CommodityTraceNodeEntity {
    private int commodityTraceNodeId;
    private int commodityIntoId;
    private String traceCode;
    private String subjectName;
    private String subjectCode;
    private String sbjectPhone;
    private String subjectAddr;
    private int traceStage;
    private Double lng;
    private double lat;
    private int subjectType;
    private Timestamp insertTime;
    private byte deleted;

    @Id
    @Column(name = "commodity_trace_node_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCommodityTraceNodeId() {
        return commodityTraceNodeId;
    }

    public void setCommodityTraceNodeId(int commodityTraceNodeId) {
        this.commodityTraceNodeId = commodityTraceNodeId;
    }

    @Basic
    @Column(name = "commodity_into_id")
    public int getCommodityIntoId() {
        return commodityIntoId;
    }

    public void setCommodityIntoId(int commodityIntoId) {
        this.commodityIntoId = commodityIntoId;
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
    @Column(name = "subject_name")
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Basic
    @Column(name = "subject_code")
    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Basic
    @Column(name = "sbject_phone")
    public String getSbjectPhone() {
        return sbjectPhone;
    }

    public void setSbjectPhone(String sbjectPhone) {
        this.sbjectPhone = sbjectPhone;
    }

    @Basic
    @Column(name = "subject_addr")
    public String getSubjectAddr() {
        return subjectAddr;
    }

    public void setSubjectAddr(String subjectAddr) {
        this.subjectAddr = subjectAddr;
    }

    @Basic
    @Column(name = "trace_stage")
    public int getTraceStage() {
        return traceStage;
    }

    public void setTraceStage(int traceStage) {
        this.traceStage = traceStage;
    }

    @Basic
    @Column(name = "lng")
    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Basic
    @Column(name = "lat")
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "subject_type")
    public int getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(int subjectType) {
        this.subjectType = subjectType;
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
        CommodityTraceNodeEntity that = (CommodityTraceNodeEntity) o;
        return commodityTraceNodeId == that.commodityTraceNodeId &&
                commodityIntoId == that.commodityIntoId &&
                traceStage == that.traceStage &&
                Double.compare(that.lat, lat) == 0 &&
                subjectType == that.subjectType &&
                deleted == that.deleted &&
                Objects.equals(traceCode, that.traceCode) &&
                Objects.equals(subjectName, that.subjectName) &&
                Objects.equals(subjectCode, that.subjectCode) &&
                Objects.equals(sbjectPhone, that.sbjectPhone) &&
                Objects.equals(subjectAddr, that.subjectAddr) &&
                Objects.equals(lng, that.lng) &&
                Objects.equals(insertTime, that.insertTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commodityTraceNodeId, commodityIntoId, traceCode, subjectName, subjectCode, sbjectPhone, subjectAddr, traceStage, lng, lat, subjectType, insertTime, deleted);
    }
}
