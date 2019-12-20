package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employee")
@Controller
public class EmployeeController {
	@RequestMapping("/registerForm")
	public String bookingForm(Model model)
	{
		Employee res=new Employee();
		model.addAttribute("employee",res);
		return "registeremployee";
		
	}
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("employee") Employee res)
	{
		return "confirmationform";
	}

}
