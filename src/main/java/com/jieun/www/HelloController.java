package com.jieun.www;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 요청을 받아들이는 클래스가 됨
@Controller
public class HelloController {
	
	// method 정의
	// url을 붙일 수 있음
	@RequestMapping(value="/home/hello.do", method=RequestMethod.GET)
	public String hello(Model model) {
		
		System.out.println("hello.do 요청!");
		
		model.addAttribute("test", "Apple");

		
		// return null; 일 때
		// url: http://localhost:8092/hi.do
		// "hi"를 view name으로 자동으로 사용
		return "home/hello";
	}
	
}
