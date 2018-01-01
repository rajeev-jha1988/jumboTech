/**
 * 
 */
package com.jumbotech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajeev.jha
 *
 */

@RestController
public class RestHandler {
	@GetMapping("/rest/sayHello/{name}")
	public String sayHello(@PathVariable("name") String name){
		return "Hello "+name;
	}
}
