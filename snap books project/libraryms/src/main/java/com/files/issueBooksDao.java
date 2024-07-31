package com.files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class issueBooksDao {
	
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
	
	public int issuebooks(Properties props)
	{
		int status=0;	
		try {
			con=createconnection();
			ps=con.prepareStatement("insert into issuebook values(?,?,?,?)");
			ps.setString(1, props.getProperty("btitle"));
			ps.setString(2, props.getProperty("id"));
			ps.setString(3, props.getProperty("issuebook"));
			ps.setString(4, props.getProperty("returnbook"));
			
			status=ps.executeUpdate();
			
			System.out.println("status:"+status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public ArrayList<issuebook> showbooks()
	{
		ArrayList<issuebook> alist=new ArrayList<>();	
		
		try {
			con=createconnection();
			ps=con.prepareStatement("Select * from issuebook");
			
			rs=ps.executeQuery();
			while(rs.next())
			{
				issuebook ib=new issuebook();
				ib.setBtitle(rs.getString(1));
				ib.setId(rs.getString(2));
				ib.setIssuebook(rs.getString(3));
				ib.setReturnbook(rs.getString(4));
				alist.add(ib);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alist;
	}
	
	public ArrayList<issuebook> getdetails(String id)
	{
		ArrayList<issuebook> alist=new ArrayList<>();
		
		try {
			con=createconnection();
			ps=con.prepareStatement("Select * from issuebook where id=?");
			ps.setString(1, id);
			
			rs=ps.executeQuery();
			while(rs.next())
			{
				issuebook isb=new issuebook();
				isb=new issuebook();
				isb.setBtitle(rs.getString(1));
				isb.setId(rs.getString(2));
				isb.setIssuebook(rs.getString(3));
				isb.setReturnbook(rs.getString(4));
				
				alist.add(isb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alist;
	}
	
	public int deletebooks(String id)
	{
		int status=0;
		
		
		try {
			con=createconnection();
			ps=con.prepareStatement("delete from issuebook where id=?");
			ps.setString(1, id);
			
			status=ps.executeUpdate();
			
			System.out.println("status:"+status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	public static void main(String[] args) {
		issueBooksDao dao=new issueBooksDao();
		
		ArrayList<issuebook> ib=dao.getdetails("20ce070");
	for(issuebook e:ib)
	{
		System.out.println(e);
	}
	

	}
}
