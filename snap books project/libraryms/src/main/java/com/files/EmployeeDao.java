package com.files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
public class EmployeeDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	
	public Connection createconnection()
	{
		try {
			// create connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// make connection
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Lalit@123");
			
			System.out.println("connection created");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public Employee checklogin(String uid, String upass)
	{
		Employee emp=null;
		
		try {
			con=createconnection();
			ps=con.prepareStatement("select * from admin where uid=? and upass=?");
			ps.setString(1, uid);
			ps.setString(2, upass);
			
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				emp=new Employee();
				emp.setName(rs.getString(1));
				emp.setUid(rs.getString(2));
				emp.setUpass(rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	
	public int addemployee(Properties props)
	{
		int status=0;
		
		
		con=createconnection();
		try {
			Employee emp=null;
			ps=con.prepareStatement("insert into admin values(?,?,?)");
			ps.setString(1, props.getProperty("name"));
			ps.setString(2, props.getProperty("uid"));
			ps.setString(3, props.getProperty("upass"));
			
			status=ps.executeUpdate();
			
			System.out.println("status :"+status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return status;
	}
	
	public Employee getdetails(String uid)
	{
		Employee emp=null;
		
		
		try {
			con=createconnection();
			ps=con.prepareStatement("Select * from admin where uid=?");
			ps.setString(1, uid);
			
			rs=ps.executeQuery();
			while(rs.next())
			{
				emp=new Employee();
				emp.setName(rs.getString(1));
				emp.setUid(rs.getString(2));
				emp.setUpass(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;		
	}
	
	public int updatedetails(Employee emp)
	{
		int status=0;
		
		try {
			con=createconnection();
			ps=con.prepareStatement("update admin set name=?,uid=?,upass=? where uid=?");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getUid());
			ps.setString(3, emp.getUpass());
			ps.setString(4, emp.getUid());
			
			status=ps.executeUpdate();
			
			System.out.println("status:"+status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return status;
	}
	
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDao();
		dao.createconnection();
		int status;
		
//		Employee emp=dao.checklogin("ankitjangra7090@gmail.com", "Ankit@123");
//		System.out.println(emp);
		
		
//		Employee emp=dao.getdetails("ankitjangra7090@gmail.com");
//		System.out.println(emp);
		
		Employee emp=new Employee();
		emp.setName("aj");
		emp.setUid("ankitjangra7090@gmail.com");
		emp.setUpass("Ankit@123");
		
		status=dao.updatedetails(emp);
		System.out.println("status"+status);
	}
	
	
	
}
