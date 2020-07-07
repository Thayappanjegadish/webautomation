package components;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import drivers.seleniumbase;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Amazon extends seleniumbase {

	List<WebElement> a = null;
	public Amazon() {
		
	}
	
	public Amazon search() {
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Adidas shoes");
		type("twotabsearchtextbox","Adidas shoes");
		click("xpath=//input[@value='Go']");
		return this;
	}
	
	public Amazon selectproduct() {
		a = driver.findElements(By.xpath("//span[contains(text(),'adidas')]"));
		System.out.println(a);
		for (int i = 0;i<a.size();i++ ) {
			String name = a.get(i).getText();
			if (name.contains("adidas")){
				driver.findElement(By.xpath("//span[contains(text(),'adidas')]")).click();
			}
		}
		return this;
	}
}
