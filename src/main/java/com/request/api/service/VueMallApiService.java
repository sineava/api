package com.request.api.service;

import com.github.pagehelper.PageHelper;
import com.request.api.bean.Comment;
import com.request.api.bean.GoodInfo;
import com.request.api.bean.Img;
import com.request.api.bean.NewInfo;
import com.request.api.dao.NewsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueMallApiService {
    @Autowired
    NewsInfo newsInfo;

    public List<NewInfo> getNewInfo(Integer id) {
        return newsInfo.getNewInfo(id);
    }

    public List<Comment> getComments(Integer id, Integer pageIndex) {
        return newsInfo.getComments(id,pageIndex);
    }

    public List<Img> getImagesByCateId(Integer id) {
        return newsInfo.getImagesByCateId(id);
    }

    public List<GoodInfo> getGoods(Integer pageindex) {
        //每页2条数据
        PageHelper.startPage(pageindex,10);
        return newsInfo.getGoods();
    }
}
