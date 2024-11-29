package com.jspiders.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.springboot.pojo.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{

	List<Employee> findEmployeeBySalary(double salary);

	Employee findEmployeeByMobile(long mobile);

	



}
