package com.panlj.system.action;

import java.io.IOException;
import java.io.Writer;
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
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.panlj.system.dao.MenuDao;
import com.panlj.system.dao.UserDao;
import com.panlj.system.domain.User;

@Controller
@RequestMapping("/spring/system/user/*")
@RemotingDestination(channels={"my-amf"},value="helloWorld")
public class UserAction extends ModelAction<User>{
	@Resource
	private UserDao userDao;
	
	@Resource
	private MenuDao menuDao;
	
	@RequestMapping("list")
	public String list(@ModelAttribute("user") User user,HttpServletRequest request,HttpServletResponse response,Model model){
		 List<User> userList =  null;
		 userList =  findAll(buildSpecification(user), buildPageRequest(request), userDao,model) .getContent();
		 model.addAttribute("userList", userList);
		 pageHandle(model);//传递分页参数
		 model.addAttribute("user", new User());//查询条件空对象
		 
		return "list";
	}
	
	@RequestMapping("getUserListJson")
	public  @ResponseBody  Object getUserListJson(HttpServletRequest request,HttpServletResponse response,Model model){
		 List<User> userList =  null;
		 //userList =  findAll(null, buildPageRequest(request), userDao,model) .getContent();
		 userList =  (List<User>)userDao.findAll();
		 pageHandle(model);//传递分页参数
		 model.addAttribute("userList", userList);

		 //return "jsontournamenttemplate";
		 return model;
	}
	
	@RequestMapping("edit")
	public String edit(Model model,@RequestParam Long id){
		if(id!=null){
			model.addAttribute("user", userDao.findOne(id));//查询条件空对象
		}else{
			model.addAttribute("user", new User());//查询条件空对象
		}
		
		return "edit";
	}
	
	@RequestMapping("save")
	public @ResponseBody Object save(HttpServletRequest request,HttpServletResponse response,Model model){
		model.addAttribute("success", true);
		return model;
	}
	
	@RequestMapping("getUserJson")
	public  void getUserJson(@RequestParam String query, Writer writer){
		List<User> userList = userDao.findByUsernameLike("%"+query+"%");
		List<String> userNameList = new ArrayList<String>();
		for(User user:userList){
			userNameList.add(user.getUsername());
		}
		String userStr = userNameList.toString();
		if(userStr.length()>0) userStr = userStr.substring(1, userStr.length()-1);
		try {
			writer.write(userStr.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Specification<User> buildSpecification(final User user) {
		return new Specification<User>() {
			public Predicate toPredicate(Root<User> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				if(StringUtils.isNotEmpty(user.getName())){
					query.where(cb.like(root.<String>get("name"), "%"+user.getName()+"%"));
				}
				return null;
			}
		};
	}
	
	public String helloWorld(){
		return "hellow";
	}
}
