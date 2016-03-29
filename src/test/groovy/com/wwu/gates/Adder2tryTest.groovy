package com.wwu.gates
import org.gradle.gates.*
import spock.lang.*

class Adder2tryTest extends Specification{
	
	def "Addertest2try"(){
	
		when:
		def Adder2try testadder = new Adder2try(a,b,c)
		
		then:
		
		testadder.evaluateAdder()[0]==h
	    testadder.evaluateAdder()[1]==g
		
		where:
		
		a | b | c | h | g
		0 | 0 | 0 | 0 | 0
		1 | 0 | 0 | 0 | 1
		0 | 1 | 0 | 0 | 1
		0 | 0 | 1 | 0 | 1
		1 | 1 | 0 | 1 | 0
		0 | 1 | 1 | 1 | 0
		1 | 0 | 1 | 1 | 0
		1 | 1 | 1 | 1 | 1
		
		
	}

}
