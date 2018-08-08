package com.mydocs.logincontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("*.app")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		
		switch (action) {
		case "/login.app":
			String uname = request.getParameter("uname");
			String pass = request.getParameter("pass");
			
			if(uname.equals("admin") && pass.equals("admin"))
			{
				session = request.getSession();
				session.setAttribute("uname", uname);
				response.sendRedirect("success.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}
			break;

		case "/logout.app":
			session.invalidate();
			response.sendRedirect("Login.jsp");
			break;
			
		default:
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
		
		
	}

}
