package com.files;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class isbooklist
 */
public class isbooklist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public isbooklist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String id=request.getParameter("id");
	
	issueBooksDao dao=new issueBooksDao();
	ArrayList<issuebook> is=dao.getdetails(id);
	
	if(is!=null)
	{
		out.print("data access successfully!");
		request.setAttribute("id", id);
		request.getRequestDispatcher("issuedbooklist.jsp").forward(request, response);
	}
	else {
		out.print("cant fetch data successfully!");
	}
	}
}
