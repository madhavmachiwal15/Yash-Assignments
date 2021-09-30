package com.yash.ems.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.model.Employee;

/**
 * EmployeeUpdateController is use to update data in database 
 * @author madhav.machiwal
 *
 */
@Controller
@RequestMapping("/update")
public class EmployeeUpdateController 
{
	/**
	 * create instance of EmployeeDaoImpl
	 */
	EmployeeDaoImpl empdao = new EmployeeDaoImpl();

	@RequestMapping(method = RequestMethod.GET)
	public String newRegistration(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "updateform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveRegistration(Employee employee, ModelMap model)
	{
		empdao.updateEmployee(employee);
		
		model.addAttribute("success", "Dear " + employee.getName() + " , your record updated successfully");
		return "successupdation";
	}
	
	/**
	 * Model attribute to show list of department on jsp page
	 * @return
	 */
	@ModelAttribute("department")
	public List<String> initializeDepartments()
	{
		List<String> department = new ArrayList<String>();
		department.add("IT");
		department.add("HR");
		department.add("Technical");
		department.add("Testing");
		department.add("Accounts");
		return department;
	}
	

	/**
	 * Model attribute to show list of countries on jsp page
	 * @return
	 */
	@ModelAttribute("countries")
	public List<String> initializeCountries()
	{
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("U.S.");
		countries.add("Australia");
		countries.add("U.A.E");
		countries.add("England");
		return countries;
	}
	

	
}
