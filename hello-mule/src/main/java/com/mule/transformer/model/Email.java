package com.mule.transformer.model;

public class Email {
	
	
	
	private String content;
	private String addr;
	
	public Email(String content, String addr) {
		this.addr = addr;
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	@Override
	public String toString() {
		return "content=" + content + ",addr=" + addr;
	}
	
}
