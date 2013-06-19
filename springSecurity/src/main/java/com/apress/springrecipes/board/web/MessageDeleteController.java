package com.apress.springrecipes.board.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apress.springrecipes.board.domain.Message;
import com.apress.springrecipes.board.service.MessageBoardService;

@Controller
@RequestMapping("/messageDelete*")
public class MessageDeleteController {
	@Resource
	private MessageBoardService messageBoardService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String messageDelete(@RequestParam(required=true,value="messageId")Long messageId,Model model){
		Message message = messageBoardService.findMessageById(messageId);
		messageBoardService.deleteMessage(message);
		model.addAttribute("messages",messageBoardService.listMessagees());
		return "redirect:messageList";
		
	}
}
