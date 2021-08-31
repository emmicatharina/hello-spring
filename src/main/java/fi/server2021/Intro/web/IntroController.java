package fi.server2021.Intro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IntroController {
	@RequestMapping("index")
	@ResponseBody
	public String showIndex() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String returnWelcome(@RequestParam(name="name") String name, 
			@RequestParam(name="location") String location) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
