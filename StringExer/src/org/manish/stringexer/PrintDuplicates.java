package org.manish.stringexer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();

		// Process to find the duplicates in string

		char[] characters = word.toCharArray();

		Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (characterMap.containsKey(ch)) {
				characterMap.put(ch, characterMap.get(ch) + 1);
			} else {
				characterMap.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = characterMap.entrySet();
		System.out.printf("List of Duplicate Characters in String '%s' %n",
				word);

		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(),
						entry.getValue());
			}
		}
		

	}
}
