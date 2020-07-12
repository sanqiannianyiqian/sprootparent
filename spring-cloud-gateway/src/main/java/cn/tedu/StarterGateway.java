package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Mangmang
 * @date 2020/2/10 21:16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class StarterGateway {
    public static void main(String[] args) {
        SpringApplication.run(StarterGateway.class, args);
    }
}
