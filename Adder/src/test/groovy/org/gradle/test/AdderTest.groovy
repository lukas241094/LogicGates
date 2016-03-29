
package org.gradle.test

import org.gradle.*
import spock.lang.*


class AdderTest extends Specification{
	def "TestMethodAdder"() {
		when:
	def  adder =new Adder(a,b,c)
		then:
	adder.evaluateadder()[0]==h
	adder.evaluateadder()[1]==g	
	where:
	a | b | c | h | g
	0 | 0 | 0 | 0 | 0
	0 | 0 | 1 | 0 | 1
	0 | 1 | 0 | 0 | 1
	0 | 1 | 1 | 1 | 0
	1 | 0 | 0 | 0 | 1
	1 | 0 | 1 | 1 | 0
	1 | 1 | 0 | 1 | 0
	1 | 1 | 1 | 1 | 1
	}
}
