package me.whiteship.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {

    @Autowired
    KeesunProperties keesunProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=======================");
        System.out.println(keesunProperties.getName());
        System.out.println(keesunProperties.getAge());
        System.out.println("=======================");
    }
}
