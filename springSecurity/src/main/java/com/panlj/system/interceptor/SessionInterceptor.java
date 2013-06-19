package com.panlj.system.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.panlj.system.domain.UserSession;


public class SessionInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2, ModelAndView modelAndView) throws Exception {
		System.out.println("*******请求处理完成*****");

		//1,取得请求传递的时间
		long starttime =  (Long)request.getAttribute("starttime");
		request.removeAttribute("starttime");
		long endtime =  System.currentTimeMillis();
		
		//传递给视图模式对象，便于页面获取
		if(modelAndView!=null)modelAndView.addObject("handingTime", endtime-starttime);
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		System.out.println("*******一个新请求*****");

		long starttime =  System.currentTimeMillis();
		request.setAttribute("starttime", starttime);
		

		/*//1，判断会话session是否存在
		if(!request.getRequestURI().startsWith("/system/user")){
			HttpSession  session = request.getSession();
			UserSession userSession = (UserSession)session.getAttribute("userSession");
			if(userSession==null){		
				response.sendRedirect("/system/user/index");
				return false;
			}
		}*/
		return true;
	}

}
