package org.gradle;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class Adder {
	//Aufruf mit Methoden
    @Resource
	HalfAdder h1;
    @Resource
    HalfAdder h2;
    @Resource
    OrGate or;
    @Resource
    AndGate andGate;
    @Resource 
    Xor xor;
	//Definitionen
    @Value("${org.gradle.a}")
	int a;
    @Value("${org.gradle.b}")
	int b;
    @Value("${org.gradle.c}")
	int c;
	Adder (int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	Adder (){	
	}
//Methode
	@Autowired
	public int [] evaluateadder(){
		h1.a=this.a;
		h1.b=this.b;
		int [] zwischenspeicher = h1.evaluateHalfAdder();//d,e
		System.out.println("zwischenspeicher size"+zwischenspeicher.length);
		h2.a=zwischenspeicher[1];//e
		h2.b=this.c;
		int [] zwischenspeicher2 = h2.evaluateHalfAdder();//f,g
		System.out.println("zwischenspeicher2 size"+zwischenspeicher2.length);
		int g=zwischenspeicher2[1];
		int h=or.evaluate(zwischenspeicher[0], zwischenspeicher2[0]);
		int [] AdderArray= {h,g};
		System.out.println("Das Ergenis lautet:"+AdderArray[0]+AdderArray[1]);
		System.out.println("Ohne Binär:");
		System.out.println(AdderArray[0]*2+AdderArray[1]);
		return AdderArray;
		}
	private void evaluateHalfAdder() {		
	}
}
