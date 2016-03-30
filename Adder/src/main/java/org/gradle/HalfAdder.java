package org.gradle;
import javax.annotation.Resource;

import org.gradle.gates.AndGate;
import org.gradle.gates.Gate;
import org.gradle.gates.Xor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class HalfAdder{
	//Aufruf mit Methoden
   @Resource
   @Qualifier("AndGate")
   Gate andgate;
   @Resource
   @Qualifier("Xor")
   Gate xor;
//Variablen Deklaration
 boolean a;
 boolean b;
 boolean d;
 boolean e;
//HalfAdder Constructor
 HalfAdder(){
 }
 HalfAdder(boolean a, boolean b){
		this.a=a;
		this.b=b;
 }
//Methoden für d und e
		public boolean [] evaluateHalfAdder(){
		boolean d=andgate.evaluate(a,b);
		boolean e=xor.evaluate(a,b);
		boolean [] halfAdderArray= {d,e};
		return halfAdderArray;
}
}

