package me.whiteship.springinit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@TestPropertySource(properties = "keesun.name=keesun2")
@SpringBootTest(properties = "keesun.name=keesun3")
class SpringinitApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
		assertThat(environment.getProperty("keesun.name"))
				.isEqualTo("whiteship");
	}

}
