package tablelayer;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;



public class Facebook  {
	
  @Test(dataProvider = "facebooktest" ,dataProviderClass=Dataprovider.class)
  public void verifyfacebook(String un,String pass) {
	  
	  
	  
	  ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/login.php");
	  
	  driver.findElement(By.xpath("//input[@Type=\"text\"]")).sendKeys("un");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass");
	  
	  driver.close();
	  
	  
	  
  }

}

