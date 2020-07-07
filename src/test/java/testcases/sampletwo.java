package testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class sampletwo {
	String name = "jegadish";
	String subject = "Data structures";
	
	@Test(groups= {"Smoke"})
	public void methodone() {
		System.out.println(name);
	}
	
	@Test(groups= {"Smoke"})
	public void methodtwo() {
		System.out.println(subject);
	}
	
	@AfterMethod
	public void samplemethod() {
		System.out.println("cache cleared");
	}
	@BeforeTest
	public void methodthree() {
		System.out.println("I will execute first");
	}

}
