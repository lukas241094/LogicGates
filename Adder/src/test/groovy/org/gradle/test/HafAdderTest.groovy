package org.gradle.test
import org.gradle.*
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import spock.lang.*




class HalfAdderTest  extends Specification{	
		   def "TestMethodHalfAdder"() {
			   when:
		   def  halfadder =new HalfAdder()
			   then:
		  
           halfadder.evaluateHalfAdder()[0]==d
		   halfadder.evaluateHalfAdder()[1]==e
		   where:
		   a     | b     | d     | e
		   false | false | false | false
	/*	   0 | 1 | 0 | 1
		   1 | 0 | 0 | 1
		   1 | 1 | 1 | 0*/
		   }
}
