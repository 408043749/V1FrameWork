package com.panlj.system.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.panlj.system.dao.MenuDao;
import com.panlj.system.domain.Menu;

@Controller
@RequestMapping("/system/menu/*")
public class MenuAction extends ModelAction<Menu>{
	@Resource
	private MenuDao menuDao;
	
	
	@RequestMapping("save")
	public @ResponseBody Object save(){
		Menu menu = new Menu();
		menuDao.save(menu);
		return "success";
	}
	
	@RequestMapping("getMenuByParentUuidJson")
	public @ResponseBody Object getMenuByParentUuidJson(@RequestParam(required=false) String node, HttpServletRequest request,HttpServletResponse response,Model model){
		//model.addAttribute("root", menuList);
		if(StringUtils.isNotEmpty(node) && !node.equals("0")){
			List<Menu> menuList = menuDao.findByParent_Id(node);
			return menuList;
		}else{
			model.addAttribute("root", menuDao.findById("402880bf3feadfb2013feae0e1f90000"));
		}
		return model;
		//return model;
	}
	

}
