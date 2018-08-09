package com.bookshop.dao;

import java.util.Collection;

import com.bookshop.pojo.Book;
import com.bookshop.pojo.Cart;

public interface BookDAO {

	Collection<Book> viewAllBooks();

	void addBookCart(int id);

	Collection<Cart> viewcart();

	void delFrmCart(int Id);

}