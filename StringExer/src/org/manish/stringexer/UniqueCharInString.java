package org.manish.stringexer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharInString {

	public static void main(String[] args) {

		System.out.println("Please enter a String: ");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		
//		CheckUniqueChar(word);
		System.out.println(FirstUniqueChar(word));
						
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
	
	// Another Method
	public static char FirstUniqueChar(String word){
		word.toLowerCase();
		Set<Character> repeating = new HashSet<Character>();
		List<Character> nonRepeating = new ArrayList<Character>();
		for(int i=0;i<word.length();i++){
			Character letter = word.charAt(i);
			
			if(repeating.contains(letter)){
				continue;
			}
			if(nonRepeating.contains(letter)){
				nonRepeating.remove(letter);
				repeating.add(letter);
			}else{
				nonRepeating.add(letter);
			}
		}
		return nonRepeating.get(0);
		
	}
	

}
