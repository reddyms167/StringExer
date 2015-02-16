package org.manish.stringexer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {
		System.out.println("Enter some text:");
		Scanner in = new Scanner(System.in);
		PrintAllVowelsAndConsonants(in.nextLine());
		in.close();

	}

	public static void PrintAllVowelsAndConsonants(String word) {
		int vowels = 0;
		int consonants = 0;

		// These are the ArrayList which store the vowels and consonants
		// respectively...
		List<Character> vowelList = new ArrayList<Character>();
		List<Character> consonantList = new ArrayList<Character>();

		// This loops through each character in the given string...

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelList.add(ch);
				vowels++;
			} else {
				consonantList.add(ch);
				consonants++;
			}
		}

		System.out.println("Vowels in String [" + word + "] : " + vowels
				+ " and consonants are " + consonants);

		System.out
				.println("-----------------------------------------------------");

		System.out.println("Vowels in the String [" + word + "] are: "
				+ vowelList);
		System.out.println("Consonants in the String [" + word + "] are: "
				+ consonantList);

	}

}