package com.panlj.system.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import com.panlj.system.util.CaptchaSinglgeFactory;

public class CaptchaFilter implements Filter{
	private String failureUrl ;//验证失败跳转地址  

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain  filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)servletRequest;
		HttpServletResponse response = (HttpServletResponse)servletResponse;
		String j_image = request.getParameter("j_image");
		DefaultManageableImageCaptchaService cpCaptchaService = CaptchaSinglgeFactory.getInstance();
		Boolean istrue = cpCaptchaService.validateResponseForID(request.getSession().getId(), j_image);
		if(istrue) filterChain.doFilter(servletRequest, servletResponse);
		else  response.sendRedirect(failureUrl);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		failureUrl = filterConfig.getInitParameter("failureUrl");
	}

}
