package com.bookshop.service;

import java.util.Collection;

import com.bookshop.pojo.Book;
import com.bookshop.pojo.Cart;

public interface BookService {

	Collection<Book> viewAllBooks();

	void delFrmCart(int Id);

	void addBookCart(int id);

	Collection<Cart> viewCart();

}