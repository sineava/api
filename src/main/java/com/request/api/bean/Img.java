package com.request.api.bean;

public class Img {
    private Integer id;
    private String title;
    private String img_url;
    private String zhaiyao;

    public Img(Integer id, String title, String img_url, String zhaiyao) {
        this.id = id;
        this.title = title;
        this.img_url = img_url;
        this.zhaiyao = zhaiyao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getZhaiyao() {
        return zhaiyao;
    }

    public void setZhaiyao(String zhaiyao) {
        this.zhaiyao = zhaiyao;
    }
}
