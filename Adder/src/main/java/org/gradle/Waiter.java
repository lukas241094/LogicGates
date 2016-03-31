package org.gradle;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Waiter {
	//@Resource
	Adder adder;
	//@Resource
	Test test;
	boolean a=false;
	boolean serviceReaderRunning = true;
	private Optional item;

	public Optional bash() {
		// int a;
		// for (a = 0; a < 3; ++a) {
		// if (a < 3) {
		// adder.evaluateadder();
		// }else
		// break;
		//// if (a==3){
		////
		//// }
		// }
		item = Optional.ofNullable(null);
		if (a){
		    item = Optional.ofNullable(test.feeder());
		}
		System.out.println(item);
		return item;
	}

	//@Autowired
	public void waiter() throws InterruptedException {
		bash();
		while (serviceReaderRunning) {
			if (!item.isPresent()) {
				Thread.sleep(1000);
				System.out.println("Hello");
			} else
				break;			
		}
	}
}
