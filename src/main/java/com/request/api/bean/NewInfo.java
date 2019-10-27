package com.request.api.bean;

import java.util.Date;

/**
 * 新闻资讯
 */
public class NewInfo {
    private Integer id;
    private String title;
    private Integer click;
    private Date addTime;
    private String content;

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

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NewInfo(Integer id, String title, Integer click, Date addTime, String content) {
        this.id = id;
        this.title = title;
        this.click = click;
        this.addTime = addTime;
        this.content = content;
    }
}
