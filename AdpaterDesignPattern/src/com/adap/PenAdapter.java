package com.adap;

public class PenAdapter implements Pen{
	
	PioletPen pp=new PioletPen();

	@Override
	public void write(String str) {
	pp.mark(str);
		
	}
	
	

}
