package com.practice.JUnit.Junit_Development_Sample.TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.practice.JUnit.Junit_Development_Sample.Utility.SampleMethods;

class CustomTests 
{
	SampleMethods obj = null;
	
	@BeforeAll
	public static void setUpBeforeAll()
	{
		System.out.println("In the Before All method");
	}
	
	@AfterAll
	public static void setUpAfterAll()
	{
		System.out.println("In the After all method");
	}
	
	@BeforeEach
	public void setUpBeforeEach()
	{
		System.out.println("In the Before Each method");
		obj = new SampleMethods();
	}
	
	@AfterEach
	public void setUpAfterEach()
	{
		System.out.println("In the After each method");
	}
	
	@Test
	public void testAdd()
	{
		
		System.out.println("In the assert equals/notequals method");
		Assertions.assertEquals(8, obj.add(4,4),"Assert equal Test Case failed");
		//Assertions.assertEquals(8, obj.add(2,4),"Assert equals Test Case failed");
		
		Assertions.assertNotEquals(6, obj.add(4, 4), "Assert not equal test failed");
		//Assertions.assertNotEquals(6, obj.add(2, 4),"Assert not equal test failed");
	}
	
	@Test
	public void testObject()
	{
		System.out.println("In the assert null/not null method");
		Assertions.assertNull(obj.testString(null), "Objecvt shoudl be null");
		//Assertions.assertNull(obj.testString("Satyaki Ghosh"), "Object should be null");
		
		Assertions.assertNotNull(obj.testString("Satyaki Ghosh"), "Object shoudl not be null");
		//Assertions.assertNotNull(obj.testString(null), "Object should not be null");
	}

}
