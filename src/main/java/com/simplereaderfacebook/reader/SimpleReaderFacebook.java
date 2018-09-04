package com.simplereaderfacebook.reader;

import java.util.Map;

import com.google.gson.Gson;
import com.simplereaderfacebook.common.ParametersException;
import com.simplereaderfacebook.common.Util;

public class SimpleReaderFacebook {
	
	private static String FACEBOOK_GRAPH_ENDPOINT_URL = "https://graph.facebook.com";
	
	public static String V2_11 = "v2.11";
	
	public static String LATEST = "v2.12";
	
	private String accessToken;
	
	private String version;
	
	protected SimpleReaderFacebook() {
	}
	
	public SimpleReaderFacebook(String accessToken, String version) {
		super();
		this.accessToken = accessToken;
		this.version = version;
	}

	public <T> T fetchConnection(String connection, Class<T> connectionType, Map<String, String> parameters) throws Exception {
		
		if(accessToken == null || accessToken.isEmpty()) {
			throw new ParametersException("token is required");
		}
		
		if(version == null || version.isEmpty()) {
			throw new ParametersException("version is required");
		}
		
		if(connection == null || connection.isEmpty()) {
			throw new ParametersException("connection is required");
		}
		
		if(connectionType == null) {
			throw new ParametersException("connection type is required");
		}
		
		if(parameters == null || parameters.isEmpty()) {
			throw new ParametersException("parameters is required");
		}
		
		String url = FACEBOOK_GRAPH_ENDPOINT_URL + "/" + version + "/" + connection + "?access_token=" + accessToken;

		if(parameters != null) {
			String parametersStr = "";
			for (Map.Entry<String, String> entry : parameters.entrySet()) {
				parametersStr += "&" + entry.getKey() + "=" + entry.getValue();
			}
			if(!parametersStr.isEmpty()) {
				url += parametersStr;
			}
		}
		
		String resultUrl = Util.readUrl(url);

		T resultGson = new Gson().fromJson(resultUrl, connectionType);
		
		return resultGson;
	}
	
	public <T> T fetchConnection(String url, Class<T> connectionType) throws Exception {
		String resultFacebook = Util.readUrl(url);

		T result = new Gson().fromJson(resultFacebook, connectionType);
		
		return result;
	}

}