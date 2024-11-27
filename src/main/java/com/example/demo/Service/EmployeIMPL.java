package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeIMPL implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRes;

	@Override
	public Employee saveEmployee(Employee emp) {
		return empRes.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return empRes.save(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {

	}

	@Override
	public Employee findById(int id) {
		return empRes.findById(id).get();
	}

	@Override
	public List<Employee> findAll() {
		return empRes.findAll();
	}

}
