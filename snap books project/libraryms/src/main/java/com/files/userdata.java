package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userdata
 */
public class userdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userdata() {
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
		UserDao dao=new UserDao();
		User user=dao.fetchdata(uid);
		
		if(user!=null)
		{
			request.setAttribute("id", user.getId());
			request.setAttribute("name", user.getName());
			request.setAttribute("uid", user.getUid());
			request.setAttribute("upass", user.getUpass());
			request.getRequestDispatcher("userpage.jsp").forward(request, response);
		}
		else {
			out.print("cant access data!");
		}
	}

}
