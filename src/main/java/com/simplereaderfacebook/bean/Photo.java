package com.simplereaderfacebook.bean;

import com.google.gson.annotations.SerializedName;

public class Photo {

	@SerializedName("created_time")
	private String createdTime;
	
	private String id;

	@Override
	public String toString() {
		return "Photo [createdTime=" + createdTime + ", id=" + id + "]";
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}