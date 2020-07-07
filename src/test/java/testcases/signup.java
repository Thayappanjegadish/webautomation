package testcases;
import java.util.Random;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;
import components.Homepage;
import drivers.seleniumbase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class signup extends seleniumbase {

//	Random random = new Random(); 
//	String uuid = UUID.randomUUID().toString();
    String randomname = RandomStringUtils.randomAlphabetic(7);
//    String password =  RandomStringUtils.randomAlphabetic(8);
    String username = randomname +"@gmail.com";
    
	
	@Test
    public void LaunchingURL() {
        open(baseurl);
        System.out.println(username);
	}
	
	@Test
	public void signup() {
		new Homepage()
		.signup();
  }}
