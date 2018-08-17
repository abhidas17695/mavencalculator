package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSub {

	@Test
	public void testSub() {
		Calc obj=new Calc();
		assertEquals(10,obj.subtract(12,2));
	}

}
