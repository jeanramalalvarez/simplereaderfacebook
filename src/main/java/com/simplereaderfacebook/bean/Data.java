package com.simplereaderfacebook.bean;

import com.google.gson.annotations.SerializedName;

public class Data {

	private int height;
	
	@SerializedName("is_silhouette")
	private boolean isSilhouette;
	
	private String url;
	
	private int width;

	@Override
	public String toString() {
		return "Data [height=" + height + ", isSilhouette=" + isSilhouette + ", url=" + url + ", width=" + width + "]";
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isIsSilhouette() {
		return isSilhouette;
	}

	public void setIsSilhouette(boolean isSilhouette) {
		this.isSilhouette = isSilhouette;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
