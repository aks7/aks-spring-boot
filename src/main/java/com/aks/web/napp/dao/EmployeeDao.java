package com.aks.web.napp.dao;

import com.aks.web.napp.sql.bean.Employee;
import com.aks.web.napp.sql.bean.EmployeeSql;

public interface EmployeeDao {

	public Employee getEmpDetails(int empID);
	public Employee getEmpDetails_withObject(EmployeeSql emp);
	
}
