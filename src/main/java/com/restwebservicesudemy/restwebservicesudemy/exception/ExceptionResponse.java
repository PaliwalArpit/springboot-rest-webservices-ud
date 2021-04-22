package com.restwebservicesudemy.restwebservicesudemy.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;
	private String message;
	private String detais;
	public ExceptionResponse(Date timestamp, String message, String detais) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detais = detais;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public void setDetais(String detais) {
		this.detais = detais;
	}
}
