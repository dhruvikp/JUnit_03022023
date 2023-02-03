package com.simplilearn;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class E_RepeatedTest {

	@RepeatedTest(1000)
	public void test() {
		System.out.println("Test executed");
	}
}
