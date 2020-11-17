package com.rest.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

	@GetMapping("/sayHello/{input}")
	@ResponseBody
	public String sayHello(@PathVariable String input) {
		return "Hello " + input;
	}

	@GetMapping("/sayBye")
	@ResponseBody
	public String sayBye(@RequestParam String input) {
		return "Bye " + input;
	}

	@PostMapping("/getName")
	@ResponseBody
	public String getName(@RequestBody String name) {
		return "Hello " + name;
	}

}
