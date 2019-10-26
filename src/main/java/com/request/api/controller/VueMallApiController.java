package com.request.api.controller;

import com.alibaba.fastjson.JSON;
import com.request.api.bean.Image;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * vue商场项目api
 */
@RestController
@RequestMapping("/mall")
@CrossOrigin
public class VueMallApiController {
    private List<String> img_list = new ArrayList<>();

    {
        img_list.add("https://img.alicdn.com/tfs/TB1ZbJ4j7L0gK0jSZFxXXXWHVXa-520-280.jpg_q90_.webp");
        img_list.add("https://aecpm.alicdn.com/simba/img/TB1XotJXQfb_uJkSnhJSuvdDVXa.jpg");
        img_list.add("https://aecpm.alicdn.com/simba/img/TB1JNHwKFXXXXafXVXXSutbFXXX.jpg");
    }

    @GetMapping("/getlunbotu")
    public String getLunBoTu() {
        Image img = new Image();
        try {
            img.setStatus(1);
            img.setMsg(img_list);
        } catch (Exception e) {
            img.setStatus(0);
            img.setMsg(null);
        }
        return JSON.toJSONString(img);
    }
}
