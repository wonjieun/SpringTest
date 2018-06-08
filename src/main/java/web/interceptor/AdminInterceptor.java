package web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AdminInterceptor extends HandlerInterceptorAdapter {
	//컨트롤러가 아니니까 어노테이션이 필요 없어요
	
	private static final Logger logger = LoggerFactory.getLogger(AdminInterceptor.class);
	
	//컨트롤러에서 갖고 있는 요청 응답 객체 request, response
	//bean으로 항상 등록을 시켜줘야 한다
	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		
		logger.info("+++ INTERCEPTOR START +++");
		logger.info("Requset URI : " + request.getRequestURI());
		
		HttpSession session = request.getSession();
		if(session.getAttribute("login") == null) {
			//비로그인 상태
			logger.info(">> 접속 불가: 로그인 되지 않았어!!");
			response.sendRedirect("/interceptor/admin/adminFail.do");
			return false; //컨트롤러 접근 금지
		} else {
			if(!"관리자".equals(session.getAttribute("nick"))) {
				//일반사용자 상태
				logger.info(">> 접속 불가: 관리자가 아니다!!");
				response.sendRedirect("/interceptor/admin/adminFail.do");
				return false; //컨트롤러 접근 금지
			}
		}
		//관리자 로그인 상태
		//컨트롤러의 접근을 허용
		//컨트롤러의 접근을 금지 return false;
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		logger.info("+++ INTERCEPTOR END +++");
		
		super.postHandle(request, response, handler, modelAndView);
	}
	
}
