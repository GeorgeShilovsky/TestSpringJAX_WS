package com.mkyong.bo.impl;

import com.mkyong.bo.HelloWorldBo;

public class HelloWorldBoImpl implements HelloWorldBo{
	String r="JAX-WS + Spring!";
	public String getHelloWorld(){
		return r;
	}
	public void setHelloWorld(String param){
		r=param;
	}
	
}