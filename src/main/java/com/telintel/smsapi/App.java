package com.telintel.smsapi;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  Go4Clients basic demo
 *
 */
public class App {
	
	
	public static void main(String[] args) {
		String url = "https://go4clients.com:8443/TelintelSms/api/sms/sendmessage";
		HttpPost postRequest = new HttpPost(url);
		ObjectMapper mapper = new ObjectMapper();

		try {

			String request = "{\"toList\" :[\"573188061583\"], \"message\":\"API from java\"}";
			HttpClient httpClient = HttpClientBuilder.create().build();

			postRequest.addHeader("Content-type", "application/json");
			postRequest.addHeader("Apikey", "daf6c3b8eddb4348b5b1aa7db726b234");
			postRequest.addHeader("Apisecret", "589508323630");

			StringEntity input = new StringEntity(request);
			input.setContentType("application/json");
			postRequest.setEntity(input);

			HttpResponse response = httpClient.execute(postRequest);

			Response entityResponse = mapper.readValue(response.getEntity().getContent(), Response.class);
			
			System.out.println(entityResponse.toString());
		} catch (Exception e) {			
			// Capture the possible exceptions
		} finally {
			if (postRequest != null) {
				postRequest.releaseConnection();
			}
		}
	}
}