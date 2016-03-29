package org.gradle;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.*;

@Component
public class HalfAdder{
	//Aufruf mit Methoden
   @Resource
   AndGate andgate;
   @Resource
   Xor xor;
//Variablen Deklaration
 int a;
 int b;
 int d;
 int e;
//HalfAdder Constructor
/*HalfAdder(int a,int b){
		this.a=a;
		this.b=b;
	}*/
 HalfAdder(){
 }
//Methoden für d und e
		public int [] evaluateHalfAdder(){
		int d=andgate.evaluate(a,b);
		int e=xor.evaluate(a,b);
		int [] halfAdderArray= {d,e};
		return halfAdderArray;
		}
}

