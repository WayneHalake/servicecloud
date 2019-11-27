package com.example.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //开启ribbon客户端负载均衡   默认使用轮询算法
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //设置ribbon的负载均衡算法
//    @Bean
//    public IRule getRule(){
//        //return new RoundRobinRule(); //轮询算法
//
//        //retrun new RetryRule(); //重试算法-- 在尝试过数次失败之后，将会将不会再访问的失败的微服务
//        return new RandomRule();  //随机算法
//    }


}
