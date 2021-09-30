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
 * EmployeeSaveController is use to save data in database 
 * @author madhav.machiwal
 *
 */
@Controller
@RequestMapping("/save")
public class EmployeeSaveController 
{

	EmployeeDaoImpl empdao = new EmployeeDaoImpl();

	@RequestMapping(method = RequestMethod.GET)
	public String newRegistration(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "enroll";
	}


	@RequestMapping(method = RequestMethod.POST)
	public String saveRegistration(@Valid Employee employee,BindingResult result, ModelMap model)
	{
		if (result.hasErrors()) 
		{
			return "enroll";
		}

		empdao.saveEmployee(employee);

		model.addAttribute("success", "Dear " + employee.getName() + " , your registration completed successfully");
		return "success";
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
		countries.add("U.A.E.");
		countries.add("England");
		return countries;
	}

}
