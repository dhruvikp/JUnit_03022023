package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class C_CalculatorTest {

	Calculator calculator ;
	
	@BeforeEach
	void init() {
		calculator = new Calculator();
	}
	
	@Test
	public void test_calculate_when_both_arg_pos() {
		// STEP 1 : Prepare input
		int a = 1;
		int b = 1;
		
		// STEP 2 : Gets actual value
		int actual = calculator.calculate(a, b);
		
		// STEP 3: Set expectation
		int expected = 2;
		
		// STEP 4: Use Assertions API to match Expectation with actual
		Assertions.assertEquals(expected, actual);
	}
}
