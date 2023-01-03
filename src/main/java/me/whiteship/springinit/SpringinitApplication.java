package me.whiteship.springinit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringinitApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(SpringinitApplication.class)
				.run(args);
	}

}
