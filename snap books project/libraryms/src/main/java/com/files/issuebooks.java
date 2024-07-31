package com.files;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class issuebooks
 */
public class issuebooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public issuebooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
//		String btitle=request.getParameter("btitle");
//		String cid=request.getParameter("cid");
//		String ibook=request.getParameter("ib");
//		String rbook=request.getParameter("rb");
	
		
		Enumeration<String> params=request.getParameterNames();
		
		Properties props=new Properties();
				
		while(params.hasMoreElements())
		{
			String data=params.nextElement();
			props.setProperty(data, request.getParameter(data));
		}
		
		issueBooksDao dao=new issueBooksDao();
		if(dao.issuebooks(props)==1)
		{
//			request.setAttribute("btitle", btitle);
//			request.setAttribute("id", cid);
//			request.setAttribute("ibook", ibook);
//			request.setAttribute("rbook", rbook);
			out.print("Book issued successfully!");
			request.getRequestDispatcher("issuedbook.jsp").forward(request, response);
		
		}
		else {
			out.print("Issued not Successfully!");
		}
		

	}
}	

