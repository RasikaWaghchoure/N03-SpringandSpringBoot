package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	
	//1.DI in the form of literals
	private String company;
	private double cost;
	
	// return the method
	public double cost() 
	{
		return cost;
	}
	public String display() 
	{
		return "Japan";
	}
	
	// we declare String is in private so we used getters and setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//DI Using Constructor
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Origin of company:"+company+" "+fuel;
	}
	
	
	

}
