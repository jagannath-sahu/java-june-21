package com.java.examples;

import java.util.HashMap;
import java.util.Map;

public class UsingTrimInString {

	private static Map<String, String> responses = new HashMap<String, String>();

	public static void main(String[] args) {
		String responseString = "" +
                "        CLASS_NUMBER=000509,\n" +
                "        LOCATION=RAM," +
                "        CLASS_ID=10085";
		if (!responseString.isEmpty()) {
            String responseStr[] = responseString.split(",");
            for (String responseS : responseStr) {
                String[] rest = responseS.split("=");
				responses.put(rest[0].trim(), rest[1].trim());
            }
        }
		System.out.println(responses);
	}

}
