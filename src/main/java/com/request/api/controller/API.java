package com.request.api.controller;

import com.alibaba.fastjson.JSON;
import com.request.api.bean.Car;
import com.request.api.bean.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class API {

    private static List<Car> list = new ArrayList<>();
    /**
     * id auto increment starting number
     */
    private static Integer id = 2;

    static {
        list.add(new Car(1,"奔驰", new Date()));
        list.add(new Car(2,"保时捷",new Date()));
    }

    @GetMapping("/getprodList")
    public String getprodList() {
        return JSON.toJSONString(new Product(0,list));
    }

    @PostMapping("/addproduct")
    public String addproduct(String name) {
        list.add(new Car(++id,name,new Date()));
        return JSON.toJSONString(new Product(0,list));
    }

    @DeleteMapping("/removeproduct/{id}")
    public String removeproduct(@PathVariable("id") Integer id) {
        if(!list.isEmpty()) {
            for(Car car : list) {
                if(Objects.equals(car.getId(),id)) {
                    list.remove(car);
                    break;
                }
            }
        }
        if(list.isEmpty()) {return null;}
        return JSON.toJSONString(new Product(0,list));
    }
}
