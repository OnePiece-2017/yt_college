package com.acsm.ytcollege.dto.respons;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 16:07 2017/12/19
 */
public class DataDicListDto {
    @ApiModelProperty("字典类别集合")
    private List<DataDicDto> dataDicDtoList;

    public List<DataDicDto> getDataDicDtoList() {
        return dataDicDtoList;
    }

    public void setDataDicDtoList(List<DataDicDto> dataDicDtoList) {
        this.dataDicDtoList = dataDicDtoList;
    }
}
