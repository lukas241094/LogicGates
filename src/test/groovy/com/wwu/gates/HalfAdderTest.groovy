package com.wwu.gates
import org.gradle.gates.*
import spock.lang.*

class HalfAdderTest extends Specification{
	
	def "TestHalfAdder"(){
		
	
	when:
	def halfAdder = new HalfAdder(a,b)
	
	then:
	halfAdder.evaluateHalfAdder()[0] == g
	halfAdder.evaluateHalfAdder()[1] == h
	
	where:
	a | b | g | h
	0 | 1 | 0 | 1
	1 | 0 | 0 | 1
	1 | 1 | 1 | 0
	0 | 0 | 0 | 0
	}
	

}
