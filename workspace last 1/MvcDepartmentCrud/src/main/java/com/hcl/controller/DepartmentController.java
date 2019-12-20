package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.beans.Department;
import com.hcl.dao.DepartmentDao;



@Controller
public class DepartmentController {
	@Autowired
	DepartmentDao dao;
	
	 @RequestMapping(value="/deletedepartment/{id}",
			 method = RequestMethod.GET)  
	    public String delete(@PathVariable int id){  
	        dao.delete(id);  
	        return "redirect:/viewdepartment";  
	    }   
	
	  @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("dept") Department dept){  
        dao.update(dept);  
        return "redirect:/viewdepartment";  
    }  
	@RequestMapping(value="/editdepartment/{id}")
	public String edit(@PathVariable int id,Model m) {
		  Department dept=dao.getdeptById(id);  
	        m.addAttribute("command",dept);
	        return "departmenteditform";  
	    }  
	
	
	@RequestMapping("/departmentform")
	public String showform(Model m) {
		m.addAttribute("command", new Department());
		return "departmentform";
		
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("dept") Department dept){
		dao.save(dept);
		return "redirect:/viewdepartment";
		
	}
	
	@RequestMapping("/viewdepartment")
	public String viewemp(Model m) {
		List<Department> list=dao.getDepartment();
		m.addAttribute("list",list);
		return "viewdepartment";
		
	}

}


	


