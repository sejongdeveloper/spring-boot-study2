package me.whiteship.springinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private String hello;

    @Autowired
    private KeesunProperties keesunProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("=====================");
        logger.info(hello);
        logger.info(keesunProperties.getName());
        logger.info(keesunProperties.getFullName());
        logger.info("=====================");
    }
}
