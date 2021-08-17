package com.sameer.jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void addTest() {
		App app = new App();
		
		int output = app.add(55, 55);
		
		assertEquals(110, output);
	}

}
