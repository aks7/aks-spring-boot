package com.aks.web.napp.dao.impl;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.aks.web.napp.configuration.RepositoryConfig;
import com.aks.web.napp.dao.EmployeeDao;
import com.aks.web.napp.sql.bean.Employee;
import com.aks.web.napp.sql.bean.EmployeeSql;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	DataSource dataSource=new RepositoryConfig().getDataSource_Oracle();
	
	private SimpleJdbcCall simpleJdbcCall;
	

	@Override
	public Employee getEmpDetails(int in_emp_id) {
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("get_emp_details");
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_emp_id", in_emp_id);
		System.out.println("debug point 2:::::::::::::::::::;");
		Map<String, Object> out =simpleJdbcCall.execute(in);
		
		Employee employee=new Employee();
		System.out.println("debug point 3:::::::::::::::::::;");
		employee.setEmp_id(in_emp_id);
		employee.setEmp_name((String)out.get("out_emp_name"));
		employee.setEmp_mob_no((String)out.get("out_emp_mob_no"));
		employee.setEmp_addr((String)out.get("out_emp_addr"));
		employee.setEmp_dept((String)out.get("out_emp_dept"));
		
		
		return employee;
	}


	@Override
	public Employee getEmpDetails_withObject(EmployeeSql emp) {
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("get_emp_details1");
		SqlParameterSource in = new MapSqlParameterSource().addValue("emp_object", emp);
		Map<String, Object> out =simpleJdbcCall.execute(in);
		
		Employee employee=new Employee();
		employee.setEmp_id(emp.getEmp_id());
		employee.setEmp_name((String)out.get("out_emp_name"));
		employee.setEmp_mob_no((String)out.get("out_emp_mob_no"));
		employee.setEmp_addr((String)out.get("out_emp_addr"));
		employee.setEmp_dept((String)out.get("out_emp_dept"));
		
		
		return employee;
	}

}
