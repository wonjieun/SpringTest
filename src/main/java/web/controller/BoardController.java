package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	private static final Logger logger
		= LoggerFactory.getLogger(BoardController.class);

	@RequestMapping(value="/board/list.do"
			, method=RequestMethod.GET)
	public void list() {
		logger.info("게시판 목록 활성화");
	}
	
	@RequestMapping(value="/board/write.do"
			, method=RequestMethod.GET)
	public void write() {
		logger.info("게시판 글쓰기 활성화");
	}
	
	@RequestMapping(value="/board/noLogin.do", method=RequestMethod.GET)
	public void noLogin() {
		logger.info("게시판 글쓰기 실패");
	}

}
