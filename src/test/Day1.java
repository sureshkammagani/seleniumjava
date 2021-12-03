package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void lastexecution()
	{
	System.out.println("I will execute last");	
	}
	@Test	
	public void demo()
	{
	System.out.println("Hello");	
	}
	@AfterSuite
	public void afsuite()
	{
	System.out.println("I am no.1 from the last");	
	}
	
@Test
public void secondTest()
{
System.out.println("rama");
}



}