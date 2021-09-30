package com.yash.ems.web;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.model.Employee;

/**
 * EmployeeListController is used to fetch data from database
 * @param model
 * @return
 */
@Controller
@RequestMapping("/list")
public class EmployeeListController 
{
	EmployeeDaoImpl empdao = new EmployeeDaoImpl();
	
	@RequestMapping(method = RequestMethod.GET)
	public String getList(ModelMap model) 
	{
		List<Employee> emplist = empdao.getEmployeeList();
		model.addAttribute("emplist", emplist);
		return "empllist";
	}
	
}
