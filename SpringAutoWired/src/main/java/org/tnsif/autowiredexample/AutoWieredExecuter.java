package org.tnsif.autowiredexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWieredExecuter {

	public static void main(String[] args) 
	{
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Bike b=c.getBean("bike",Bike.class);
		b.accept();
		

	}

}
