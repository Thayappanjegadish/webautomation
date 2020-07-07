package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import components.Homepage;
import drivers.seleniumbase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sample extends seleniumbase {
	
	@Test
	public void search() {
		open("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys(Keys.ENTER);
		}

}
