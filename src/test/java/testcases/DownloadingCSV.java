package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import components.Homepage;
import drivers.seleniumbase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadingCSV extends seleniumbase {

	@Test
    public void LaunchingURL() {
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
	public void csvdownload() {
		new Homepage()
		.downloadCSV();
	}
	
	@Test
	public void logout() {
		new Homepage()
		.logout();
	}
}
