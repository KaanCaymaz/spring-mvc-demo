package com.luv2code.springdemo.mcv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {

	@RequestMapping("/showForm")
	public String doSomething() {
		return "newPage";
	}
}
