package com.acsm.traceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by LiYu on 2018/4/11.
 */
@Entity
@Table(name = "commodity_ingredient_info", schema = "trace_db", catalog = "")
public class CommodityIngredientInfoEntity {
    private int commodityIngredientInfoId;
    private int mainCommodityInfoId;
    private int ingredientCommodityInfoId;
    private Timestamp insertTime;

    @Id
    @Column(name = "commodity_ingredient_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCommodityIngredientInfoId() {
        return commodityIngredientInfoId;
    }

    public void setCommodityIngredientInfoId(int commodityIngredientInfoId) {
        this.commodityIngredientInfoId = commodityIngredientInfoId;
    }

    @Basic
    @Column(name = "main_commodity_info_id")
    public int getMainCommodityInfoId() {
        return mainCommodityInfoId;
    }

    public void setMainCommodityInfoId(int mainCommodityInfoId) {
        this.mainCommodityInfoId = mainCommodityInfoId;
    }

    @Basic
    @Column(name = "ingredient_commodity_info_id")
    public int getIngredientCommodityInfoId() {
        return ingredientCommodityInfoId;
    }

    public void setIngredientCommodityInfoId(int ingredientCommodityInfoId) {
        this.ingredientCommodityInfoId = ingredientCommodityInfoId;
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
        CommodityIngredientInfoEntity that = (CommodityIngredientInfoEntity) o;
        return commodityIngredientInfoId == that.commodityIngredientInfoId &&
                mainCommodityInfoId == that.mainCommodityInfoId &&
                ingredientCommodityInfoId == that.ingredientCommodityInfoId &&
                Objects.equals(insertTime, that.insertTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commodityIngredientInfoId, mainCommodityInfoId, ingredientCommodityInfoId, insertTime);
    }
}
