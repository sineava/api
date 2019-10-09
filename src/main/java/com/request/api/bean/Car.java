package com.request.api.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Car {
    private Integer id;
    private String name;
    private Date ctime;

    public Car(Integer id, String name, Date ctime) {
        this.id = id;
        this.name = name;
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JSONField(name="cname",format = "yyyy-MM-dd HH:mm:ss")
    public Date getDate() {
        return ctime;
    }

    public void setDate(Date ctime) {
        this.ctime = ctime;
    }
}
