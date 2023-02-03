package com.simplilearn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class F_TestPublisherTest {

	@Test
	void test(TestReporter testReporter, TestInfo testInfo) {
		testReporter.publishEntry("Testcase name: ", testInfo.getDisplayName());
	}
	
}
