package com.jspiders.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.pojo.Employee;
import com.jspiders.springboot.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	EmpRepository empRepository;

	public Employee addEmp(Employee employee) {
		Employee emp = empRepository.save(employee);
		
		return emp;
		
		
	}

	public List<Employee> findAllEmp() {
		List<Employee> list = empRepository.findAll();
		return list;
		
	}

	public Employee findById(long id) {
		Optional<Employee> optional = empRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
		
	}

	public List<Employee> findBySalary(double salary) {
		
		List<Employee> emps = empRepository.findEmployeeBySalary(salary);
		return emps;
	}

	public Employee findByMobile(long mobile) {
		///return empRepository.findEmployeeByMobile(mobile);
		return empRepository.findEmployeeByMobile(mobile);
	}

}	

