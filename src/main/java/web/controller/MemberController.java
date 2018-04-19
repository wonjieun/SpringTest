package web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.service.MemberService;

@Controller
public class MemberController {
	// import org.slf4j.*;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired MemberService memberService;
	
	@RequestMapping(value="/member/main.do")
	public String main(Model model) {
		logger.info("/member/main.do -- STARTED");
		
		// member 테이블 정보를 service 요청
		List list = memberService.getMembers();
		System.out.println(list);
		
		// 받은 정보를 model 담기
		model.addAttribute("list", list);
		
		// view 전달
		return "member/main";
	}
	
}
