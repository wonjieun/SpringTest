package web.controller;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InterceptorTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(InterceptorTestController.class);
	
	//관리자 id, 일반 사용자 id
	//메인 화면을 띄우자고~!!
	
	@RequestMapping(value="/interceptor/main.do", method=RequestMethod.GET)
	public void main() {
		logger.info("메인 페이지 활성화");
	}
	
	//컨트롤러 메소드 3개 필요
	//로그인
	@RequestMapping(value="/interceptor/login.do", method=RequestMethod.GET)
	public void login() {
		//로그인 폼을 먼저 띄운다!!
		logger.info("로그인 폼 활성화");
	}
	
	//로그인 process
	@RequestMapping(value="/interceptor/loginProc.do", method=RequestMethod.POST)
	public String loginProcess(String id, String pw, HttpSession session) {
		//로그인 폼을 먼저 띄운다!!
		logger.info("로그인 처리 활성화");
		
		//인증 과정(일반 사용자, 관리자, 인증 실패)
		if("abc".equals(id)) {
			logger.info("일반사용자 로그인");
			session.setAttribute("login", true);
			session.setAttribute("nick", "지오");
			
		} else if ("admin".equals(id)) {
			logger.info("관리자 로그인");
			session.setAttribute("login", true);
			session.setAttribute("nick", "관리자");
			
		} else {
			logger.info("로그인 실패");
			return "redirect:/interceptor/login.do";
		}
		
		return "redirect:/interceptor/main.do";
	}
	
	//로그아웃
	@RequestMapping(value="/interceptor/logout.do", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		//로그아웃!!
		logger.info("로그아웃 활성화");
		
		session.invalidate();
		
		return "redirect:/interceptor/main.do";
	}
	
	@RequestMapping(value="/interceptor/board/list.do", method=RequestMethod.GET)
	public String boardlist() {
	
		logger.info("목록 보기 활성화");
		
		return "interceptor/board/list";
	}
}
