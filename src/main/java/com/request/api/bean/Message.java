package com.request.api.bean;

import java.util.List;

public class Message<T> {
    private List<T> message;
    private Integer status;

    public List<T> getMessage() {
        return message;
    }

    public void setMessage(List<T> message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
