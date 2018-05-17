package com.qa.mathoperation;

import org.junit.Assert;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		
		Multiply multi = new Multiply();
		int actual = multi.multiply(13,2);
		Assert.assertEquals(26, actual);
	}

}
