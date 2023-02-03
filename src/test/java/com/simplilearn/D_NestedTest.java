package com.simplilearn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Nested Test example")
public class D_NestedTest {

	@Nested
	@DisplayName("Nested class A")
	class A {

		@Test
		@DisplayName("Nested test")
		void test() {
			System.out.println("Nested test executed..");
		}
	}
}