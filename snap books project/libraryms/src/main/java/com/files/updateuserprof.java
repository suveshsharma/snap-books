package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateuserprof
 */
public class updateuserprof extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateuserprof() {
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
		String name=request.getParameter("name");
		String uid=request.getParameter("uid");
		String upass=request.getParameter("upass");
		
		UserDao dao=new UserDao();
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setUid(uid);
		user.setUpass(upass);
		
		int status;
		status=dao.updaterecord(user);
		
		if(status==1)
		{
			out.print("updated successfully!");
			request.getRequestDispatcher("updateduser.jsp").forward(request, response);
		}
		else {
			out.print("not updated successfully!");
		}
	}

}
