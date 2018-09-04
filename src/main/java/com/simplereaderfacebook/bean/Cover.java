package com.simplereaderfacebook.bean;

import com.google.gson.annotations.SerializedName;

public class Cover {

	@SerializedName("cover_id")
	private String coverId;

	@SerializedName("offset_x")
	private int offsetX;
	
	@SerializedName("offset_y")
	private int offsetY;
	
	private String source;
	
	private String id;

	@Override
	public String toString() {
		return "Cover [coverId=" + coverId + ", offsetX=" + offsetX + ", offsetY=" + offsetY + ", source=" + source
				+ ", id=" + id + "]";
	}

	public String getCoverId() {
		return coverId;
	}

	public void setCoverId(String coverId) {
		this.coverId = coverId;
	}

	public int getOffsetX() {
		return offsetX;
	}

	public void setOffsetX(int offsetX) {
		this.offsetX = offsetX;
	}

	public int getOffsetY() {
		return offsetY;
	}

	public void setOffsetY(int offsetY) {
		this.offsetY = offsetY;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}