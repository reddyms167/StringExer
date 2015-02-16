package org.manish.stringexer;

public class DummyString {

	public static void main(String[] args) {

		StringBuilder sample = new StringBuilder();
		sample.append("Test Text");
		
		for(int i=0;i<100;i++){
			System.out.println(sample.append(i).toString());
			
		}
		
		
		
		
	}

}
