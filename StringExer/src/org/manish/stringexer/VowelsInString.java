package org.manish.stringexer;

import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {
		System.out.println("Enter some text:");
		Scanner in = new Scanner(System.in);
		countVowels(in.nextLine());
		in.close();

	}

	public static void countVowels(String word) {
		int vowels = 0;
		int consonants = 0;

		for (char ch : word.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;
			}

		}
		System.out.println("Vowels in the String [" + word + "] " + vowels
				+ " and the consonants: " + consonants);

	}
}