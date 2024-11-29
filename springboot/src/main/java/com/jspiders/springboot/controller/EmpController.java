package com.jspiders.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.pojo.Employee;
import com.jspiders.springboot.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;

	@PostMapping(path = "addemployee")
	public Object addEmployee(@RequestBody Employee employee) {
		Employee emp = empService.addEmp(employee);
		if (emp != null) {
			return emp;
		} else {
			return "Employee Not Added";
		}

	}

	@GetMapping(path = "showall")
	public Object findAllEmp() {

		List<Employee> allEMp = empService.findAllEmp();

		if (allEMp != null) {
			return allEMp;
		} else {
			return "Employyee Not Founded";
		}

	}

	@GetMapping(path = "findbyid")
	public Object findEmpByid(@RequestParam(name = "id") long id) {
		System.out.println("Employee");
		Employee employee = empService.findById(id);
		System.out.println(employee);
		if (employee != null) {
			return employee;
		} else {
			return "Employee Not Found";
		}

	}

	@GetMapping(path = "findBySalary")
	public Object findBySalary(@RequestParam(name = "salary") double salary) {

		List<Employee> emps = empService.findBySalary(salary);

		if (emps.size() > 0) {
			return emps;
		} else {
			return "Employees Not Founded";

		}

	}
	@GetMapping(path = "findByMobile")
	public Object findByMobile(@RequestParam(name = "mobile") long mobile) {
		Employee emp = empService.findByMobile(mobile);
		if (emp != null) {
			return emp;
		} else {
			return "Mobile Number Not Found";
		}
	}

}
