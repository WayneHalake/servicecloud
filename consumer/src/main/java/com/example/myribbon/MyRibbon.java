package com.example.myribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义ribbon服务调用方法
 */
@Configuration
public class MyRibbon {

    @Bean
    public IRule getMyRibbon(){
        return new MyIRule(); // 自定义的服务调用算法逻辑
        //return new RandomRule();
    }
}
