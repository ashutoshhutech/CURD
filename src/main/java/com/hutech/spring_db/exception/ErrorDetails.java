package com.hutech.spring_db.exception;

import java.sql.Date;

public class ErrorDetails {

	private Date timastamp;
	private String message;
	private String details;

	public ErrorDetails( Date timestamp, String message, String details) {
		super();
		this.timastamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimastamp() {
		return timastamp;
	}

	public void setTimastamp(Date timastamp) {
		this.timastamp = timastamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
