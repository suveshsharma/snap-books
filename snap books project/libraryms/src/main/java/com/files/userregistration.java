package com.files;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userregistration
 */
public class userregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		// collect all parameters in enumeration
		Enumeration<String> par=request.getParameterNames();
		
		// make properties objects
		Properties props=new Properties();
		
		User emp=new User();
		//access all the input elements like name,id,pass
		
		while(par.hasMoreElements())
		{
			String data=par.nextElement();
			props.setProperty(data, request.getParameter(data));
		}
		
		UserDao dao=new UserDao();
		if(dao.adduser(props)==1)
		{
			request.getRequestDispatcher("Success.jsp").forward(request, response);
			out.print("<h1>New id created successfully!</h1>");
			/* out.print("<h2><a href='Userlogin.jsp'>click here for login!</a></h2>"); */
			
		}
		else {
			out.print("<h1>Id is not created successfully!</h1>");
			request.getRequestDispatcher("Userlogin.jsp").include(request, response);
		}
	}



}
