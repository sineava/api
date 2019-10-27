package com.request.api.controller;

import com.alibaba.fastjson.JSON;
import com.request.api.bean.NewInfo;
import com.request.api.service.VueMallApiService;
import com.request.api.bean.Image;
import com.request.api.bean.New;
import com.request.api.bean.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * vue商场项目api
 * @author lsj
 */
@RestController
@RequestMapping("/mall")
@CrossOrigin
public class VueMallApiController {
    private List<String> img_list = new ArrayList<>();
    private List<New> news_list = new ArrayList<>();

    @Autowired VueMallApiService vueMallApiService;

    {
        img_list.add("https://img.alicdn.com/tfs/TB1ZbJ4j7L0gK0jSZFxXXXWHVXa-520-280.jpg_q90_.webp");
        img_list.add("https://aecpm.alicdn.com/simba/img/TB1XotJXQfb_uJkSnhJSuvdDVXa.jpg");
        img_list.add("https://aecpm.alicdn.com/simba/img/TB1JNHwKFXXXXafXVXXSutbFXXX.jpg");
    }

    {
        news_list.add(new New(1,0,
                "https://n.sinaimg.cn/news/crawl/114/w550h364/20191026/44e6-ihmipqw7746769.jpg","愿他们安息！", "英国大货车发现39具尸体案 有三个最新进展",new Date()));
        news_list.add(new New(2,0,
                "https://inews.gtimg.com/newsapp_bt/0/9560205239/1000","小米上新","MIUI 11 正式版推送机型再增一员，这次是小米 CC 9",new Date()));
        news_list.add(new New(3,3,
                "http://www.puercn.com/ckeditor_assets/entry_cover/260647/thumb_5.jpg","注意","\t\n" +
                "选对一把好的紫砂壶，才对得起我那泡陈年的大益茶！",new Date()));
        news_list.add(new New(4,1,
                "http://news.cnr.cn/native/lmgd/20191025/W020191025463133199968.png","5G与IoT成果再落地","\t\n" +
                "华为5G终端及全场景新品发布会隆重举行",new Date()));
        news_list.add(new New(5,7,
            "https://www.apple.com/newsroom/images/product/os/macos/standard/Apple_macOS-catalina-available-today_100719_big.jpg.large.jpg","macOS Catalina 今日正式发布","\t\n" +
            "带来适用于 Mac 的全新娱乐 App 以及可利用 iPad 扩展 Mac 工作空间的随航功能\n" +
            "\n",new Date()));
        news_list.add(new New(6,2,
                "http://img.cnmo-img.com.cn/1679_600x1000/1678025.jpg","Android9","\t\n" +
                "由于碎片化现象依然严重 Android 9安装率仅有22.6%" +
                "\n",new Date()));
        news_list.add(new New(7,9,
                "http://img.cnmo-img.com.cn/1677_600x1000/1676994.jpg","DxOMark","\t\n" +
                "公布谷歌Pixel 4相机得分 你猜这次排第几？" +
                "\n",new Date()));
        news_list.add(new New(8,0,
                "http://img.cnmo-img.com.cn/1676_600x1000/1675559.jpg","OPPO 5G手机将至","\t\n" +
                "沈义人：年底首发高通双模5G手机" +
                "\n",new Date()));
        news_list.add(new New(9,2,
                "https://inews.gtimg.com/newsapp_bt/0/10610774478/1000","三星Galaxy S11","\t\n" +
                "三星和华为已经成为苹果在智能手机领域的主要竞争对手" +
                "\n",new Date()));
        news_list.add(new New(10,1,
                "https://inews.gtimg.com/newsapp_bt/0/10606698556/1000","人机交互","\t\n" +
                "华为MateX手机最让人期待的功能其实是人机交互，实现了一心多用" +
                "\n",new Date()));
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

    @GetMapping("/getnewslist")
    public String getNewsList() {
        News news = new News();
        try {
            news.setMessage(news_list);
            news.setStatus(1);
        } catch (Exception e) {
            news.setMessage(null);
            news.setStatus(0);
        }
        return JSON.toJSONString(news);
    }

    @GetMapping("/getnew/{id}")
    public String getNew(@PathVariable("id") Integer id) {
        List<NewInfo> info = new ArrayList<>();
        News news = new News();
        try {
            info = vueMallApiService.getNewInfo(id);
            news.setMessage(info);
            news.setStatus(1);
        } catch (Exception e) {
            news.setMessage(null);
            news.setStatus(0);
        }
        return JSON.toJSONString(news);
    }
}
