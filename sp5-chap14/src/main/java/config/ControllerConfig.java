package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import controller.*;
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
	
	@Bean
	public LogoutController logoutController() {
		return new LogoutController();
	}
	
	@Bean
	public ChangePwdController changePwdController() {
		return new ChangePwdController();
	}
	
	@Bean
	public MemberListController memberListController() {
		return new MemberListController();
	}
	
	@Bean
	public MemberDetailController memberDetailController() {
		return new MemberDetailController();
	}
}
