package com.yash.ems.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.model.Employee;

/**
 * EmployeeDeleteController delete the data from employee Database through the employee id
 * @author madhav.machiwal
 *
 */
@Controller
@RequestMapping("/delete")
public class EmployeeDeleteController 
{
	EmployeeDaoImpl empdao = new EmployeeDaoImpl();
	
	@RequestMapping(method = RequestMethod.GET)
	public String deletepage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "delete";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String deleteEmp(Employee employee,BindingResult result, ModelMap model)
	{
		int empid = (int) employee.getId();
		empdao.deleteEmployee(empid);

		model.addAttribute("success", " Record has been deleted successfully");
		return "successdeletion";
	}

}
