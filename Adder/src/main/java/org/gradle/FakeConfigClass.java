package org.gradle;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FakeConfigClass {
	@Resource
	Adder adder;
	@Resource 
	Reader reader;
	@Resource 
	Writer writer;
	
	@Autowired
	public void magic() throws IOException{
		Store store = reader.OpenFile();
		store = adder.evaluateadder(store);
		writer.writeFile(store);
		
	}

}
