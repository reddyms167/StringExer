package org.manish.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.manish.stringexer.StringAnagram;

public class StringAnagramTest {

	@Test
	public void testCheckAnagram() {

	assertTrue(StringAnagram.checkAnagram("army", "mary"));
	
	}

}
