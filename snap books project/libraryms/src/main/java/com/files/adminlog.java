package com.files;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class adminlog
 */
public class adminlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		EmployeeDao dao=new EmployeeDao();
		Employee emp=dao.checklogin(uname, upass);
		if(emp!=null)
		{
//			HttpSession session=request.getSession();
//			System.out.println("session id:"+session.getId());
//			System.out.println("session creation time:"+session.getCreationTime());
//			session.setAttribute("sid", session.getId());
//			session.setAttribute("stime", session.getCreationTime());
			
					
			request.setAttribute("name", uname);
			request.setAttribute("pass", upass);
			request.setAttribute("mname", emp.getName());
			
			out.print("<h1>welcome to Profile Page</h1>");
			request.getRequestDispatcher("profilepage.jsp").forward(request, response);
			
		}
		else{
			
			request.getRequestDispatcher("Adminlogin.jsp").include(request, response);
			out.print("<h1 style='color:red; position:absolute; top:85px; left:550px; '>Either Id and Password is incorrct</h1>");
		}
		
	}

}
