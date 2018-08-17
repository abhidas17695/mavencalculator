package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void testAdd() {
		Calc obj=new Calc();
		assertEquals(10,obj.add(7,3));
	}

}
