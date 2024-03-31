package com.practice.JUnit.Junit_Development_Sample.TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.practice.JUnit.Junit_Development_Sample.Utility.SampleMethods;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
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
	//@DisplayName("Test Equal or Not Equals")
	public void testEqualsOrNotEquals()
	{
		
		System.out.println("In the assert equals/notequals method");
		Assertions.assertEquals(8, obj.add(4,4),"Assert equal Test Case failed");
		//Assertions.assertEquals(8, obj.add(2,4),"Assert equals Test Case failed");
		
		Assertions.assertNotEquals(6, obj.add(4, 4), "Assert not equal test failed");
		//Assertions.assertNotEquals(6, obj.add(2, 4),"Assert not equal test failed");
	}
	
	@Test
	//@DisplayName("Test Null or Not Null")
	public void testNullOrNotNull()
	{
		System.out.println("In the assert null/not null method");
		Assertions.assertNull(obj.testString(null), "Objecvt shoudl be null");
		//Assertions.assertNull(obj.testString("Satyaki Ghosh"), "Object should be null");
		
		Assertions.assertNotNull(obj.testString("Satyaki Ghosh"), "Object shoudl not be null");
		//Assertions.assertNotNull(obj.testString(null), "Object should not be null");
	}
	
	@Test
	public void testSameOrNotSame()
	{
		System.out.println("In the Same and Not Same test method");
		String s = "World";
		Assertions.assertSame(obj.getStringValue(), obj.getDuplicateStringValue(),"The objects should be same");
		Assertions.assertNotSame(s, obj.getStringValue(), "The object reference should be different");
	}
	
	@Test
	public void testTrueOrFalse()
	{
		System.out.println("In the true or false method");
		Assertions.assertTrue(obj.isGreater(20, 18),"The First parameter shoudl be greater than second");
		Assertions.assertFalse(obj.isGreater(15, 30), "The second parameter should be greater than the first");
		
	}
	
	@Test
	public void testArraysEqual()
	{
		System.out.println("In the asssert arrays test");
		int arr[] = {1,2,3,4};
		Assertions.assertArrayEquals(arr, obj.getArray(),"The arrays should be equal");
	}
	
	@Test
	public void testIterables()
	{
		System.out.println("In the assert iterables");
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Assertions.assertIterableEquals(list, obj.getListOfInteger(),"The Iterables shoudl be equal");
	}
	
	@Test
	public void testLines()
	{
		List<String> list = Arrays.asList("Hello","World","JUnit");
		System.out.println("In the assert lines equal");
		Assertions.assertLinesMatch(list, obj.getListOfString(),"The Lines should be equal");
	}

}
