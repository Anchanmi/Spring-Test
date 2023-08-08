package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

	@RequestMapping("/register/step1")
	public String handleStep1() {
		return "register/step1";
	}
	
	@PostMapping("/register/step2")
	public String handlestep2(@RequestParam(value = "agree", defaultValue = "false") Boolean agreeVal) {
		if(!agreeVal) {
			return "register/step1";
		}
		return "register.step2";
	}
}
