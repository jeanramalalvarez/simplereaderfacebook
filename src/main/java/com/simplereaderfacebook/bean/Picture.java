package com.simplereaderfacebook.bean;

public class Picture {

	private Data data;

	@Override
	public String toString() {
		return "Picture [data=" + data + "]";
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}