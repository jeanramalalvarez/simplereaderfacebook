package com.simplereaderfacebook.bean;

import java.util.List;

public class Photos {

	private List<Photo> data = null;
	
	private Paging paging;

	@Override
	public String toString() {
		return "Photos [data=" + data + ", paging=" + paging + "]";
	}

	public List<Photo> getData() {
		return data;
	}

	public void setData(List<Photo> data) {
		this.data = data;
	}

	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

}