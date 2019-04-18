package com.imooc.framework;

import com.imooc.framework.ioc.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FrameworkApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(FrameworkApplication.class, args);
        Person person = ctx.getBean(Person.class);
        System.out.println("name is "+person.getName());
        person.call();
    }

}
