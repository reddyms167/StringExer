package org.manish.stringexer;

import java.util.regex.Pattern;

public class NumberInString_Regex {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile(".*[^0-9].*");
		
		String [] inputs = {"124", "-123" , "123aydf.12", "abcd123"};
		
		for(String in: inputs){
			System.out.println("does " + in+" is number: "+ !pattern.matcher(in).matches());
		}
		
		
	}

}
