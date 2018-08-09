package com.bookshop.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.bookshop.pojo.Book;
import com.bookshop.pojo.Cart;

public class BookDAOImpl implements BookDAO {
	
	private static Map<Integer, Book> bookDB = new HashMap<>();
	
	private static Map<Integer, Cart> cart = new HashMap<>();

	private static Book bookOne = new Book(101,"Head First Java",800,"Jeans Kelly","Good Book. Great to read. Easy to understand.");
	private static Book bookTwo = new Book(102,"Head First JEE",1000,"John Kolan","Great Book. Lucid to read. Fluid to understand.");
	private static Book bookThree = new Book(103,"Spring",1200,"Craig Walls","Easy concept. Lucid Language. Imparts good concept.");
	private static Book bookFour = new Book(104,"Java-The Complete Reference",500,"Herbert Schildt","As an introductory book it is good to read. Easy concepts");
	
	static {
		bookDB.put(bookOne.getId(), bookOne);
		bookDB.put(bookTwo.getId(), bookTwo);
		bookDB.put(bookThree.getId(), bookThree);
		bookDB.put(bookFour.getId(), bookFour);
	}
	
	/* (non-Javadoc)
	 * @see com.bookshop.dao.BookDAO#viewAllBooks()
	 */
	@Override
	public Collection<Book> viewAllBooks(){
		return bookDB.values();
	}
	
	/* (non-Javadoc)
	 * @see com.bookshop.dao.BookDAO#addBook(com.bookshop.pojo.Book)
	 */
	@Override
	public void addBookCart(int id) {
		if(cart.get(id)==null)
		{
			for(Book book : viewAllBooks())
			{
				if(book.getId()==id)
				{
					Cart crt = new Cart(1,book);
					cart.put(id,crt);
				}
			}
		}
		else
		{
			Cart crt = cart.get(id);
			crt.setQuantity(crt.getQuantity()+1);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.bookshop.dao.BookDAO#viewcart()
	 */
	@Override
	public Collection<Cart> viewcart(){
		return cart.values();
	}
	
	/* (non-Javadoc)
	 * @see com.bookshop.dao.BookDAO#delFrmCart(int)
	 */
	@Override
	public void delFrmCart(int id) {
		for(Cart cartV : viewcart())
		{
			if(cartV.getBook().getId()==id)
			{
				if(cartV.getQuantity()>1)
				{	
					cartV.setQuantity(cartV.getQuantity()-1);
					break;
				}
				else
				{	
					cart.remove(id);
					break;
				}
			}
		}
	}
	
	public int getTotalQuantity() {
		
		int totalQuantity = 0;
		for(Cart cartV : viewcart()) {
			totalQuantity += cartV.getQuantity();
		}
		return totalQuantity;
	}
}
