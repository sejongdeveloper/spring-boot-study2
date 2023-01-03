package me.whiteship.springinit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {

    @Value("${keesun.fullName}")
    private String fullName;
    @Value("${keesun.name}")
    private String name;

    @Value("${keesun.age}")
    private int age;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=======================");
        System.out.println(fullName);
        System.out.println(name);
        System.out.println(age);
        System.out.println("=======================");
    }
}
