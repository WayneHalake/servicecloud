package com.example.consumer;

import com.example.myribbon.MyRibbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//自定义ribbon算法 注意××× 自定义的ribbon算法类不能在application所在包内，并且不能在其子包内 ×××
//@RibbonClient(name = "SERVICEPROVIDER", configuration = MyRibbon.class)
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
