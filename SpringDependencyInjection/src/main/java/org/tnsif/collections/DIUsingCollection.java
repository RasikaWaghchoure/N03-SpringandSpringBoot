package org.tnsif.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingCollection {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("collect.xml");
		CollectionDemo d=c.getBean("col",CollectionDemo.class);
		d.display();

	}

}
