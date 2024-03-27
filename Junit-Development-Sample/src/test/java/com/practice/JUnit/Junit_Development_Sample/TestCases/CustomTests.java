package com.practice.JUnit.Junit_Development_Sample.TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.practice.JUnit.Junit_Development_Sample.Utility.SampleMethods;

class CustomTests {

	
	@Test
	public void testAdd()
	{
		SampleMethods obj = new SampleMethods();
		
		Assertions.assertEquals(8, obj.add(4,4),"Assert equal Test Case failed");
		//Assertions.assertEquals(8, obj.add(2,4),"Assert equals Test Case failed");
		
		Assertions.assertNotEquals(6, obj.add(4, 4), "Assert not equal test failed");
		//Assertions.assertNotEquals(6, obj.add(2, 4),"Assert not equal test failed");
	}
	
	@Test
	public void testObject()
	{
		SampleMethods obj = new SampleMethods();
		
		Assertions.assertNull(obj.testString(null), "Objecvt shoudl be null");
		//Assertions.assertNull(obj.testString("Satyaki Ghosh"), "Object should be null");
		
		Assertions.assertNotNull(obj.testString("Satyaki Ghosh"), "Object shoudl not be null");
		//Assertions.assertNotNull(obj.testString(null), "Object should not be null");
	}

}
