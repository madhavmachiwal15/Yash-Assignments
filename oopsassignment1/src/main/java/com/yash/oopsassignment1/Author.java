package com.yash.oopsassignment1;
/**
 * 
 * @author Madhav Machiwal
 *
 */
public class Author 
{
	private String book_name;
	private double book_price;
	private String book_type;
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	
	@Override
	public String toString() {
		return "Author [book_name=" + book_name + ", book_price=" + book_price + ", book_type=" + book_type + "]";
	}
	
	public static void main(String arg[])
	{
		Author book = new Author();
		book.setBook_name("Engineering Mathematics");
		book.setBook_price(450);
		book.setBook_type("Academic");
		
		book.getBook_name();
		book.getBook_price();
		book.getBook_type();
		
		System.out.println(book.toString());
	}
}
