package cn.tedu.service;

/**
 * @author Mangmang
 * @date 2020/2/6 21:35
 */

import org.springframework.stereotype.Service;

/**
 * 之前代码使用接口，实现松耦合，注入实现类
 * 完成所有业务层代码编写，互联网框架课程都是
 * 直接在实现类上添加service注解完成
 */
@Service
public class IndexService {
    public String sayHi(String name){
        return "hello spring boot i am "+name;
    }
}
