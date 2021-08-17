package com.sameer.jUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountVowelsTest
{
   
    @Test
    public void countVowelTest()
    {
    	App app = new App();
    	
    	int output = app.countVowels("Government");
        assertEquals( 3,output );
    }
}
