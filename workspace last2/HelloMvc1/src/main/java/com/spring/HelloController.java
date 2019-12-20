package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView sayHello(){
		return new ModelAndView("resultpage",
				"message","Welcome  the Spring");
		
	}
	@RequestMapping("/about")
	public ModelAndView sayAbout(){
		return new ModelAndView("about");
		
	}
	@RequestMapping("/contact")
	public ModelAndView sayContact(){
		return new ModelAndView("contact");
		
	}
	@RequestMapping("/priya")
	public ModelAndView sayPriya(){
		return new ModelAndView("priya");
		
	}
}
