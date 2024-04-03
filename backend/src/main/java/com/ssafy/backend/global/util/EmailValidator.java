package com.ssafy.backend.global.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	private static final String EMAIL_REGEX =
			"^[a-zA-Z0-9_+&*-]+(?:\\." +
					"[a-zA-Z0-9_+&*-]+)*@" +
					"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
					"A-Z]{2,7}$";

	public static boolean isValidEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}