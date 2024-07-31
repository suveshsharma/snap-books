package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deletebooks
 */
public class deletebooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletebooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String btitle=request.getParameter("btitle");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Books book=new Books(); 
		BooksDao dao=new BooksDao();
		
		int status=(dao.deletebooks(btitle));
		
		if(status==1)
		{
			try {
				Thread.sleep(1000*3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("Booklist.jsp").forward(request, response);
			out.print("deleted successfully!");
		}
		else {
			out.print("not deleted successfully!");
		}
		
	}


}
