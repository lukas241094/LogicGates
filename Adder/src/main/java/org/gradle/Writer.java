package org.gradle;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer {

	
	//@Autowired
	public void writeFile(Store store) throws IOException{
		BufferedWriter writer = null;
		Boolean [] adderArray= store.getOutput();

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("Output.txt"), "utf-8"));
		    writer.write("Something");
		    for (Boolean bool :adderArray) {
		    	writer.write(Boolean.toString(bool));
		    }
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
	}
 
 
}

