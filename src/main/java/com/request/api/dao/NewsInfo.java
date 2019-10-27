package com.request.api.dao;

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
}
