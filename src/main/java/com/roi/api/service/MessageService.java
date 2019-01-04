package com.roi.api.service;

import com.roi.api.model.Message;

public class MessageService {
		
	public Message addMessage(Message message)
	{
		message.setStatus("Success");
		return message;
	}
}
