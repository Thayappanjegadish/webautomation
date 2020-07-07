package testcases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampleone {
	
	
	int a = 8;
	int b = 7; 
	
	
	@BeforeClass
	public void globalmethod() {
		System.out.println("Executes before starting execution");
	}

	@Test(dataProvider="getdata")
	public void name(String username ,String password) {
		System.out.println("Test case passed");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test
	public void sum() {
		System.out.println("url");		
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		
		Object[][] data = new Object[3][2];
		
		//first combination
		data[0][0] = "firstsetusername";
		data[0][1] = "firstsetpassword";
		
		//second combination
		data[1][0] = "secondsetusername";
		data[1][1] = "secondsetpassword";
		
		
		//third combination
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetpassword";
		
		return data;
	}
}
