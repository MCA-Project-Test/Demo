package com.sameer.jUnit;


public class App 
{
	public int countVowels(String string)
	{
		String lower = string.toLowerCase();
		int count = 0;
		
		for(int i = 0; i < string.length(); i++)
		{
			if(lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || lower.charAt(i) == 'i' || lower.charAt(i) == 'o' || lower.charAt(i) == 'u')
				count++;
		}
		
		return count;
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
}
