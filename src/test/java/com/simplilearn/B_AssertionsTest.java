package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_AssertionsTest {

	@Test
	public void test() {
		int actual = 2;
		int expected = 2;
		
		Assertions.assertEquals(expected, actual);
		
		String str = null;
		Assertions.assertNull(str);
		
		String[] a1 = {"A","B"};
		String[] a2 = {"A","B"};
		
		Assertions.assertArrayEquals(a1, a2);
		
	}
}
