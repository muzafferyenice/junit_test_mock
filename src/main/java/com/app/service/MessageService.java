package com.app.service;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.app.repository.MessageRepository;

public class MessageService {
	private MessageRepository repository;
	
	public MessageService(MessageRepository repository) {
		this.repository=repository;
	}
	public List<String> getMessages(){
		try {
			return repository.getMessages();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Arrays.asList();
		}
	}
	
	public List<String> getMessageWithLengthLessThanFive() {
		try {
			return repository.getMessages().stream().filter(m->m.length()<5)
			.collect(Collectors.toList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Arrays.asList();
		}
		
	}
	
	
	public void addMessage(String message) {
		repository.addMessages(message);
	}
	public void removeMessages(String message){
		repository.removeMessages(message);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
