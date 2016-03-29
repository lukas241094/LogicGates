package com.wwu.gates

import spock.lang.*

class GateTest extends Specification {
	
	
	def "AndGate"(){
		expect:
		Math.min(a,b)==c
		
		
	where:
		
		a | b | c 
		0 | 0 | 0
		1 | 0 | 0
		0 | 1 | 0
		1 | 1 | 1
		
	}

	

	def "OrGate"(){
		expect:
		Math.max(a,b)==c
		
		where:
		a | b | c
		0 | 0 | 0
		1 | 0 | 1
		0 | 1 | 1
		1 | 1 | 1
		
			
	}
	
	def "NotGate"(){
		expect:
		a != c
		
		where:
		a | c
		0 | 1
		1 | 0
	}
	
	def "NorGate"(){
		expect:
		Math.max(a,b)!=c
		
		where:
		a | b | c
		0 | 0 | 1
		1 | 0 | 0
		0 | 1 | 0
		1 | 1 | 0
	}
	

}



/*	


    def " And Gate With Null " (){
		
		a | b    | c
		0 | null | 0
	}
 




	

}
*/
