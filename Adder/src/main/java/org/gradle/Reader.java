package org.gradle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Reader {
	@Resource
	Store store; 
	@Autowired
	public Store OpenFile() throws IOException{
		FileReader fr = new FileReader ("/home/j_toel01/git/LogicGates/Adder/src/main/java/org/gradle/Input");
		BufferedReader textReader = new BufferedReader (fr);
		
		int numberOfLines = 3;
		Boolean [] textData=new Boolean [numberOfLines];
		
		int i;
		
		
		for (i=0;i<numberOfLines;++i){
			String line =  textReader.readLine();
			System.out.println(line.split(" "));
			textData[i]= Boolean.parseBoolean(line.split(" ")[2]);
			System.out.println(textData[i].getClass().getName());
			//boolean boolean2 = Boolean.parseBoolean("true");
		}
		textReader.close();
		store.setInput(textData);
//		System.out.println(textData[0]);
		return store;
	}

}
