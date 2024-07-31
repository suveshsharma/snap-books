package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class admindata
 */
public class admindata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admindata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uid=request.getParameter("uid");
	
		EmployeeDao dao=new EmployeeDao();
		Employee emp=dao.getdetails(uid);
		if(emp!=null)
		{
			request.setAttribute("id", emp.getUid());
			request.setAttribute("name", emp.getName());
			request.setAttribute("pass", emp.getUpass());
//			out.print("emp:"+emp);
			request.getRequestDispatcher("admininfo.jsp").forward(request, response);
		}
		else {
			out.print("<h1>Plzz Enter the Correct Id</h1>");
		}
	}

}
