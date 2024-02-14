package buider;

import phone.Phone;
import phone.PhoneBuilder;

public class BuilderDesignPatternMain {
	
	public static void main(String[] args) {
		
		Phone p=new PhoneBuilder()
				.setOs("Andriod")
				.setRam(2)
				.setBattery(3000)
				.getPhone();
		
		System.out.println(p);
		
		
	}

}
