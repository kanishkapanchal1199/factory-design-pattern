package composite;

public class CompositeTest {

	public static void main(String[] args) {
		Component hd=new Leaf(4000,"HDD");
		Component mouse=new Leaf(500,"Mouse");
		Component monitor=new Leaf(8000,"Monitor");
		Component Ram=new Leaf(3000,"RAM");
		Component CPU=new Leaf(9000,"CPU");
		
		
		Composite ph=new Composite("Peripheral");
		Composite cab=new Composite("Cabinet");
		Composite MB=new Composite("MB");
		Composite computer=new Composite("Computer");
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cab.addComponent(hd);
		
		MB.addComponent(Ram);
		MB.addComponent(CPU);

		computer.addComponent(ph);
		computer.addComponent(MB);
		computer.addComponent(cab);
		
		computer.showPrice();
	}
}
