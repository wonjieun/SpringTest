package com.jieun.www;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// /로 들어오는 get요청을 처리
	@RequestMapping(value = "/", method = RequestMethod.GET)
	// locale (서버의 언어권을 자동으로 받아옴), model (model을 view에 전달)
	public String home(Locale locale, Model model) {
		// console창에 출력
		// 이 문장을 실행할 수 있도록 하는 것이 log4j.xml
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		// home이라는 view에 뿌려줌
		// return "view name";
		return "home";
	}
	
}
