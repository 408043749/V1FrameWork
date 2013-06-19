package com.panlj.blog.action;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import com.panlj.blog.dao.ArticleDao;
import com.panlj.blog.domain.Article;
import com.panlj.blog.domain.OperateMsg;

@RequestMapping("/jsp/blog/article/*")
@Controller
public class ArticleAction {
	@Resource
	private ArticleDao articleDao;

	@RequestMapping(value="save",method= RequestMethod.POST)
	public @ResponseBody Object save(@ModelAttribute("article")Article article,BindingResult bindingResult, SessionStatus sessionStatus ,HttpServletRequest request){
		if(article.getId()!=null){
			OperateMsg operateMsg = new OperateMsg();
			//operateMsg.setAddedUser(request.getSession().getAttribute("session"));
			operateMsg.setAddedTime(new Date());
			article.setOperateMsg(operateMsg);
		}
		System.out.println("保存**************************");
		articleDao.save(article);
		return "success";
	}
	
	@RequestMapping("edit")
	public String edit(Model model){
		model.addAttribute("article", new Article());
		return "edit";
	}
}
