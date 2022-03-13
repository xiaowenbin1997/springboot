package com.example;

import com.example.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Cha10containerApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(Cha10containerApplication.class, args);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        UserService service = (UserService) ac.getBean("userService");
        System.out.println();
        service.sayHello("李四");
    }

}
