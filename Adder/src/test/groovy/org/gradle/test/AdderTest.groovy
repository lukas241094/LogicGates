
package org.gradle.test

import org.gradle.*
import org.gradle.gates.Gate
import spock.lang.*

// Not Working ///
class AdderTest extends Specification{
	def "TestMethodAdder"() {
		when:
		def adder = new Adder(a,b,c)
		def HalfAdder h1 = Mock()
		def HalfAdder h2 = Mock()
		Adder.h1 = h1
		Adder.h2 = h2
		
		then:
	    adder.evaluateadder()[0] == h
    	adder.evaluateadder()[1] == g	
		
    	where:
    	a     | b     | c     | h     | g
    	false | false | false | false | false
   /*	0 | 0 | 1 | 0 | 1
    	0 | 1 | 0 | 0 | 1
    	0 | 1 | 1 | 1 | 0
        1 | 0 | 0 | 0 | 1
    	1 | 0 | 1 | 1 | 0
    	1 | 1 | 0 | 1 | 0
    	1 | 1 | 1 | 1 | 1*/
	}
}
