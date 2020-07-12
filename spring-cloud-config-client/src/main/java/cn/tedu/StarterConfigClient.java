package cn.tedu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mangmang
 * @date 2020/2/29 21:21
 */
@SpringBootApplication
@RestController
public class StarterConfigClient {
    //这个client只是为了试验从configserver获取数据,实际中的configclient就是各个服务模块
    //验证读取到的properties属性在本地工程能否
    //正常使用
   /* @Value("${date}")
    private String date;
    @Value("${profile}")
    private String rand;*/
    @Value("${asdfa}")
    private  String date;//不能直接给静态变量复制,输出为null
    @Value("${asdfa}")
    private  String date2;//输出有值
    public static void main(String[] args) {
        SpringApplication.run(StarterConfigClient.class,args);
    }
    @RequestMapping("profile")
    public String profile(){
        return date+" "+date2;//结果表明,如果配置了远程将会覆盖本地
    }

}
