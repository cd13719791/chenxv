package com.school.core;

public class ApiResult {
private Integer code =0;
private Object data;
private String message;
public Integer getCode() {
	return code;
}
public ApiResult() {
	super();
	// TODO Auto-generated constructor stub
}
public ApiResult(Integer code, String message, Object data) {
	super();
	this.code = code;
	this.data = data;
	this.message = message;
}
public ApiResult(Integer code, String message ) {
	super();
	this.code = code;
	this.message = message;
}
public void setCode(Integer code) {
	this.code = code;
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
}
