package com.springCoreP;


import com.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InversionAndDepenAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = context.getBean("vadaphone" , Vadaphone.class);
		sim.browseInternate();
		sim = context.getBean("airtel" , Airtel.class);
		sim.Calling();
		
	}

}
