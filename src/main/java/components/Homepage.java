package components;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import drivers.seleniumbase;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Random;
import java.util.UUID;

import io.github.bonigarcia.wdm.ChromeDriverManager;


public class Homepage extends seleniumbase {

	Random obj = new Random();
	int a = obj.nextInt(10000);
	String money = String.valueOf(a);
	String WebElement = null;

	static String uuid = UUID.randomUUID().toString();
	static String randomname = RandomStringUtils.randomAlphabetic(7);
	static String username = randomname +"@gmail.com";
	static String password =  RandomStringUtils.randomAlphabetic(8);
    
	public Homepage() {

	}
	
	
	public Homepage login() {
		driver.findElement(By.id("inputEmail")).sendKeys("jegadish@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("abcdefgh");
		click("xpath=//button[text()='Sign in']");
//		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		return this;
	}


	public Homepage addproduct() {
		click("xpath=//a[text()='Add']");
		type("xpath=//input[@id='name' and @name='name']","Adidas shoes");
		type("id=price","1500");
		type("id=description","branded shoes");
		driver.findElement(By.id("description")).sendKeys("branded shoes");
		click("xpath=//button[text()='Submit']");
		return this;
	}

	public Homepage verification() {
		WebElement = driver.findElement(By.xpath("//a[text()='Test Commerce']")).getText();
		System.out.println(WebElement);	
		click("xpath=//a[text()='Add']");
		type("//input[@id='name' and @name='name']","puma shoes");
		System.out.println(money);
		type("id=price",money);
		type("id=description","branded shoes");
		click("xpath=//button[text()='Submit']");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		click("xpath=//a[text()='Home ']");
		click("xpath=//*[text()='\"+money+\"']");
		return this;
	}
	
	public Homepage EditingProducts() {
		driver.findElement(By.xpath("//input[@id='name' and @name='name']")).clear();
		return this;
	}
	
	public Homepage downloadCSV() {
		driver.findElement(By.xpath("//*[text()='Download as CSV']")).click();
		return this;
	}
	
	public Homepage logout() {
		driver.findElement(By.xpath("//*[text()='LogOut']")).click();
		return this;
	}
	
	public Homepage signup() {
		driver.findElement(By.xpath("//*[text()='SignUp']")).click();
		
		driver.findElement(By.id("inputEmail")).sendKeys(username);
		String un = username;
		System.out.println(un);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='customCheck1']//following::button")).click();
		return this;
	}
	
	
	public Homepage randomproduct() {
		for (int i=0;i<23;i++) {
			click("xpath=//*[text()='Description']");
		}
		return this;
	}
	
	
	public Homepage Allelements() {
//		driver.findElements(by)
		return this;
	}
}
