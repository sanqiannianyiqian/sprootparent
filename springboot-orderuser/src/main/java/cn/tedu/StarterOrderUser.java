package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mangmang
 * @date 2020/2/8 20:48
 */
@SpringBootApplication
@MapperScan("cn.tedu.dao")
public class StarterOrderUser {
    public static void main(String[] args) {
        SpringApplication.run(StarterOrderUser.class, args);
    }
}
