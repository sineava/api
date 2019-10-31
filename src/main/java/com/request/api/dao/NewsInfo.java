package com.request.api.dao;

import com.request.api.bean.Comment;
import com.request.api.bean.GoodInfo;
import com.request.api.bean.Img;
import com.request.api.bean.NewInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NewsInfo {
    /**
     * 获取新闻资讯
     * @return
     */
    List<NewInfo> getNewInfo(Integer id);

    List<Comment> getComments(Integer id, Integer pageIndex);

    List<Img> getImagesByCateId(Integer id);

    List<GoodInfo> getGoods();
}
