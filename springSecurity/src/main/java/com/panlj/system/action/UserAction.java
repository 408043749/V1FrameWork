package com.panlj.system.action;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.panlj.system.dao.UserDao;
import com.panlj.system.domain.User;

@Controller
@RequestMapping("/system/user/*")
public class UserAction extends ModelAction<User>{
	@Resource
	private UserDao userDao;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response,Model model){
		Page<User>  page=  userDao.findAll(buildSpecification(),buildPageRequest());
		 List<User> userList =  userDao.findAll(buildSpecification(),buildPageRequest()).getContent();
		 userList = userDao.findAll(buildPageRequest()).getContent();
		 //List<User> userList = (List<User>) userDao.findAll();
		 System.out.println(userList.toString());
		 model.addAttribute("userList", userList);
		return "list";
	}
	
	@Override
	public Specification<User> buildSpecification() {
		return new Specification<User>() {
			@Override
			public Predicate toPredicate(Root<User> arg0,
					CriteriaQuery<?> arg1, CriteriaBuilder arg2) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
