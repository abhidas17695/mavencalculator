package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMult {

	@Test
	public void testMult() {
		Calc obj=new Calc();
		assertEquals(20,obj.multiply(10,2));
	}

}
