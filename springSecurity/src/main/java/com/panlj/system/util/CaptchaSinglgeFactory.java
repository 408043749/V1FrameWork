package com.panlj.system.util;
import com.octo.captcha.service.captchastore.FastHashMapCaptchaStore;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;


/**
 * 【作者】 		panlj
 * 【创建日期 】 2013-6-16 下午4:08:01
 * 【更新时间 】 
 * 【更新者 】 
 * 【标签】   	
 * 【说明】验证码单例 工厂
 */
public class CaptchaSinglgeFactory {
	
	private static  DefaultManageableImageCaptchaService captchaService = new DefaultManageableImageCaptchaService( new FastHashMapCaptchaStore(), new CaptchaEngine(), 180, 100000 , 75000);
	
	public static DefaultManageableImageCaptchaService getInstance(){
		return captchaService;
	}
}
