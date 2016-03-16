package com.galpon.rest;

import org.junit.Test;

import com.galpon.rest.SumController;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for SumController.
 */
public class SumControllerTest {
		
	@Test
	public void sumEmptyTest() {
		SumController sumController = new SumController();
		assertEquals(sumController.sum(0, 0), "0 + 0 = 0");
	}
	
		@Test
		public void sumTest() {
			SumController sumController = new SumController();
			assertEquals(sumController.sum(1, 2), "1 + 2 = 3");
		}
		
}
