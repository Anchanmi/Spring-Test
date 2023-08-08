package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import controller.RegisterController;

@Configuration
public class ControllerConfig {

	@Bean
	public RegisterController registerController() {
		return new RegisterController();
	}
	
}
