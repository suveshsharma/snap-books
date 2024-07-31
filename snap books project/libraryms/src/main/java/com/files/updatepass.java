package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updatepass
 */
public class updatepass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatepass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String id=request.getParameter("uid");
		String pass=request.getParameter("upass");
		
		EmployeeDao dao=new EmployeeDao();
		int status;
		
		Employee emp=new Employee();
		emp.setName(name);
		emp.setUid(id);
		emp.setUpass(pass);

		status=dao.updatedetails(emp);
		
		if(status==1)
		{
			out.print("Update Successfully!");
			request.getRequestDispatcher("updatesuccess.jsp").forward(request, response);
		}
		else {
			out.print("update cant successfully!");
			request.getRequestDispatcher("updatepass.jsp").forward(request, response);
		}
	}


}
