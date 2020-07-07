package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import components.Amazon;
import components.Homepage;
import drivers.seleniumbase;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Amazontc001 extends seleniumbase {

	String url = "https://www.amazon.com/";

	@Test
	public void LaunchingURL() {
		open(url);
	}

	@Test
	public void selectteam() {
		new Amazon()
		.search()
		.selectproduct();

	}
}
