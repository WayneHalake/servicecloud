package com.example.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderCtr {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }

    //微服务列表
    @GetMapping("/listServices")
    public List<String> listServices(){
        return discoveryClient.getServices();
    }

}
