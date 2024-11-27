package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@Controller
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String insertEmployee(Model mod) {
		Employee em=new Employee();
		em.setId(1);em.setName("Mohan");em.setDesgination("COO");em.setExperience("2yr");
		em.setDepartment("Java");
		Employee emp=employeeService.saveEmployee(em);
		String msg="Employee : "+emp.getId()+" "+emp.getName()+" Saved";
		mod.addAttribute("Employee",emp);
		mod.addAttribute("message", msg);
		return "home";
	}
	

//	@PostMapping("/")
//	public String insertEmployee1() {
//		Employee em=new Employee();
//		em.setId(1);em.setName("Mohan");em.setDesgination("COO");em.setExperience("2yr");
//		em.setDepartment("Java");
//		Employee emp=employeeService.saveEmployee(em);
//		
//		return "Employee : "+emp.getId()+" "+emp.getName()+" Saved";
//	}
}
