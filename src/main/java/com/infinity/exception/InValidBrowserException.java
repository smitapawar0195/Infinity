package com.infinity.exception;

public class InValidBrowserException extends Exception {

	private String msg;

	public InValidBrowserException(String browserName) {
		this.msg = "InValidBrowserException" + browserName;

	}

	@Override
	public String getMessage() {
		return this.msg;
	}
}
