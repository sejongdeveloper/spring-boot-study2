package me.whiteship.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringinitApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringinitApplication.class);
		app.addListeners(new SampleListener());
		app.run(args);
	}

}
