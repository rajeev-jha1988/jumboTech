/**
 * 
 */
package com.jumbotech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/rest/listnerService1/{snsTopicMsg}")
	public String listnerService1(@PathVariable("snsTopicMsg") String snsTopicMsg) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return snsTopicMsg.concat("listnerService1");
	}
	
	@PostMapping("/rest/listnerService2/{snsTopicMsg}")
	public String listnerService2(@PathVariable("snsTopicMsg") String snsTopicMsg) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return snsTopicMsg.concat("listnerService2");
	}
	
	@PostMapping("/rest/listnerService3/{snsTopicMsg}")
	public String listnerService3(@PathVariable("snsTopicMsg") String snsTopicMsg) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return snsTopicMsg.concat("listnerService3");
	}
	
	@PostMapping("/rest/listnerService4/{snsTopicMsg}")
	public String listnerService4(@PathVariable("snsTopicMsg") String snsTopicMsg) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return snsTopicMsg.concat("listnerService4");
	}
	
	@PostMapping("/rest/listnerService5/{snsTopicMsg}")
	public String listnerService5(@PathVariable("snsTopicMsg") String snsTopicMsg) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return snsTopicMsg.concat("listnerService5");
	}
	
	
	
}
