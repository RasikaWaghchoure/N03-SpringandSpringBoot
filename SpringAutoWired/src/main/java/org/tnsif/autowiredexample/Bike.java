package org.tnsif.autowiredexample;

public class Bike {
	
	//
	Petrol p;
	 
	//generate setters
	public void setP(Petrol p) {
		this.p = p;
	}
	
	//injecting the object of petrol
	public void accept()
	{
		p.engine();
	}
}
