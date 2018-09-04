package com.simplereaderfacebook.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Util {
	
	public static String readUrl(String strUrl) throws IOException {
		
		String output = null;
		URL url = null;
		HttpURLConnection conn = null;
		
		try {

			url = new URL(strUrl);
			conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			
			BufferedReader br  = null;
			
			if (conn.getResponseCode() == 200) {
				br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			}else {
				br = new BufferedReader(new InputStreamReader((conn.getErrorStream())));				
			}

			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = br.read()) != -1) {
				sb.append((char) cp);
			}

			output = sb.toString();
			
		} catch (IOException e) {
			throw e;
		} finally {
			if(conn != null) {
				conn.disconnect();	
			}
		}
		
		return output;
	}


}