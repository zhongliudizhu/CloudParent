package com.coolchatting.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "orderApp")
public interface FeginService {
    @GetMapping("/order/hello")
     Map<String,Object> getMap(@RequestParam("name") String name,
                               @RequestParam("age") int age);
    @PostMapping("/order/addOrder")
    String addOrder(@RequestBody Map<String,Object> map);
}


