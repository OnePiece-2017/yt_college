package com.acsm.traceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by LiYu on 2018/4/12.
 */
@Entity
@Table(name = "commodity_info", schema = "trace_db", catalog = "")
public class CommodityInfoEntity {
    private int commodityInfoId;
    private String commodityName;
    private String traceCode;
    private String factoryCode;
    private String specification;
    private int parentCommodityId;
    private Timestamp insertTime;
    private byte deleted;

    @Id
    @Column(name = "commodity_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCommodityInfoId() {
        return commodityInfoId;
    }

    public void setCommodityInfoId(int commodityInfoId) {
        this.commodityInfoId = commodityInfoId;
    }

    @Basic
    @Column(name = "commodity_name")
    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
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
    @Column(name = "factory_code")
    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    @Basic
    @Column(name = "specification")
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Basic
    @Column(name = "parent_commodity_id")
    public int getParentCommodityId() {
        return parentCommodityId;
    }

    public void setParentCommodityId(int parentCommodityId) {
        this.parentCommodityId = parentCommodityId;
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
        CommodityInfoEntity that = (CommodityInfoEntity) o;
        return commodityInfoId == that.commodityInfoId &&
                parentCommodityId == that.parentCommodityId &&
                deleted == that.deleted &&
                Objects.equals(commodityName, that.commodityName) &&
                Objects.equals(traceCode, that.traceCode) &&
                Objects.equals(factoryCode, that.factoryCode) &&
                Objects.equals(specification, that.specification) &&
                Objects.equals(insertTime, that.insertTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commodityInfoId, commodityName, traceCode, factoryCode, specification, parentCommodityId, insertTime, deleted);
    }
}
