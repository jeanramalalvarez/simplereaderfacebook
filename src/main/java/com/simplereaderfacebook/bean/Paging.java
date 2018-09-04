package com.simplereaderfacebook.bean;

public class Paging {

	private Cursors cursors;
	
	private String next;

	@Override
	public String toString() {
		return "Paging [cursors=" + cursors + ", next=" + next + "]";
	}

	public Cursors getCursors() {
		return cursors;
	}

	public void setCursors(Cursors cursors) {
		this.cursors = cursors;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

}