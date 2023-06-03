/**
 * 
 */
package org.learntek.demo.controller;

import org.learntek.demo.model.Numbers;
import org.learntek.demo.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 *
 */
@RestController
public class HelloController {
	
	@GetMapping("/helloSpringBoot")
	public String sayHello() {
		return "Hello, Welcome to Spring Boot !!! ";
	}
	
	@PostMapping("/sum")
	public ResponseEntity<Result> doSum(@RequestBody Numbers numbers){
		int no1 = numbers.getNo1();
		int no2 = numbers.getNo2();
		int res = no1+no2;
		Result result = new Result();
		result.setResult(res);
		ResponseEntity<Result> responseEntity = new ResponseEntity<Result>(result, HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/add")
	public ResponseEntity<Result> doAdd(@RequestParam("no1") int a,@RequestParam("no2") int b){
		int res = a+b;
		Result result = new Result();
		result.setResult(res);
		ResponseEntity<Result> responseEntity = new ResponseEntity<Result>(result, HttpStatus.OK);
		return responseEntity;
	}
}
