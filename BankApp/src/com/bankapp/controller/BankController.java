package com.bankapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BankController
 */
@WebServlet("*.bank")
public class BankController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		
switch (action) {
		
		case "/addAcc.bank":
			
			break;
		
		case "/vwAcc.bank":
			
			break;
		
		case "/srch.bank":
			
			break;
			
		case "/wthdrw.bank":
			
			break;

		case "/depst.bank":
			break;
			
		case "/fundTrnsfr.bank":
		
			break;
			
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
