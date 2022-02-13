package cn.moozlee.serviceimpl;

import cn.moozlee.Hello;
import cn.moozlee.HelloService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServiceImpl2 implements HelloService {
    static {
        System.out.println("HelloServiceImpl2被创建");
    }

    @Override
    public String hello(Hello hello) {
        log.info("HelloServiceImpl2收到: {}.", hello.getMessage());
        String result = "Hello description is " + hello.getDescription();
        log.info("HelloServiceImpl2返回: {}.", result);
        return result;
    }
}
