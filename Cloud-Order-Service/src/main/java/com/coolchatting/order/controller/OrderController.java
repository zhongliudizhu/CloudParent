package com.coolchatting.order.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/hello")
    public Map<String,Object> getMap(String name,int age){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name",name);
        map.put("age",age);
        return map;

    }
    @PostMapping("/addOrder")
    String addOrder(@RequestBody() Map<String,Object> map){
         return  map.get("name").toString();
    }

}
