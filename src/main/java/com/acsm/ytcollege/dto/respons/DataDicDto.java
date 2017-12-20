package com.acsm.ytcollege.dto.respons;

import com.acsm.ytcollege.entity.DataDicItem;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 16:02 2017/12/19
 */
public class DataDicDto {
    @ApiModelProperty("字典ID")
    private Integer dicId;
    @ApiModelProperty("字典类型名称")
    private String dicName;
    @ApiModelProperty("字典项目")
    private List<DataDicItem> dataDicItemsList;

    public Integer getDicId() {
        return dicId;
    }

    public void setDicId(Integer dicId) {
        this.dicId = dicId;
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName;
    }

    public void setDataDicItemsList(List<DataDicItem> dataDicItemsList) {
        this.dataDicItemsList = dataDicItemsList;
    }

    public List<DataDicItem> getDataDicItemsList() {

        return dataDicItemsList;
    }
}
