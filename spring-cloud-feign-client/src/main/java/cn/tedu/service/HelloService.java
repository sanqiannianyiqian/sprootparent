package cn.tedu.service;

import com.sun.org.glassfish.gmbal.DescriptorFields;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign作为负载均衡调用服务客户端
 * 可以通过注解形式实现底层代码封装
 * 不需要手动编写http请求代码不用写restTemplate
 * 配合Springmvc的注解实现
 * d
 */
//这个微服务去掉用其他微服务
@FeignClient("service-hi")//表示该接口交给feign组件
//实现底层逻辑，并且该接口的实现类中，所有方法都需要
//访问service-hi这个服务
public interface HelloService {
    /*
    即使使用注解实现访问服务指定，service-hi，对着服务后端
    提供者中这可能有好几个访问的接口
    service-hi/hello
    service-hi/haha
    service-hi/kaka
    springmvc注解实现更详细的请求
    方法定义
    @RequestMapping 定义uri method
    实现方法：restTemplate.getForObject("http://service-hi/client/hello")
    @RequestParam 定义请求参数
    实现方法：restTemplate.getForObject("http://service-hi/client/hello?name="+name,String.class)
     */
    @RequestMapping(value="/client/hello",method = RequestMethod.GET)
    String sayHi(@RequestParam("name") String name);
    //这个接口中的所有方法，都和被访问的工程中的controller方法
    //完全一致
    /*
    @RequestMapping(value="/client/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name){
     */
}
