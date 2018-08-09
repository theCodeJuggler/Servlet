package com.bookshop.service;

import java.util.Collection;

import com.bookshop.dao.BookDAOImpl;
import com.bookshop.pojo.Book;
import com.bookshop.pojo.Cart;

public class BookServiceImpl implements BookService {

	private BookDAOImpl bkDao = new BookDAOImpl();
	
	/* (non-Javadoc)
	 * @see com.bookshop.service.BookService#viewAllBooks()
	 */
	@Override
	public Collection<Book> viewAllBooks(){
		return bkDao.viewAllBooks();
	}
	
	/* (non-Javadoc)
	 * @see com.bookshop.service.BookService#delFrmCart(int)
	 */
	@Override
	public void delFrmCart(int Id) {
		bkDao.delFrmCart(Id);
	}
	/* (non-Javadoc)
	 * @see com.bookshop.service.BookService#addBookCart(com.bookshop.pojo.Book)
	 */
	@Override
	public void addBookCart(int id) {
		//System.out.println("sservice "+id);
		bkDao.addBookCart(id);	
	}
	
	/* (non-Javadoc)
	 * @see com.bookshop.service.BookService#viewCart()
	 */
	@Override
	public Collection<Cart> viewCart(){
		return bkDao.viewcart();
	}
	
	public int getTotalQuantity() {
		return bkDao.getTotalQuantity();
	}
}
