package com.simplilearn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class A_LifecycleTest {

	@BeforeAll
	public static void initAll() {
		System.out.println("before All invoked");
	}

	@BeforeEach
	public void init() {
		System.out.println("Before Each invoked");
	}

	@Test
	public void test1() {
		System.out.println("Testcase1");
	}
	
	@Test
	public void test2() {
		System.out.println("Testcase2");
	}
	
	
	@AfterEach
	public void after() {
		System.out.println("After Each invoked");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("After All is invoked");
	}
}
