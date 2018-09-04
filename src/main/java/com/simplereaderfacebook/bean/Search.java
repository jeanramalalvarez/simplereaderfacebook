package com.simplereaderfacebook.bean;

import java.util.List;

public class Search {

	private List<Place> data = null;
	
	private Paging paging;
	
	private Error error;

	@Override
	public String toString() {
		return "Search [data=" + data + ", paging=" + paging + ", error=" + error + "]";
	}

	public List<Place> getData() {
		return data;
	}

	public void setData(List<Place> data) {
		this.data = data;
	}

	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	
	public Error getError() {
		return error;
	}
	
	public void setError(Error error) {
		this.error = error;
	}

}