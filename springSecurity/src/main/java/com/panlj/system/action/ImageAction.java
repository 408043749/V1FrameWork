package com.panlj.system.action;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;
import com.panlj.system.util.CaptchaSinglgeFactory;

@Controller
@RequestMapping("/spring/image/*")
public class ImageAction {
	
	@RequestMapping("captcha")
	public ModelAndView  genarateVerificationCode(HttpServletRequest request,HttpServletResponse response){
		try {
			response.setHeader("Cache-Control", "no-store");  
	        response.setHeader("Pragma", "no-cache");  
	        response.setDateHeader("Expires", 0);  
	        response.setContentType("image/jpeg");  
	        
			ServletOutputStream out = response.getOutputStream();
			DefaultManageableImageCaptchaService cpCaptchaService 
				= CaptchaSinglgeFactory.getInstance();
            String captchaId = request.getSession(true).getId();  
			BufferedImage challenge = (BufferedImage)cpCaptchaService.getChallengeForID(captchaId,request.getLocale());
			ImageIO.write(challenge,  "jpg", out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
	}
}
