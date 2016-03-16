package com.galpon.rest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.galpon.rest.TimeController;

/**
 * Unit test for TimeController.
 */
public class TimeControllerTest {

	@Test
	public void timeControllerTest() {
		TimeController timeController = new TimeController();
		assertNotNull(timeController.time());
	}

}
