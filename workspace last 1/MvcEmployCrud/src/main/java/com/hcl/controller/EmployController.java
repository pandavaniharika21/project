package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.beans.Employ;
import com.hcl.dao.EmployDao;

@Controller
public class EmployController {
	@Autowired
	EmployDao dao;
	
	 @RequestMapping(value="/deleteemploy/{id}",
			 method = RequestMethod.GET)  
	    public String delete(@PathVariable int id){  
	        dao.delete(id);  
	        return "redirect:/viewemploy";  
	    }   
	
	  @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("emp") Employ emp){  
        dao.update(emp);  
        return "redirect:/viewemploy";  
    }  
	@RequestMapping(value="/editemploy/{id}")
	public String edit(@PathVariable int id,Model m) {
		  Employ emp=dao.getEmpById(id);  
	        m.addAttribute("command",emp);
	        return "employeditform";  
	    }  
	
	
	@RequestMapping("/employform")
	public String showform(Model m) {
		m.addAttribute("command", new Employ());
		return "employform";
		
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("emp") Employ emp){
		dao.save(emp);
		return "redirect:/viewemploy";
		
	}
	
	@RequestMapping("/viewemploy")
	public String viewemp(Model m) {
		List<Employ> list=dao.getEmployees();
		m.addAttribute("list",list);
		return "viewemploy";
		
	}

}
