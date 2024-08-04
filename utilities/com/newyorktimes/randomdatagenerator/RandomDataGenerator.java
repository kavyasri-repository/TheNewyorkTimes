package com.newyorktimes.randomdatagenerator;

import java.util.Random;

public class RandomDataGenerator {
	private static final String EMAIL_DOMAIN = "@example.com";
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final int EMAIL_LENGTH = 10;
	private static final int PASSWORD_LENGTH = 12;

	public static String generateRandomEmail() {
		StringBuilder email = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < EMAIL_LENGTH; i++) {
			email.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
		}
		email.append(EMAIL_DOMAIN);
		return email.toString();
	}

	public static String generateRandomPassword() {
		StringBuilder password = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < PASSWORD_LENGTH; i++) {
			password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
		}
		return password.toString();
	}
}