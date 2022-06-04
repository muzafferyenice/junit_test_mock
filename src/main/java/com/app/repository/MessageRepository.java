package com.app.repository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class MessageRepository {

	private List<String> list=Arrays.asList("hello","merhaba","hola");
	
	public List<String> getMessages()throws SQLException{
		return list;
	
	}
	public void addMessages(String message){
		list.add(message);
		
	}
	public void removeMessages(String message){
		list.remove(message);
	
	}
	
}
