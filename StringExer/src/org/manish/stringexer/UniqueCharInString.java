package org.manish.stringexer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class UniqueCharInString {

	public static void main(String[] args) {

		System.out.println("Please enter a String: ");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		
		CheckUniqueChar(word);
						
	}
	
	public static void CheckUniqueChar(String word){
		word.toLowerCase();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character c: word.toCharArray()){
			charMap.put(c, charMap.containsKey(c) ? charMap.get(c)+1: 1);
		}
		
		//Since hashMap doesn't maintain order, loop through the String
		for(Entry<Character, Integer> entry: charMap.entrySet()){
			if(entry.getValue() == 1){
				System.out.println("Unique Char: "+entry.getKey());
			}else{
				System.out.println("No unique Chars");
			}
		}
		
		
	}

}
