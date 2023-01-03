package me.whiteship.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringinitApplication {

	@ConfigurationProperties("server")
	@Bean
	public ServerProperties serverProperties() {
		return new ServerProperties();
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringinitApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
