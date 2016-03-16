package com.galpon.rest;

import org.junit.Test;

import com.galpon.rest.Greeting;
import com.galpon.rest.GreetingController;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for GreetingController.
 */
public class GreetingControllerTest {
		
		@Test
		public void greetingNameTest() {
			GreetingController greetingController = new GreetingController();
			Greeting greeting = greetingController.greeting("TEST");
			assertEquals(greeting.getName(), "Hi, TEST!");
		}

		@Test
		public void greetingCounterTest() {
			GreetingController greetingController = new GreetingController();
			Greeting greeting = greetingController.greeting("TEST");
			assertEquals(greeting.getId(), 1);
			greeting = greetingController.greeting("TEST");
			assertEquals(greeting.getId(), 2);
		}
		
}
