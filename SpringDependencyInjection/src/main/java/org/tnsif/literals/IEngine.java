package org.tnsif.literals;

public interface IEngine {
	
	//Dependency injection in the form of literals
	String fuel="Petrol";
	double cost();
	String display();
	
	// in interface we can not create the object so we create anouther class

}
