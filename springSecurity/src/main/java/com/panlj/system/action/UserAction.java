package com.panlj.system.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.panlj.system.dao.UserDao;
import com.panlj.system.domain.User;

@Controller
@RequestMapping("/system/user/*")
public class UserAction extends ModelAction<User>{
	@Resource
	private UserDao userDao;
	
	@RequestMapping("list")
	public String list(@ModelAttribute("user") User user,HttpServletRequest request,HttpServletResponse response,Model model){
		 List<User> userList =  null;
		 userList =  findAll(buildSpecification(user), buildPageRequest(request), userDao,model) .getContent();
		 model.addAttribute("userList", userList);
		 pageHandle(model);//传递分页参数
		 System.out.println("user.name"+user.getName());
		 model.addAttribute("user", new User());
		return "list";
	}
	
	public Specification<User> buildSpecification(final User user) {
		List<Specification<User>> listSpecifications = new ArrayList<Specification<User>>();
		Specification<User> specification = new Specification<User>() {
			
			@Override
			public Predicate toPredicate(Root<User> arg0, CriteriaQuery<?> arg1,
					CriteriaBuilder arg2) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		if(StringUtils.isNotEmpty(user.getName())) {
			listSpecifications.add(new Specification<User>() {
				public Predicate toPredicate(Root<User> root,
						CriteriaQuery<?> arg1, CriteriaBuilder cb) {
					// TODO Auto-generated method stub
					return cb.like(root.<String>get("name"), user.getName());
				}
			});
		}
		
		return listSpecifications.toArray(new Specification<User>[0]);
	}
}
