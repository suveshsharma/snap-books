package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class returnbook
 */
public class returnbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public returnbook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("tetx/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("sid");
		
		issuebook ib=new issuebook();
		issueBooksDao dao=new issueBooksDao();
		
		int status;
		status=dao.deletebooks(sid);
		
		if(status==1)
		{
			out.print("Book Return Successfully!");
			request.getRequestDispatcher("returnsuccess.jsp").forward(request, response);
		}
		else {
			out.print("Book not return successfully!");
		}
	}

	

}
