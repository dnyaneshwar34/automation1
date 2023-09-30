package grouping;


import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Group {
	
  @Test(groups="facebook")
  public void verifyfacebook() {
	  
	  
 ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/login.php");
	  
	  
  }
  
  @Test(groups="ajio")
  public void verifyajio() {
 ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.ajio.com/");
  }
	  
  
  
  
  @Test(groups="facebook")
  public void f() {
	  
ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/login.php");
	  
	  
  }
  
  
  @Test (groups ="ajio")
  public void vrhi() {
 ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.ajio.com/");
  }
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  

