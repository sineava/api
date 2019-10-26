package com.request.api.bean;

import java.util.List;

/**
 * 图片资源
 */
public class Image {

    private List<String> msg;
    private Integer status;

    public List<String> getMsg() {
        return msg;
    }

    public void setMsg(List<String> msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
