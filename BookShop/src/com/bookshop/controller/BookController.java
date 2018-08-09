package com.bookshop.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookshop.pojo.Book;
import com.bookshop.pojo.Cart;
import com.bookshop.service.BookService;
import com.bookshop.service.BookServiceImpl;

/**
 * Servlet implementation class BookController
 */
@WebServlet("*.shop")
public class BookController extends HttpServlet {  
	
	private BookService service = new BookServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		System.out.println(action);
		
		switch (action) {
		
		case "/addToCart.shop":
			int id = Integer.parseInt(request.getParameter("id"));
			service.addBookCart(id);
			session.setAttribute("cart", service.viewCart());
			response.sendRedirect("home.jsp");
			break;
		
		case "/viewCart.shop":
			session = request.getSession();
			session.setAttribute("cart", service.viewCart());	System.out.println(service.viewCart());
			response.sendRedirect("cart.jsp");
			break;
		
		case "/delFrmCrt.shop":
			id = Integer.parseInt(request.getParameter("id"));
			service.delFrmCart(id);
			response.sendRedirect("viewCart.shop");
			break;
			
		case "/viewAllBooks.shop":
			session = request.getSession();
			session.setAttribute("book", service.viewAllBooks());	System.out.println(service.viewAllBooks());
			response.sendRedirect("home.jsp");
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
