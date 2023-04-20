package com.tenco.banks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("/main")
	public String mainTest() {
		System.out.println("111111");
		return "layout/NewFile";
	}
	
}
