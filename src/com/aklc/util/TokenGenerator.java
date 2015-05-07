package com.aklc.util;

import java.util.UUID;

public class TokenGenerator {

	public static String newToken() {
		return UUID.randomUUID().toString();
	}

	public static void main (String arg[]) {
		System.out.println(newToken());
		System.out.println(newToken());
		System.out.println(newToken());
		System.out.println(newToken());
		System.out.println(newToken());
		System.out.println(newToken());
		System.out.println(newToken());
		System.out.println(newToken());
		System.out.println(newToken());
		
	}
}
