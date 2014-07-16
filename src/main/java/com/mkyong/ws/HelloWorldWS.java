package com.mkyong.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.mkyong.bo.HelloWorldBo;

@WebService
public class HelloWorldWS{

	//DI via Spring
	@Autowired
	private HelloWorldBo helloWorldBo;
	
	
	@WebMethod(exclude=true)
	public void setHelloWorldBo(HelloWorldBo helloWorldBo) {
		this.helloWorldBo = helloWorldBo;
	}

//	public HelloWorldBo getHelloWorldBo() {
//		return helloWorldBo;
//	}
	
	@WebMethod(operationName="getHelloWorld")
	public String getHelloWorld() {
		
		return helloWorldBo.getHelloWorld();
		
	}
	@WebMethod(operationName="setHelloWorld")
	public void setHelloWorld(String param) {
		
		helloWorldBo.setHelloWorld(param);
	}
 
}