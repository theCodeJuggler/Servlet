package com.bankapp.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.bankframe.service.BankAccountService;

/**
 * Servlet implementation class BankController
 */
@WebServlet("*.bank")
public class MMBankController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BankAccountService service;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();
		HttpSession session = request.getSession();

		switch (action) {

		case "/addAcc.bank":
			response.sendRedirect("addNewAccount.jsp");
			break;

		case "/vwAcc.bank":
			response.sendRedirect("viewAccount.jsp");
			break;

		case "/srch.bank":
			response.sendRedirect("srchAccount.jsp");
			break;

		case "/wthdrw.bank":
			response.sendRedirect("withdraw.jsp");
			break;

		case "/withdrawAction.bank":
			withdrawAction(request, response);
			break;
			
		case "/depst.bank":
			break;

		case "/fundTrnsfr.bank":

			break;

		case "/updtFrm.bank":
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

	private void withdrawAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (service.withdraw(Integer.parseInt(request.getParameter("accNo")),Double.parseDouble(request.getParameter("amount"))) == -1) {
			request.setAttribute("message", "Transaction Unsuccessful due to insufficient funds");
			request.getRequestDispatcher("messagePage.jsp").forward(request, response);

		} else {
			double amount = Double.parseDouble(request.getParameter("amount"));
			Map<Integer, Integer> denomination = new HashMap<>();
			int ar[] = { 2000, 500, 200, 100, 50, 20, 5, 2, 1 };
			int i = 0;
			for (i = 0; i < 9; i++)
				denomination.put(ar[i], 0);
			for (i = 0; i < 9; i++) {
				denomination.put(ar[i], (int) amount / ar[i]);
				amount = amount % ar[i];
			}

			int totalNotes = 0;
			for (i = 0; i < 9; i++)
				totalNotes += denomination.get(ar[i]);

			String message = "<h3>Transaction Successful</h3><br><h3>Total no. of notes: " + totalNotes + "</h3>";
			for (i = 0; i < 9; i++) {
				if (denomination.get(ar[i]) > 0)
					message = message + "<h5>Denomination " + ar[i] + " : " + denomination.get(ar[i]) + "</h5>";
			}
			request.setAttribute("message", message);
			//			System.out.println(request.getAttribute("message"));
			request.getRequestDispatcher("messagePage.jsp").forward(request, response);
		}

	}

}
