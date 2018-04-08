package com.aks.web.napp.sql.bean;

import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class Employee {
	
	private int emp_id;
	private String emp_name;
	private String emp_mob_no;
	private String emp_addr;
	private String emp_dept;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_mob_no() {
		return emp_mob_no;
	}
	public void setEmp_mob_no(String emp_mob_no) {
		this.emp_mob_no = emp_mob_no;
	}
	public String getEmp_addr() {
		return emp_addr;
	}
	public void setEmp_addr(String emp_addr) {
		this.emp_addr = emp_addr;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_mob_no=" + emp_mob_no + ", emp_addr="
				+ emp_addr + ", emp_dept=" + emp_dept + "]";
	}

}
