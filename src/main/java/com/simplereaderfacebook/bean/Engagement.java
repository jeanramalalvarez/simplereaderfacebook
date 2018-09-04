package com.simplereaderfacebook.bean;

import com.google.gson.annotations.SerializedName;

public class Engagement {

	private int count;
	
	@SerializedName("social_sentence")
	private String socialSentence;

	@Override
	public String toString() {
		return "Engagement [count=" + count + ", socialSentence=" + socialSentence + "]";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getSocialSentence() {
		return socialSentence;
	}

	public void setSocialSentence(String socialSentence) {
		this.socialSentence = socialSentence;
	}

}