package org.gradle.test
import org.gradle.Store
import spock.lang.*


class StoreTest extends Specification{
	
	def "TestStoreInput" (){
		when:
		
		Boolean [] test = [true,true]
		
		def store = new Store()
			store.setInput(test)
		
		then:	
		
			store.getInput()==test
		
		
	}
	
	def "TestStoreOutput" (){
		when:
		
		Boolean [] test = [true,true]
		
		def store = new Store()
			store.setOutput(test)
		
		then:
		
			store.getOutput()==test;
	}

}
