package com.acsm.traceapi.dto.response;

import com.acsm.traceapi.domain.TraceNode;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by LiYu on 2018/4/13.
 */
public class TraceDto {

    @ApiModelProperty("追溯节点列表")
    private List<TraceNode> nodeList;

    public List<TraceNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<TraceNode> nodeList) {
        this.nodeList = nodeList;
    }
}
