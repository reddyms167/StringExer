package org.manish.stringexer;

import java.util.regex.Pattern;

public class DemoTest {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile(".*[^0-9].*");

		String[] numbers = { "123", "1234", "123.12", "abcd123", "123456" };
		Pattern digitPattern = Pattern.compile("\\d{6}");
		// Pattern digitPattern = Pattern.compile("\\d\\d\\d\\d\\d\\d");

		for (String number : numbers) {
			System.out.println("does " + number + " is 6 digit number : "
					+ digitPattern.matcher(number).matches());
		}

	}

}
