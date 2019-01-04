package com.roi.api.model;

public class Message {

	private String Status;

	
	public Message()
	{
		
	}
	public Message(String Status)
	{
		this.Status= Status;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
}
