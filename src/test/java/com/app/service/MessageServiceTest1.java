package com.app.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

/*
 * birim testi sadece bir birimi test eder. o nedenle bagimlilikleri izole edilmesi gerekir
 * bylece bagimlikilarin yan etkilerinin oonlenmesi saglanir
 * gercek nesneler beklenmedik durumlara neden olabilir
 * gercek nesneler yavas calisabilir ve zor bir sekilde yapilandirilir
 * gercek nesneeler tekrar edilebilir olmayabilir
 * java da mocking islemleri yapabilmek icin mockito jmockit ve easymock kutuphanesler kullaniabilri
 * 
 */

class MessageServiceTest1 {

	@Test
	void addMessageTest() {
		MessageService service = mock(MessageService.class);

		service.addMessage("merhbva");
		service.addMessage("mockito");

		verify(service).addMessage("merhbva");
	}

	@Test
	void howManyCallTest() {
		MessageService service = mock(MessageService.class);
		service.addMessage("merhbva");
		service.addMessage("mockito");
		service.addMessage("merhbva");
		service.addMessage("mockito");

		verify(service, times(2)).addMessage("mockito");

		//verify(service, never()).removeMessages(any());

		//verify(service, atLeast(2)).addMessage("merhaba");
	}
	
	@Test
	void callOrderTest() {
		MessageService service=mock(MessageService.class);
		service.addMessage("Merhaba");
		service.addMessage("Mockito");
		
		InOrder inOrder=Mockito.inOrder(service);
		
		inOrder.verify(service).addMessage("Merhaba");
		inOrder.verify(service).addMessage("Mockito");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
