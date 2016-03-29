package org.gradle;

import java.util.Scanner;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;



@Component
public class Eingabe {	
@Resource
Adder adder;


	public   void excecute (String[] args) {

//		Scanner scanner = new Scanner (System.in); 
//		System.out.println("Welchen Wert für a ? (1/0)");
//		int a=scanner.nextInt();
//		System.out.println("Welchen Wert für b? (1/0)");
//		int b=scanner.nextInt();
//		System.out.println("Welchen Wert für c? (1/0)");
//		int c=scanner.nextInt();
//		System.out.println(a);		
//		System.out.println(b);
//		System.out.println(c);
//		adder.a=a;
//		adder.b=b;
//		adder.c=c;
//		System.out.println(a);		
//		System.out.println(b);
//		System.out.println(c);
		adder.evaluateadder();
	}
	

}
