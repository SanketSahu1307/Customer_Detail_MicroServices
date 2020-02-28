package com.example.demo.handlingException;

import java.util.Date;

public class ErrorModal {
	private Date date;
	private String message;
	private String description;
	public Date getDate() {
		return date;
	}
	public String getMessage() {
		return message;
	}
	public String getDescription() {
		return description;
	}
	public ErrorModal(Date date, String message, String description) {
		super();
		this.date = date;
		this.message = message;
		this.description = description;
	}
	
}
