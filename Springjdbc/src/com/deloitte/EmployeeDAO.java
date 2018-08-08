package com.deloitte;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//insert a row, need object of employee
	public void insertRow(Employee emp)
	{
		int eid=emp.getEmployeeId();
		String ename= emp.getEmployeeName();
		int did= emp.getDepartmentId();
		String sql="INSERT INTO EMPLOYEE2 VALUES("+eid+",'"+ename+"',"+did+")";
		int rows=jdbcTemplate.update(sql);
		if(rows>0)
			System.out.println("Successfully Inserted");
		else
			System.out.println("Not inserted, Problem");
	}
	public void deleterow(Employee emp)
	{
		String ename= emp.getEmployeeName();
		String sql="DELETE FROM EMPLOYEE2  WHERE empname='"+ename+"'";
		jdbcTemplate.execute(sql);
		System.out.println("Record deleted successfully");
		
	}
	public void insetMultipleRows(ArrayList emplist)
	{
		Iterator it= emplist.iterator();
		while(it.hasNext())
		{
			Employee emp=(Employee)it.next();
			
		int eid= emp.getEmployeeId();
		String ename= emp.getEmployeeName();
		int did= emp.getDepartmentId();
		String sql="INSERT INTO EMPLOYEE2 VALUES("+eid+",'"+ename+"',"+did+")";
		jdbcTemplate.update(sql);
     	System.out.println("Records inserted successfully");
		}
		
		
	}
	public void updatrow(Employee emp)
	{
		int eid= emp.getEmployeeId();
		String ename= emp.getEmployeeName();
		int did= 9;
		String sql="update  EMPLOYEE1 set empname='"
		+ename+"'"+",deptid="+did+" where empid="+eid;
		int rows=jdbcTemplate.update(String.format(sql));
		if(rows>0)
			System.out.println("Updated");
		else
			System.out.println("Not updated");
		
	}
	public List<Employee> readAllEmployees()
	{
		List <Employee>allEmployees;
		String sql="select * from employee2";
		allEmployees= jdbcTemplate.query(sql, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				int eid=rs.getInt(1);
				String ename= rs.getString(2);
				int did= rs.getInt(3);
				Employee e= new Employee();
				e.setEmployeeId(eid);
				e.setEmployeeName(ename);
				e.setDepartmentId(did);
				return e;
				
			}
			
		});
		return allEmployees;
	}

}
