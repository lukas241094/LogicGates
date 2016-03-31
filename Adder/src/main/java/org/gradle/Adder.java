package org.gradle;
import javax.annotation.Resource;

import org.gradle.gates.AndGate;
import org.gradle.gates.Gate;
import org.gradle.gates.OrGate;
import org.gradle.gates.Xor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component
public class Adder {
	//Aufruf mit Methoden
    @Resource
	HalfAdder h1;
    @Resource
    HalfAdder h2;
    @Resource
    @Qualifier ("OrGate")
    Gate or;
    @Resource
    @Qualifier ("AndGate")
    Gate andGate;
    @Resource 
    @Qualifier ("Xor")
    Gate xor;
    
	//Definitionen
    @Value("${org.gradle.a}")
	boolean a;
    @Value("${org.gradle.b}")
	boolean b;
    @Value("${org.gradle.c}")
	boolean c;
	 //Constructor
    Adder (boolean a,boolean b,boolean c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public Adder (){	
	}
	
    //Methode
	@Autowired
	public boolean [] evaluateadder(){
		h1.a=this.a;
		h1.b=this.b;
		boolean [] zwischenspeicher = h1.evaluateHalfAdder();//d,e
		h2.a=zwischenspeicher[1];//e
		h2.b=this.c;
		boolean [] zwischenspeicher2 = h2.evaluateHalfAdder();//f,g
		boolean g=zwischenspeicher2[1];
		boolean h=or.evaluate(zwischenspeicher[0], zwischenspeicher2[0]);
		boolean [] AdderArray= {h,g};
		System.out.println("Das Ergenis lautet:"+" "+AdderArray[0]+" | "+AdderArray[1]);
		int myInt = (AdderArray[0]) ? 1 : 0;
		int myInt2 = (AdderArray[1])? 1 :0 ;
		System.out.println("Ohne Boolean:" +" "+(myInt*2+myInt2));
		return AdderArray;
		}
}
