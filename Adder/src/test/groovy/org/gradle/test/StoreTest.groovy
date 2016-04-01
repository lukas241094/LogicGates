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
		
			store.getInput()[0]==true;
			store.getInput()[1]==true;
		
		
	}
	
	def "TestStoreOutput" (){
		when:
		
		Boolean [] test = [true,true]
		
		def store = new Store()
			store.setOutput(test)
		
		then:
		
			store.getOutput()[0]==true;
			store.getOutput()[1]==true;
	}

}
