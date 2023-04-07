package com.example.demo.controller;
import com.example.demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class test {
   @Autowired
  private RedisUtil redisUtil;
    @GetMapping(value ="/A")
    private String test(){
        System.out.println("到累了");
        redisUtil.set("1","aaaaaaaaa");
        System.out.println(redisUtil.get("1"));
        return null;
    };

}
