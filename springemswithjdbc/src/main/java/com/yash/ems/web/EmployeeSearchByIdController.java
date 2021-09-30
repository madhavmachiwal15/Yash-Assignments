package com.yash.ems.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.yash.ems.serviceimpl.EmployeeServiceImpl;
import com.yash.ems.model.Employee;

/**
 * EmployeeSearchByIdController is ude to search employees details by their id
 * @author madhav.machiwal
 *
 */
@Controller
@RequestMapping("/searchbyid")
public class EmployeeSearchByIdController 
{
	EmployeeServiceImpl empser = new EmployeeServiceImpl();

	@RequestMapping(method = RequestMethod.GET)
	public String searchpage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "searchbyid";
	}


	@RequestMapping(method = RequestMethod.POST)
	public String searchEmp(Employee employee,BindingResult result, ModelMap model)
	{
		int empid = (int) employee.getId();
		Employee e = empser.searchEmployeeById(empid);
		model.addAttribute("employee", e);
		model.addAttribute("success", "Record found !!!");
		return "success";


	}
}
