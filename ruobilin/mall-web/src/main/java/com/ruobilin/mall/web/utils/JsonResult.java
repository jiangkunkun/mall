package com.ruobilin.mall.web.utils;

public class JsonResult {
	private boolean success;
	private String message;
	private Object data;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public JsonResult(boolean success, String message, Object data) {
		this.success = success;
		this.message = message;
		this.data = data;
	}
}
