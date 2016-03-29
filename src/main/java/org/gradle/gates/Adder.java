package org.gradle.gates;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Adder {
	
	int a;
	int b;
	int c;
	
	//Constructor für groovy Test
	Adder (int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;	
	}
	
	ApplicationContext adder = 
			new AnnotationConfigApplicationContext(MasterConfig.class);
	//using beans to create required objects
	
	HalfAdder ha1=adder.getBean(HalfAdder.class);
	
	HalfAdder ha2=adder.getBean(HalfAdder.class);
	
	OrGate og=adder.getBean(OrGate.class);
	
	//
	public int [] evaluateAdder(){
		ha1.a = this.a; //setting the variables of the first ha (a)
		ha1.b = this.b; // (b)
		
		//using first ha and saving result in an array (usefull?)
		int [] zwischenspeicher = ha1.evaluateHalfAdder(); 
		
		//setting variables for second ha from adder variables and result of the first ha
		ha2.a = zwischenspeicher[1];
		ha2.b = this.c;
		
		//using second ha and saving result in array (is this usefull?)
		int [] zwischenspeicher2 = ha2.evaluateHalfAdder();
		
		//using OrGate 
		int ogErgebnis = og.evaluate(zwischenspeicher[0], zwischenspeicher2[0]);
		
		//creating array of the results of the adder -> adderArray
		int [] adderArray = {ogErgebnis,zwischenspeicher2[1]};
		
		//returning adderArray
		return adderArray;
		
	}
}
