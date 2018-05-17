package com.qa.mathoperation;


import org.junit.Test;

import org.junit.Assert;

public class MultiplyTest {

	@Test
	public void test() {
		
		Multiply multi = new Multiply();
		int actual = multi.multiply(13,2);
		Assert.assertEquals(26, actual);
	}

}
