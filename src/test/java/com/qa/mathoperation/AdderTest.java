package com.qa.mathoperation;



import org.junit.Test;
import org.junit.Assert;

public class AdderTest {

	@Test
	public void test() {
		Adder adder = new Adder();
		int actual = adder.add(2,2);
		Assert.assertEquals(4, actual);
	}

}
