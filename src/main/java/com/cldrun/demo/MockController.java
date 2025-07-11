package com.cldrun.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {

	@GetMapping("/hello")
	public ResponseEntity<String> printHelloWorld(){
		return ResponseEntity.ok("Hello , Test for cloud Run");
	}
}
