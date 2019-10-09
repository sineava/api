package com.request.api.bean;

import java.util.List;

public class Product {
    private Integer status;
    private List<Car> msg;

    public Product(Integer status, List<Car> msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Car> getMsg() {
        return msg;
    }

    public void setMsg(List<Car> msg) {
        this.msg = msg;
    }
}
