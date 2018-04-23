package web.controller;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import web.dto.Member;
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
//		System.out.println(list);
		
		// 받은 정보를 model 담기
		model.addAttribute("list", list);
		
		// view 전달
		return "member/main";
	}
	
	@RequestMapping(value="/member/insert.do", method=RequestMethod.POST)
	public String insert(Member member) {
		logger.info("insert method: " + member.toString());
		
		memberService.insert(member);
		
		return "redirect:/member/main.do";
	}
	
	@RequestMapping(value="/member/delete.do", method=RequestMethod.POST)
	public String delete(Member member) {
		System.out.println("delete method: " + member.toString());
		
		memberService.delete(member);
		
		return "redirect:/member/main.do";
	}
/*	
	@RequestMapping(value="/member/update.do", method=RequestMethod.POST)
	public String update(Member member, HttpServletResponse resp) {
		logger.info(member.toString());

		// 업데이트 수행
		memberService.update(member);
		
		// 업데이트 결과 확인
		Member res = memberService.getOneMember(member);
		
		Gson gson = new Gson();
		resp.setCharacterEncoding("utf-8");
		Writer writer=null;
		// ajax 응답
		// "complete"라고 하는 구문을 보냄
//		return "complete";
		// writer는 인코딩을 해야함
		try {
			writer = resp.getWriter();
			// json형식으로 받기 때문에 "complete"로 넣어주어야함
//			writer.write("\"complete\"");
			writer.write(gson.toJson(res));
			// html형식으로 보내기
//			writer.write("<tr><td>수정된 데이터</td></tr>");
//			return "member/result";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
*/	
	@RequestMapping(value="/member/update.do", method=RequestMethod.POST)
	public String update(Member member, Model model) {
		logger.info(member.toString());

		// 업데이트 수행
		memberService.update(member);
		// -------------------- 이후로 member가 필요없음 ------------------------
		
		// 업데이트 결과 확인
		// model에 넣을 용도로  res를 만듬
//		Member res = memberService.getOneMember(member);
		// 그냥 member에 넣어주자. (변수하나 줄이기)
		member = memberService.getOneMember(member);
		
		// model에 넣어줌
		model.addAttribute("data", member);
		return "member/result";
	}
}
