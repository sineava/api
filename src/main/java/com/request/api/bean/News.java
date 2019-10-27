package com.request.api.bean;

import java.util.List;

public class News<T> {
    private Integer status;
    private List<T> message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<T> getMessage() {
        return message;
    }

    public void setMessage(List<T> message) {
        this.message = message;
    }
}
