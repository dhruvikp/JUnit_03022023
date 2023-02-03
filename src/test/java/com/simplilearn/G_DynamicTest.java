package com.simplilearn;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class G_DynamicTest {

	Calculator calc;

	@BeforeEach
	void init() {
		calc = new Calculator();
	}

	@TestFactory
	Collection<DynamicTest> tests() {
		Collection<DynamicTest> dynamicTests = new ArrayList<DynamicTest>();

		dynamicTests.add(DynamicTest.dynamicTest("Calculate when both args are positive", () -> {
			Assertions.assertEquals(2, calc.calculate(1, 1));
		}));
		
		dynamicTests.add(DynamicTest.dynamicTest("Calculate when both args are negative", () -> {
			Assertions.assertEquals(-2, calc.calculate(-1, -1));
		}));
		
		dynamicTests.add(DynamicTest.dynamicTest("Calculate when one is pos and another is neg", () -> {
			Assertions.assertEquals(0, calc.calculate(-1, 1));
		}));

		return dynamicTests;
	}
}
