package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.dto.User;


@Controller
public class UserController {

	private static final Logger logger  = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/user/main.do")
		public void main(HttpSession session) {
		
	}
	
	@RequestMapping(value="/user/sign.do", method=RequestMethod.GET)
		public String join() {
		
		return "user/sign";
	}
	
	@RequestMapping(value="/user/sign.do", method=RequestMethod.POST)
	public ModelAndView joinproc(User user, String id, String pw, String email, String phone) {
		
		logger.info("id=" + id +", pw=" +pw +", email=" + email +", phone=" + phone );
		logger.info(user.toString());
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("user", user);
		
		mav.setViewName("redirect:/member/main.do");
		
		
	
	return mav;
	}
	
	@RequestMapping(value="/user/login.do", method=RequestMethod.GET)
	public String login() {
	
	return "user/login";
	}

	@RequestMapping(value="/user/login.do", method=RequestMethod.POST)
	public String loginProc(User user) {
	
	return "redirect:/member/main.do";
	}
	
	@RequestMapping(value="/user/mypage.do")
	public String mypage() {
	
	return "user/mypage";
	}
	
	@RequestMapping(value="/user/logout.do")
	public String logout() {
	
	return "redirect:/member/main.do";
	}
}
