
package org.gradle.test

import org.gradle.*
import org.gradle.gates.AndGate
import org.gradle.gates.*
import spock.lang.*


class HalfAdderTest extends Specification{
	   def "TestMethodHalfAdder"() {
			   when:
		   def  halfadder =new HalfAdder()
		   halfadder.a=a
		   halfadder.b=b
		   Gate andgate = Mock(Gate)
		   Gate xor = Mock(Gate)
		   xor.evaluate(a,b)>> e
		   andgate.evaluate(a,b)>>d
		   halfadder.xor= xor 
		   halfadder.andgate=andgate
		   then:
		  
           halfadder.evaluateHalfAdder()[0]==d
		   halfadder.evaluateHalfAdder()[1]==e
		   where:
		  a    |b    |d    |e 
		  true |true |true |true
		   }
}
