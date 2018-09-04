package com.simplereaderfacebook.common;

public class ParametersException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParametersException() {
	}

	public ParametersException(String arg0) {
		super(arg0);
	}

	public ParametersException(Throwable arg0) {
		super(arg0);
	}

	public ParametersException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ParametersException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
