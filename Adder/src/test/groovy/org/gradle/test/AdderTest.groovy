
package org.gradle.test

import org.gradle.*
import org.gradle.gates.Gate
import spock.lang.*
import org.gradle.HalfAdderInterface


class AdderTest extends Specification{
	def "TestMethodAdder"() {
		when:
	def  adder =new Adder()
	adder.a=a
	adder.b=b
	adder.c=c
	StoreInterface store = new Store()
	store.setInput((Boolean[])[a,b,c])
	Gate or = Mock(Gate)
	Gate andgate = Mock(Gate)
	Gate xor = Mock(Gate)
	def halfAdder1 =new HalfAdder()
	def halfAdder2 =new HalfAdder()
	or.evaluate(a,b) >> false
	adder.h1=halfAdder1
	adder.h2=halfAdder2
	adder.or=or
	halfAdder1.xor= xor
	halfAdder1.andgate=andgate
	halfAdder2.xor= xor
	halfAdder2.andgate=andgate
	
		then:
		print adder.evaluateadder(store)
	adder.evaluateadder(store).getOutput()[0]== false
	adder.evaluateadder(store).getOutput()[1]== false
	
	
	where:
	a     | b     | c     //| h     | g     |d    |e     |f
	false | false | false //| false | false |false|false |false

	}
}
