package prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs=new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		
		
		
		BookShop bs1= bs.clone();
		bs.getBook().remove(2);
		try {
			bs1.setShopName("A1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bs);
		System.out.println(bs1);
	}

	
}
