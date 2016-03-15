package com.galpon.app;

import static org.junit.Assert.*;

import org.junit.Test;

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
