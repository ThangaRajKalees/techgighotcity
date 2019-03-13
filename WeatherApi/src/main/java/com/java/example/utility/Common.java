package com.java.example.utility;

import org.json.JSONException;
import org.json.JSONObject;

public class Common {
	public String getDaily(String jsonStr, String value) {
		try {
			JSONObject json = new JSONObject(jsonStr);
			return json.getString(value);
		} catch (JSONException e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
}
