package com.apress.springrecipes.board.web;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apress.springrecipes.board.domain.Message;
import com.apress.springrecipes.board.service.MessageBoardService;

@Controller
@RequestMapping("/messageList*")
public class MessageListController {
	@Resource
	private MessageBoardService messageBoardService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String generateLst(Model model){
		List<Message> messages = Collections.emptyList(); 
		messages = messageBoardService.listMessagees();
		model.addAttribute("messages",messages);		
		return "messageList";
	}


	@RequestMapping(method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("message")Message message,BindingResult result){
		if(result.hasErrors()){
			return "messagePost";
		}else{
			messageBoardService.postMessage(message);
			return "redirect:messageList";
		}
	}
}