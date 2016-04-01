//package org.gradle;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.gradle.Interface.StoreInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//@Component
//public class FakeConfigClass {
//	@Resource
//	Adder adder;
//	@Resource 
//	Reader reader;
//	@Resource 
//	Writer writer;
//	
//	
//	@Autowired
//	public void magic() throws Exception{
//		StoreInterface store = reader.read();
//		store = adder.evaluateadder(store);
//		List<StoreInterface> list = new ArrayList<StoreInterface>(); 
//		list.add(store);
//		writer.write(list);
//		
//	}
//
//}
