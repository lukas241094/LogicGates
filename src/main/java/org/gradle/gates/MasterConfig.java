package org.gradle.gates;
import org.springframework.context.annotation.*;



@Configuration
public class MasterConfig {
	
	@Bean
	public AndGate andGate(){
		return new AndGate();
		
	}
	
	@Bean
	public OrGate orGate(){
		return new OrGate();
	}
	
	@Bean
	public XOrGate xOrGate(){
		return new XOrGate();
	}
	
	@Bean
	public NAndGate nAndGate(){
		return new NAndGate();
	}

	@Bean
	public NOrGate nOrGate(){
		return new NOrGate();
	}

	@Bean
	public NotGate notGate(){
		return new NotGate();
	}

	@Bean
	public XNOrGate xNOrAndGate(){
		return new XNOrGate();
	}
	
	
	@Bean
	public HalfAdder halfAdder(){
		return new HalfAdder();
	}
	
	

}
