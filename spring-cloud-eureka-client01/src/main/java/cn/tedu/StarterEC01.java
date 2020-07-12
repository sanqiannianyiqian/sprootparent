package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Mangmang
 * @date 2020/2/9 15:52
 */
@SpringBootApplication
@EnableEurekaClient
public class StarterEC01 {
    public static void main(String[] args) {
        SpringApplication.run(StarterEC01.class, args);
    }
}
