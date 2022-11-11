package main.com.twitter.util;

import java.util.Base64;

public class EncodeDecode {
	public static String encode(String str) {
		return Base64.getEncoder().encodeToString(str.getBytes());
	}
}
