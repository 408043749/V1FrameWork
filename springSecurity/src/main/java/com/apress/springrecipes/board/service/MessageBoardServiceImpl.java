package com.apress.springrecipes.board.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.apress.springrecipes.board.domain.Message;


public class MessageBoardServiceImpl implements MessageBoardService {
	
	private Map<Long,Message> messages = new LinkedHashMap<Long,Message>();
	
	public List<Message> listMessagees() {
		// TODO Auto-generated method stub
		return null;
	}

	public synchronized void postMessage(Message message) {
		// TODO Auto-generated method stub
		message.setId(System.currentTimeMillis());
		messages.put(message.getId(),message);
	}

	public synchronized void deleteMessage(Message message) {
		// TODO Auto-generated method stub
		messages.remove(message.getId());
	}
	
	public Message findMessageById(Long messageId) {
		// TODO Auto-generated method stub
		return messages.get(messageId);
	}

}
