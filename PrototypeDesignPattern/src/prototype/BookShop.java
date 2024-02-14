package prototype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShop implements Cloneable{
	
	private String shopName;
	List<Book> book=new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", book=" + book + "]";
	}
	
	public void loadData()
	{
		for(int i=1;i<=10;i++)
		{
			Book b=new Book();
			b.setBid(1);
			b.setBname("Book "+i);
			getBook().add(b);
		}
	}
	

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bs=new BookShop();
		for(Book b: this.getBook())
		{
			bs.getBook().add(b);
		}
		return bs;
	}
	

}
