package com.qa.mathoperation;


import org.junit.Test;
import org.junit.Assert;

public class SubtractorTest {

	@Test
	public void test() {
		
		Subtractor sub = new Subtractor();
		int actual = sub.subtract(24,13);
		Assert.assertEquals(11, actual);
	}

}
