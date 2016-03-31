
package org.gradle.test

import org.gradle.*
import org.gradle.gates.AndGate
import org.gradle.gates.*
import spock.lang.*


class HalfAdderTest extends Specification{
    def "TestMethodHalfAdder"() {
        when:
		def  halfadder =new HalfAdder()
		def Gate andgate = Mock(Gate)
		def Gate xor = Mock(Gate)
		halfadder.xor= Mock(Gate)
		halfadder.andgate=Mock(Gate)
		
		then:
        halfadder.evaluateHalfAdder()[0]==false
		halfadder.evaluateHalfAdder()[1]==false
   }
}
