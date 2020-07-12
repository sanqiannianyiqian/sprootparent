package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Mangmang
 * @date 2020/2/8 20:48
 */
@SpringBootApplication
@MapperScan("cn.tedu.dao")
@EnableEurekaClient
public class StarterUser {
    public static void main(String[] args) {
        SpringApplication.run(StarterUser.class, args);
    }
}
