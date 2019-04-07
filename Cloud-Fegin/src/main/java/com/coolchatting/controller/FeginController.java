package com.coolchatting.controller;

import com.alibaba.fastjson.JSON;
import com.coolchatting.fegin.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FeginController {
    @Autowired
    private FeginService service;
    @GetMapping("/fegin")
    public String doFegin(@RequestParam(value = "name",defaultValue = "ss") String name,
                          @RequestParam(defaultValue = "11") int age){
        Map<String, Object> map = service.getMap(name,age);
        String s = JSON.toJSONString(map);
        return s;
    }

    @PostMapping("/addOrder")
    public String addOrder(){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name","ewew");
        map.put("age",60);
        String s = service.addOrder(map);
        return s;
    }


}


