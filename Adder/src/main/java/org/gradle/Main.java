package org.gradle;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.stereotype.Component;

import sun.awt.AppContext;

@Configuration
@EnableAutoConfiguration
@Import({Config.class})
@ComponentScan("org.gradle")
public class Main {
	
	
	static AnnotationConfigApplicationContext appContext;
	static StandardEnvironment environment;
	
	public static void main(String[] args) {
		
		configSpring();
       excecute( args);
       // Eingabe eingabe =new Eingabe();
      //  eingabe.excecute(args);

	}

	private static void excecute(String[] args) {
		 Eingabe eingabe = (Eingabe) appContext.getBean("eingabe");
		 eingabe.excecute(args);
		 
	}

	private static void configSpring() {
		
		environment = new StandardEnvironment();
		try{
			environment.getPropertySources().addFirst(new ResourcePropertySource("application.properties"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		appContext = new AnnotationConfigApplicationContext();
		appContext.register(Config.class);
		appContext.setEnvironment(environment);
		appContext.refresh();
		
	}

	private static void serverSleep() {
		
		boolean stopServer = false;
        while(!stopServer){
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
       
        
	}

}