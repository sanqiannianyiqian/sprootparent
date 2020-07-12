package cn.tedu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mangmang
 * @date 2020/2/10 13:23
 */
@Service
public class RibbonService {
@Autowired
    private RestTemplate restTemplate;

 /*   public String sayHello(String name) {
        //需要在业务层想办法调用service-hi的功能
        //通过治理组件注册发现，可以直接调用service-hi
        String url="http://service-hi/client/hello?name="+name;
        //result hello i am from 9001/9002
       return restTemplate.getForObject(url,String.class);
    }*/
    /*
        引入服务降级的处理逻辑
     */
    @HystrixCommand(fallbackMethod = "error")//断路或者故障后
    //fallback回调方法 方法名称error，需要根据配置名称
    //在本类中实现一个和调用方法结构完全一致的方法
    public String sayHello(String name){
        //需要在业务层想办法调用service-hi的功能
        //通过治理组件注册发现，可以直接调用service-hi
        String result= restTemplate.getForObject
                ("http://service-hi/client/hello?name="+name,
                        String.class);
        //result hello i am from 9001/9002
        return result;
    }
    //服务降级后备用调用方法
    @HystrixCommand(fallbackMethod = "sayHi")
    public String error(String name){
        //可以在这个方法里编写备用逻辑，连接备用
        //数据库，备用redis
        //需要在业务层想办法调用service-hi的功能
        //通过治理组件注册发现，可以直接调用service-hi
        String result= restTemplate.getForObject
                ("http://service-hi/client/hello?name="+name,
                        String.class);
        //result hello i am from 9001/9002
        return result;
    }
}
