package com.aks.web.napp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aks.web.napp.dao.EmployeeDao;
import com.aks.web.napp.dao.impl.EmployeeDaoImpl;
import com.aks.web.napp.sql.bean.Employee;
import com.aks.web.napp.sql.bean.EmployeeSql;

@RestController
public class Controller {

	@RequestMapping(path = "/get-emp-details/{emp_id}", method = RequestMethod.GET)
	public String getEmpDetails(@PathVariable int emp_id) {

		EmployeeDao empDao = new EmployeeDaoImpl();
		Employee emp = empDao.getEmpDetails(100);
		System.out.println("debug point 1:::::::::::::::::::;");
		if (null != emp) {
			System.out.println(emp.toString());

			return emp.toString();
		}
		return null;
	}

	@RequestMapping("/tests")
	public String testMethod() {

		return "Hello";
	}

	@RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String home() {
		return "Nothing here. Go to <a href='/sample'>/sample</a>";
	}

	@RequestMapping(path = "/get-emp", method = RequestMethod.GET)
	public String getEmpDetails_Object() {

		EmployeeDao empDao = new EmployeeDaoImpl();
		EmployeeSql in_emp = new EmployeeSql();
		in_emp.setEmp_id(100);
		Employee emp = empDao.getEmpDetails_withObject(in_emp);
		System.out.println("debug point 1:::::::::::::::::::;");
		if (null != emp) {
			System.out.println(emp.toString());

			return emp.toString();
		}
		return null;
	}
}
