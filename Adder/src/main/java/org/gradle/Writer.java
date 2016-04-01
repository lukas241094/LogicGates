package org.gradle;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import javax.annotation.Resource;

import org.gradle.Interface.StoreInterface;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer implements ItemWriter<StoreInterface>{

	public void write(List<? extends StoreInterface> items) throws Exception {
		BufferedWriter writer = null;
		Boolean [] adderArray= items.get(0).getOutput();

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

