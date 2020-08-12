package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//进程将会以feign客户端启动
//测试git
public class StarterFeign {
    public static void main(String[] args) {
        SpringApplication.run(StarterFeign.class,args);
    }
}
