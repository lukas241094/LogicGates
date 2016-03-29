package com.wwu.SpringLernen;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
      new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
      HelloWorldtest helloWorld2 = ctx.getBean(HelloWorldtest.class);

      helloWorld2.setMessage("Hello World!");
      helloWorld2.displayMessage();
   }
   
}
