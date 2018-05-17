package com.qa.mathoperation;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		
		Division div = new Division();
		int actual = div.divide(130,5);
		Assert.assertEquals(26, actual);
	}

}
