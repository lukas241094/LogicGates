package com.wwu.gates
import org.gradle.gates.*
import spock.lang.*

class RealGateTest extends Specification{
	def "TestMethodAndGate"(){
		
		expect:
		
		def gate = new AndGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 1
		1 | 0 | 0
		0 | 1 | 0
		0 | 0 | 0	
	}
	
	def "TestMethodOrGate"(){
		
		expect:
		
		def gate = new OrGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 1
		1 | 0 | 1
		0 | 1 | 1
		0 | 0 | 0
		
	}
	
	def "TestMethodNotGate"(){
		expect:
		def gate = new NotGate()
		
		gate.evaluate(a,b)==c
		
		where:
		
		a | b | c
		1 | 1 | 0
		0 | 1 | 1
		0 | 1 | 1
	}
	
	def "TestMethodNOrGate"(){
		expect:
		def gate = new NOrGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 0
		1 | 0 | 0
		0 | 1 | 0
		0 | 0 | 1
		
	}
	
	def "TestMethodXOrGate"(){
		expect:
		def gate = new XOrGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 0
		1 | 0 | 1
		0 | 1 | 1
		0 | 0 | 0
		
	}
	
	def "TestMethodNAndGate"(){
		expect:
		def gate = new NAndGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 0
		1 | 0 | 1
		0 | 1 | 1
		0 | 0 | 1
		
	}
	
	def "TestMethodXNOrGate"(){
		expect:
		def gate = new XNOrGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 1
		1 | 0 | 0
		0 | 1 | 0
		0 | 0 | 1
		
	}

}
