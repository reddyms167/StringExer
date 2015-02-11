package org.manish.stringexer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) throws IOException {

/*		System.out.println("Enter a string to check for anagrams: ");

		Scanner input = new Scanner(System.in);
		String word = input.next();
		
		System.out.println("Enter the second String: ");
		Scanner in = new Scanner(System.in);
		String anagram = in.nextLine();*/

		System.out.println(checkAnagram("mar", "arm"));

	}

	public static boolean checkAnagram(String word, String anagram) {
		
		if (word.length() != anagram.length()) {
			return false;
		}

		char[] characters = word.toCharArray();
		StringBuilder anagrmBuilder = new StringBuilder(anagram);

		for (char c : characters) {
			int index = anagrmBuilder.indexOf("" + c);
			if (index != -1) {
				anagrmBuilder.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return anagrmBuilder.length() == 0 ? true : false;
	}

}
