package org.tnsif.objectsInjection;

public class Charger {
	private String brand;
	private int volt;
	private String type;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setVolt(int volt) {
		this.volt = volt;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void power()
	{
		System.out.println("Details related to charger:");
		System.out.println("Brand:"+brand+" Voltage :"+volt+"Type :"+type);
	}
	
	
	

}
