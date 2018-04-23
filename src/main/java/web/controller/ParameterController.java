package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.Person;

@Controller
public class ParameterController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/param/param.do", method=RequestMethod.GET)
	public String main(Model model) {
		logger.info("/param/param.do -- STARTED");
		return "param/parameterForm";
	}
	
	@RequestMapping(value="/param/param.do", method=RequestMethod.POST)
	// parameter로 전달받은 객체는 자동으로 model에 들어간다
	// 이렇게 넣으면 model attribute로 자동으로 넣어짐
//	public String view(Person person, Model model) {
	public String view(Person person) {
		logger.info(person.toString());
//		model.addAttribute("data", person);
		return "param/parameterResult";
	}

}
