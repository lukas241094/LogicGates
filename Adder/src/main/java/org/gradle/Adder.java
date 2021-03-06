package org.gradle;
import java.io.IOException;

import javax.annotation.Resource;

import org.gradle.Interface.Gate;
import org.gradle.Interface.StoreInterface;
import org.gradle.gates.AndGate;
import org.gradle.gates.OrGate;
import org.gradle.gates.Xor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Adder implements ItemProcessor<StoreInterface,StoreInterface>{
	//Aufruf mit Methoden
    @Resource
    //@Qualifier ("HalfAdder")
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

   // @Resource
   // Reader reader;
   
    
	//Definitionen
    //@Value("${org.gradle.a}")
	boolean a ;
    //@Value("${org.gradle.b}")
	boolean b;
    //@Value("${org.gradle.c}")
	boolean c;
	 //Constructor
    Adder (boolean a,boolean b,boolean c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	Adder (){	
	}
	
	public void variablesSetter(StoreInterface store) throws IOException{
		
		Boolean[] array = store.getInput();
		this.a = array[0];
		this.b = array[1];
		this.c = array[2];
				}
    //Methode

	public StoreInterface evaluateadder(StoreInterface store) throws IOException{
		while(true){
		variablesSetter(store);
		h1.a=this.a;
		h1.b=this.b;
		boolean [] zwischenspeicher = h1.evaluateHalfAdder();//d,e
		h2.a=zwischenspeicher[1];//e
		h2.b=this.c;
		boolean [] zwischenspeicher2 = h2.evaluateHalfAdder();//f,g
		boolean g=zwischenspeicher2[1];
		boolean h=or.evaluate(zwischenspeicher[0], zwischenspeicher2[0]);
		Boolean [] AdderArray= {h,g};
		System.out.println("Das Ergenis lautet:"+" "+AdderArray[0]+" | "+AdderArray[1]);
		int myInt = (AdderArray[0]) ? 1 : 0;
		int myInt2 = (AdderArray[1])? 1 :0 ;
		System.out.println("Ohne Boolean:" +" "+(myInt*2+myInt2));
		store.setOutput(AdderArray);
		return store;
		}
	}
	//@Autowired
	public StoreInterface process(StoreInterface item) throws Exception {
		System.out.println("Hello");
		return evaluateadder(item);
	}
}
