package com.aks.web.napp.sql.bean;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class EmployeeSql extends Employee implements SQLData {

	@Override
	public String getSQLTypeName() throws SQLException {
		// TODO Auto-generated method stub
		return "EMP";
	}

	@Override
	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeInt(getEmp_id());
		stream.writeString(null);
		stream.writeString(null);
		stream.writeString(null);
		stream.writeString(null);
		
	}
	
	
}
