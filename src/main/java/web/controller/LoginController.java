package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.dto.UserVo;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	// 메소드가 달라서 같은 url이라고 하더라도 다른 요청으로 받아들인다
	@RequestMapping(value="/login/login.do", method=RequestMethod.GET)
	public void login() { }
	
	@RequestMapping(value="/login/login.do", method=RequestMethod.POST)
	public ModelAndView loginProcess(UserVo userVo, String id, String pw) {
		logger.info("id=" + id + ", pw=" + pw);
		logger.info( userVo.toString() );
		
		//view에 model 전달하기
		ModelAndView mav = new ModelAndView();
  
		//view에 전달 될 model 설정
		//model.addAttribute("user", userVo); 역할
		mav.addObject("user", userVo);
  
		//view name 설정
		//return "login/result"; 역할
//	    mav.setViewName("/login/result");  //forwarding url주소가 바뀌지 않고 페이지만 이동한다.
  
  
		//response.sendRedirect("/login/main.do");
		mav.setViewName("redirect:/login/main.do");  //로그인 완료 시 메인으로  이동  redirect: 뒤에 요청 url을 적어준다. 
		return mav;
   }

	
	@RequestMapping(value="/login/main.do", method=RequestMethod.GET)
	public String main() {
		logger.info("main");
		
		return "login/main";
	}
	
}
