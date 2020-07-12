package cn.tedu;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Mangmang
 * @date 2020/2/6 21:14
 */
@SpringBootApplication
@MapperScan("cn.tedu.dao")//指定扫描mapper接口的包名称
public class StarterDemo01 {
    public static void main(String[] args) {
        //调用springboot的静态run方法传递当前启动类
        //反射对象
        SpringApplication.run(StarterDemo01.class,args);
    }
}
