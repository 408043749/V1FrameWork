/*
 * $Id: Login.java 471756 2006-11-06 15:01:43Z husted $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.panlj.system.action;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.panlj.system.dao.UserDao;
import com.panlj.system.domain.User;
import com.panlj.system.domain.UserSession;
import com.panlj.system.service.UserService;



@Controller
@RequestMapping("/system/*")
public class LoginAction  {
	
	@Resource
	private UserDao userDao;
	@Resource
	private UserService userService;
	
	@RequestMapping("index")
	public String index(Model model){
		return "index";
	}
	
	@RequestMapping("login")
	public String loginForm(@ModelAttribute("user")User user,HttpServletRequest request,HttpServletResponse response, Model model){
		User userTemp = userDao.findByUsername(user.getUsername());
		if(userTemp!=null){
			String pwdTemp = userTemp.getPassword();
			
			//使用Sring 盐值加密算法加密，盐值为用户名*************************************************
			Md5PasswordEncoder md5 = new Md5PasswordEncoder();
			String  pwd = md5.encodePassword(user.getPassword(), user.getUsername());
			if(pwdTemp.equals( pwd)){
				System.out.println("用户名："+user.getUsername()+",成功登陆!");
				//设置UserSession
				UserSession userSession = new UserSession();
				userSession.setName(userTemp.getName());
				userSession.setUsername(userTemp.getUsername());
				HttpSession session = request.getSession();
				session.setAttribute("userSession", userSession);
				try {
					response.sendRedirect("/system/main/index");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "login";
	}
	
	public static void main(String[] args) {
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		String  pwd = md5.encodePassword("123456", "admin");
		System.out.println(pwd);
	}
	
}