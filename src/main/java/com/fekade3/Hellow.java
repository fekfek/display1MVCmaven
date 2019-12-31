package com.fekade3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellow {
	@RequestMapping("/greet")
	public String display() {
		return "hello.jsp";
	}

}
