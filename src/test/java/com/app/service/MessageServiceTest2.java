package com.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import com.app.repository.MessageRepository;

@ExtendWith(MockitoExtension.class)//junit kodlarini daha islevsel hale getirir
public class MessageServiceTest2 {

	@Mock
	MessageRepository repository;
	
	@InjectMocks//bu annot ustteki mocklanan tum nesneleri asagidaki service in icine enjekte edeiyor
	MessageService service;
	
	@Test
	public void testGetMessageWithLengthLessThanFive(){
		
		try {
			when(repository.getMessages()).thenReturn(Arrays.asList("Junit","mockito","mock","Test","message"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.getMessageWithLengthLessThanFive();
		
		List<String> actualList=service.getMessageWithLengthLessThanFive();
		
		assertNotNull(actualList);
		
		assertEquals(2, actualList.size());
		
	}
	@Test
	void testException() {
		try {
			when(repository.getMessages()).thenThrow(new SQLException("Connection Exception"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> message=service.getMessages();
		
		assertNotNull(message);
		
		assertEquals(0, message.size());
	}
	
	
	
	
	
	
	
}
