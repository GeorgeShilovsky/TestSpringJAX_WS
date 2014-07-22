package com.snp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloRest {

	@RequestMapping
	public String sayHello(@RequestParam(value="name", required=false, defaultValue="World")  String name) {
		return "Hello " + name;
	}

}
