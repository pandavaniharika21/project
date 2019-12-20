package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {
	
	@RequestMapping("/name")
	public ModelAndView calc(HttpServletRequest req,HttpServletResponse res){
		String firstName,lastName,fullName;
		firstName=req.getParameter("firstName");
		lastName=req.getParameter("lastName");
		fullName=firstName+ " " +lastName;
		String result="";
		result+=fullName;
		return new ModelAndView("result","result",result);
		
	}
	

}
