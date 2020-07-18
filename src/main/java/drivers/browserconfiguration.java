package drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class browserconfiguration {

	public static WebDriver driver = null;
	
	
	public void open(String url) {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("The browser has been launched successfully");
//			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		}catch(WebDriverException we) {
			System.out.println("[FAILED] unable to launch the browser");
		}
	}
	
	public void openinFirefox(String url) {
		try {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("The browser has been launched successfully");
		}catch(WebDriverException we) {
			System.out.println("[FAILED] unable to launch the browser");
		}
	}
	
}
