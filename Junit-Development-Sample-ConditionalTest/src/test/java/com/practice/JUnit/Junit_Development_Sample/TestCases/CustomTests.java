package com.practice.JUnit.Junit_Development_Sample.TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

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
	@Disabled
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
	//@EnabledOnOs({OS.WINDOWS,OS.MAC})
	@EnabledOnOs(OS.MAC)
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
	@EnabledOnJre(JRE.JAVA_11)
	public void testThrows()
	{
		System.out.println("In the test throws method");
		Assertions.assertThrows(Exception.class, ()->{obj.testException(-1);}, "Throws Exception");
		Assertions.assertDoesNotThrow(()->{obj.testException(10);});
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_10,max = JRE.JAVA_20)
	public void testTimeouts()
	{
		System.out.println("Testing the assert time out method");
		Assertions.assertTimeoutPreemptively(Duration.ofMillis(4000), ()->{obj.testTimeouts();});
	}

}
