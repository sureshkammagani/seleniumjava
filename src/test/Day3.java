package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
@BeforeClass
public void befoclass()
{
System.out.println("I will execute before executing any method in the class Day3");	
}

@AfterClass
public void aftclass()
{
System.out.println("I will execute after executing all the methods in the class Day3");	
}

@Test
public void WebLoginCarLoan()
{
//selenium
	System.out.println("WebLoginCarLoan");
	System.out.println("urlname");
	System.out.println("key");

}
@BeforeMethod
public void beforeevery()
{
System.out.println("I will execute before every test method in Day3 class");	
}
@AfterMethod
public void afterevery()
{
System.out.println("I will execute after every test method in Day3 class");	
}

@Test(groups={"Smoke"})
public void MobileLoginCarLoan()
{
//appium
	System.out.println("MobileLoginCarLoan");
}
@BeforeSuite
public void Bfsuite()
{
System.out.println("I am no.1");	
}
@Test
public void MobileSigninCarLoan()
{
//appium
	System.out.println("MobileSigninCarLoan");
}
@Test(dataProvider="getData")
public void MobileSignoutCarLoan(String username,String password)
{
//appium
	System.out.println("MobileSignoutCarLoan");
	System.out.println(username);
	System.out.println(password);
}

@Test(dependsOnMethods= {"WebLoginCarLoan","MobileSignoutCarLoan"})
public void APILoginCarLoan()
{
//api
	System.out.println("APILoginCarLoan");
}
@DataProvider
public Object[][] getData()
{
//1st username password
//2nd username password
//3rd fraudlent cd
Object[][] data=new Object[3][2];
data[0][0]="firstusername";
data[0][1]="firstpassword";
data[1][0]="secondusername";
data[1][1]="secondpassword";
data[2][0]="thirdusername";
data[2][1]="thirdpassword";
return data;

}


}
