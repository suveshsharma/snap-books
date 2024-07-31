package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userlog
 */
public class userlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userlog() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		UserDao dao=new UserDao();
		User emp=dao.checklogin(uname, upass);
		if(emp!=null)
		{
			request.setAttribute("name", uname);
			request.setAttribute("pass", upass);
			request.setAttribute("id", emp.getId());
			request.setAttribute("mname", emp.getName());
			out.print("<h1>welcome to Profile Page</h1>");
			request.getRequestDispatcher("userprofile.jsp").forward(request, response);
			
		}
		else{
			request.getRequestDispatcher("Userlogin.jsp").include(request, response);
			out.print("<h1 style='color:red; position:absolute; top:85px; left:550px; '>Either Id and Password is incorrct</h1>");
		}
		
	
	}

}
