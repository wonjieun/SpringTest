package web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//세션 생성, 확인, 삭제
@Controller
public class SessionTestController {
	
	//HttpSession session → 멤버 필드로 만들어서 사용한다고 생각해보면 @Autowired를 사용하면 bean으로 자동으로 사용가능!!
	
	//VIEW : /WEB-INF/views/session/create.jsp
	@RequestMapping(value="/session/create.do")
	public void sessionCreate(HttpSession session) {
		//http 세션이라는 객체 필요 → HttpSession session
		
		session.setAttribute("test1", "Apple");
		session.setAttribute("test2", 123456);
		session.setAttribute("test3", true);
	}
	
	//세션을 확인 할 수 있는 페이지
	@RequestMapping(value="/session/info.do")
	public void sessionInfo() {
		//세션 객체를 만들지 않는다
	}
	
	//세션을 삭제
	@RequestMapping(value="/session/delete.do")
	public void sessionDelete(HttpSession session) {
		//세션 삭제
		session.invalidate();
	}
	
}
