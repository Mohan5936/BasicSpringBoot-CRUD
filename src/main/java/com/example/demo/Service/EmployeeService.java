package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	Employee findById(int id);
	List<Employee> findAll();
}
