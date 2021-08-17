package com.sameer.jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {

	@Test
	public void subTest() {
		App app = new App();
		
		int output = app.sub(55, 55);
		
		assertEquals(0, output);
	}

}
