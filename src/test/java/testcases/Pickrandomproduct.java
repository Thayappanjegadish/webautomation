package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import components.Homepage;
import drivers.seleniumbase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pickrandomproduct extends seleniumbase {
	
	@BeforeTest
	public void Handlingtimeout() {
		new seleniumbase()
		.timeoutalert();
	}
	
	
	@Test
    public void LaunchingURL() {
		baseurl = "http://localhost:3000/";
        open(baseurl);
        new Homepage()
        .login();
	}
	
	@Test
	public void addingaProduct() {
		new Homepage()
		.addproduct();
	}
	
	@Test
	public void PickaProduct() {
		new Homepage()
		.randomproduct();
	}

}
