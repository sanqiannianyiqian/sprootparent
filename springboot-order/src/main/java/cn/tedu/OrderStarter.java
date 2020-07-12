package cn.tedu;

import com.sun.org.apache.regexp.internal.RE;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mangmang
 * @date 2020/2/9 11:40
 */
@SpringBootApplication
@MapperScan("cn.tedu.dao")
@EnableEurekaClient
public class OrderStarter {
    public static void main(String[] args) {
        SpringApplication.run(OrderStarter.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate initRestTemplate() {
        return new RestTemplate();
    }
}
