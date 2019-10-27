package com.request.api.bean;

import java.util.Date;

public class New {
    private Integer id;
    private Date addTime;
    private Integer click;
    private String imgUrl;
    private String title;
    private String zhaiyao;

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getZhaiyao() {
        return zhaiyao;
    }

    public void setZhaiyao(String zhaiyao) {
        this.zhaiyao = zhaiyao;
    }

    public New(Integer id, Integer click, String imgUrl, String title, String zhaiyao,Date addTime) {
        this.id = id;
        this.click = click;
        this.imgUrl = imgUrl;
        this.title = title;
        this.zhaiyao = zhaiyao;
        this.addTime = addTime;
    }
}
