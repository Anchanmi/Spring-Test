package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import controller.RegisterController;
import controller.LoginController;
import survey.SurveyController;

@Configuration
public class ControllerConfig {

	@Bean
	public RegisterController registerController() {
		return new RegisterController();
	}
	
	@Bean
	public SurveyController surveyController() {
		return new SurveyController();
	}
	@Bean
	public LoginController loginController() {
		return new LoginController();
	}
	
}
