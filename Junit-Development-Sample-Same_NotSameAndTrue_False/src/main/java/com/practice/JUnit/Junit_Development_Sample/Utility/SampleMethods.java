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
	
	public boolean isGreater(int x,int y)
	{
		if(x > y)
			return true;
		else
			return false;
	}
	
	public String getStringValue()
	{
		String s1 = "Hello";
		return s1;
	}
	
	public String getDuplicateStringValue()
	{
		String s2 = "Hello";
		return s2;
	}
}
