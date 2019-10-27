package com.request.api.service;

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
}
