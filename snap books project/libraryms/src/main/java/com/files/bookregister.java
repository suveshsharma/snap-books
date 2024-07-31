package com.files;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bookregister
 */
public class bookregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookregister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Enumeration<String> par=request.getParameterNames();
		
		Properties props=new Properties();
		
		Books book=new Books();
		
		while(par.hasMoreElements())
		{
			String data=par.nextElement();
			props.setProperty(data, request.getParameter(data));
		}
		
		BooksDao dao=new BooksDao();
		
		if(dao.insertbooks(props)==1)
		{
			try {
				Thread.sleep(1000*4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("Booklist.jsp").forward(request, response);
			out.print("New Books Added Successfully!");
		}
		else {
			request.getRequestDispatcher("bookregister.jsp").forward(request, response);
			out.print("Books not Added Successfully!");
		}
		
		
	}

}
