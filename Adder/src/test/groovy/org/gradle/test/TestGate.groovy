package org.gradle.test
import org.gradle.gates.AndGate;
import org.gradle.gates.NandGate;
import org.gradle.gates.Nor;
import org.gradle.gates.NotGate;
import org.gradle.gates.OrGate;
import org.gradle.gates.Xnor;
import org.gradle.gates.Xor;

import spock.lang.*

// Hit 'Run Script' below



class TestGate extends Specification{
 
	def "TestMethodAndGate"() {	
		when:
	def gate =new AndGate()
	    then:
    gate.evaluate(a,b)==c
	
	where:
		a    |b    |c
		false|false|false
		true |false|false
		false|true |false
		true |true |true
	}
    def "OrGate"() {
		 when:
	def orgate=new OrGate()
		 then:
    orgate.evaluate(a,b)==c
	where:
		a    |b    |c
		false|false|false
 		true |false|true
		false|true |true
		true |true |true
}
	 def "NotGate"() {
		 when:
		 def notgate=new NotGate()
		 then:
		 notgate.evaluate(a,b)==c
		 where:
		a    |b    |c
		false|false|true
		true |false|false

	    	}
     def "NorGate"() {
		when:
		 def nor=new Nor()
		 then:
		 nor.evaluate(a,b)==c
		 where:
		a    |b    |c
		false|false|true
		true |false|false
		false|true |false
		true |true |false	 
} 
     def "XorGate"() {
		 when:
		 def xor=new Xor()
		 then:
		 xor.evaluate(a,b)==c
		 where:
		a    |b    |c
		false|false|false
		true |false|true
		false|true |true
		true |true |false
	 }
	 def "NandGate"(){
		 when:
		 def nand=new NandGate()
		 then:
		 nand.evaluate(a,b)==c
		 where:
		a    |b    |c
		false|false|true
		true |false|true
		false|true |true
		true |true |false
	 
	 }
	 def "XnorGate"(){
		 when:
		 def xnor=new Xnor()
		 then:
		 xnor.evaluate(a,b)==c
		 where:
		a    |b    |c
		false|false|true
		true |false|false
		false|true |false
		true |true |true
	 }
}