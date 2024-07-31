package com.files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;

public class BooksDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public Connection createConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Lalit@123");
			
			System.out.println("connection created!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public Books getbyid(String btitle)
	{
		Books book=null;
		
		try {
			con=createConnection();
			ps=con.prepareStatement("Select * from Books where btitle=?");
			ps.setString(1, btitle);
			
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				book=new Books();
				book.setBtitle(rs.getString(1));
				book.setBlanguage(rs.getString(2));
				book.setBauthor(rs.getString(3));
				book.setBavailable(rs.getInt(4));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;		
	}
	
	public ArrayList<Books> getdata()
	{
		ArrayList<Books> elist=new ArrayList<>();
		try {
			con=createConnection();
			ps=con.prepareStatement("Select * from Books");
			
			rs=ps.executeQuery();
			while(rs.next())
			{
				Books book=new Books();
				book.setBtitle(rs.getString(1));
				book.setBlanguage(rs.getString(2));
				book.setBauthor(rs.getString(3));
				book.setBavailable(rs.getInt(4));
				
				elist.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elist;	
	}
	
	public int insertbooks(Properties props)
	{
		int status=0;
		
		try {
			con=createConnection();
			ps=con.prepareStatement("insert into Books values(?,?,?,?)");
			ps.setString(1, props.getProperty("btitle"));
			ps.setString(2, props.getProperty("blanguage"));
			ps.setString(3, props.getProperty("bauthor"));
			ps.setString(4, props.getProperty("bavailable"));
			
			status=ps.executeUpdate();
			if(status==1)
			{
				System.out.println("status:"+status);
			}
			else {
				System.out.println("not added new books!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public int deletebooks(String btitle)
	{
		int status=0;
		
		
		try {
			con=createConnection();
			ps=con.prepareStatement("delete from Books where btitle=?");
			ps.setString(1, btitle);
			
			status=ps.executeUpdate();
			
			if(status==1)
			{
				System.out.println("status:"+status);
			}
			else
			{
				System.out.println("not deleted successfully!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static void main(String[] args) {
		BooksDao dao=new BooksDao();
		dao.createConnection();
		
		ArrayList<Books> book=dao.getdata();
		System.out.println("\n"+book);
		
		Books b=new Books();
		b=dao.getbyid("java");
		System.out.println(b);
	}
	
}
