package com.panlj.system.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public @ResponseBody Object getMenuByParentUuidJson(HttpServletRequest request,HttpServletResponse response,Model model){
		List<Menu> menuList = menuDao.findByParent_Uuid("402883823fc912e3013fc91499f70000");
		model.addAttribute("menulist", menuList);
		return model;
	}
	

}
