package org.gradle.test
import org.gradle.*
import spock.lang.*




class HafAdderTest  extends Specification{		
		   def "TestMethodHalfAdder"() {
			   when:
		   def  halfadder =new HalfAdder(a,b)
			   then:
		  
           halfadder.evaluateHalfAdder()[0]==d
		   halfadder.evaluateHalfAdder()[1]==e
		   where:
		   a | b | d | e
		   0 | 0 | 0 | 0
		   0 | 1 | 0 | 1
		   1 | 0 | 0 | 1
		   1 | 1 | 1 | 0
		   }
}
