package com.abc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.implementation.Resume;

/**
 * Servlet implementation class ResumeController
 */
@WebServlet("/ResumeController")
public class ResumeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Resume resume = new Resume(
				request.getParameter("fname"), request.getParameter("lname"),
				request.getParameter("gender"), request.getParameter("qualification"),
				request.getParameter("dob"), request.getParameterValues("hobbies"),
				request.getParameter("address"), request.getParameterValues("skill"),
				request.getParameter("email"), request.getParameter("website"),
				request.getParameter("contact") ,request.getParameter("summary")
				);

		request.setAttribute("ResumeRequest", resume);
		
		RequestDispatcher rd = request.getRequestDispatcher("ResumeFinal.jsp");
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
