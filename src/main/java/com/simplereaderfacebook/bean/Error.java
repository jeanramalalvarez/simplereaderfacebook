package com.simplereaderfacebook.bean;

import com.google.gson.annotations.SerializedName;

public class Error {
	
	private String message;
	
	private String type;
	
	private String code;
	
	private String error_subcode;
	
	@SerializedName("fbtrace_id")
	private String fbtraceId;
	
	@Override
	public String toString() {
		return "Error [message=" + message + ", type=" + type + ", code=" + code + ", error_subcode=" + error_subcode
				+ ", fbtraceId=" + fbtraceId + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getError_subcode() {
		return error_subcode;
	}

	public void setError_subcode(String error_subcode) {
		this.error_subcode = error_subcode;
	}

	public String getFbtraceId() {
		return fbtraceId;
	}
	
	public void setFbtraceId(String fbtraceId) {
		this.fbtraceId = fbtraceId;
	}

}
