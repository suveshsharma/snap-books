package com.files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;

public class UserDao {
	
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
	
	public User checklogin(String uid,String upass)
	{
		User emp=null;
		try {
			con=createconnection();
			ps=con.prepareStatement("select * from user where uid=? and upass=?");
			ps.setString(1, uid);
			ps.setString(2, upass);
			
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				emp=new User();
				emp.setId(rs.getString(1));
				emp.setName(rs.getString(2));
				emp.setUid(rs.getString(3));
				emp.setUpass(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	
	public ArrayList<User> getdata()
	{
		ArrayList<User> elist=new ArrayList<>();
		try {
			con=createconnection();
			ps=con.prepareStatement("Select * from user");
			
			rs=ps.executeQuery();
			while(rs.next())
			{
				User user=new User();
				user.setId(rs.getString(1));
				user.setName(rs.getString(2));
				user.setUid(rs.getString(3));
				user.setUpass(rs.getString(4));
				
				elist.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elist;	
	}
	
	public int adduser(Properties props)
	{
		int status=0;
		
		
		try {
			con=createconnection();
			ps=con.prepareStatement("insert into user values(?,?,?,?)");
			ps.setString(1, props.getProperty("id"));
			ps.setString(2, props.getProperty("name"));
			ps.setString(3, props.getProperty("uid"));
			ps.setString(4, props.getProperty("upass"));
			
			status=ps.executeUpdate();
			
			System.out.println("status :"+status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public int updaterecord(User user)
	{
		int status=0;
		try {
			con=createconnection();
			ps=con.prepareStatement("update user set id=?,name=?,upass=? where uid=?");
			ps.setString(1, user.getId());
			ps.setString(2,user.getName());
			ps.setString(3, user.getUpass());
			ps.setString(4, user.getUid());
			
			status=ps.executeUpdate();
			
			System.out.println("status:"+status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public User fetchdata(String uid) 
	{
		User user=null;
		try {
			con=createconnection();
			ps=con.prepareStatement("Select * from user where uid=?");
			ps.setString(1, uid);
			
			rs=ps.executeQuery();
			while(rs.next())
			{
				user=new User();
				user.setId(rs.getString(1));
				user.setName(rs.getString(2));
				user.setUid(rs.getString(3));
				user.setUpass(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	public static void main(String[] args) {
		UserDao dao=new UserDao();
		dao.createconnection();
		
//		User emp=dao.checklogin("ankitjangra7090@gmail.com", "Ankit@123");
//		System.out.println(emp);
		
		User user=new User();
		user.setId("20ce070");
		user.setName("aj");
		user.setUpass("Ankit@123");
		user.setUid("ankitjangra7090@gmail.com");
		
		int status=dao.updaterecord(user);
		System.out.println(status);
		
	}
	

}
