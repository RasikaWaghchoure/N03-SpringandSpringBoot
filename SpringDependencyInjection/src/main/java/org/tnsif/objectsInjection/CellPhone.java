package org.tnsif.objectsInjection;

public class CellPhone {
	
	Charger charger;

	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	public void accept()
	{
		charger.power();
	}
	
	
	
	

}
