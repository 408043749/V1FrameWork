package com.panlj.system.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/system/main/*")
@Controller
public class IndexAction {

	@RequestMapping("index")
	public String index(){
		return "index";
	}
}
