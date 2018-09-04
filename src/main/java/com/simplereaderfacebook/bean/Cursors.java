package com.simplereaderfacebook.bean;

public class Cursors {

	private String before;
	
	private String after;

	@Override
	public String toString() {
		return "Cursors [before=" + before + ", after=" + after + "]";
	}

	public String getBefore() {
		return before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

}
