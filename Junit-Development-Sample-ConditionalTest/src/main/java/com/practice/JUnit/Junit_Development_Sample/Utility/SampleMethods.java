package com.practice.JUnit.Junit_Development_Sample.Utility;

public class SampleMethods 
{
	public int add(int x,int y)
	{
		return x+y;
	}
	
	public String testString(String str)
	{
		if(str == null)
			return null;
		
		else
			return str;
					
	}
	
	public void testException(int x) throws Exception
	{
		if(x < 0)
		{
			throw new Exception("Input cannot be less than zero");
		}
		else
			System.out.println("Input : "+x);
	}
	
	public void testTimeouts() throws InterruptedException
	{
		Thread.sleep(3000);
	}
}
