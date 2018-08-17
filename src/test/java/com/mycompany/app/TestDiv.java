package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDiv {

	@Test
	public void testDiv() {
		Calc obj=new Calc();
		assertEquals(10,obj.divide(20,2));
	}

}
