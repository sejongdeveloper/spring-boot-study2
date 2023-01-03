package me.whiteship.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(KeesunProperties.class)
public class SpringinitApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringinitApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
