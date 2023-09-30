package tablelayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Serialtesting {
  @Test
  public void f() {
	  
 ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/login.php");
  }
  @Test
public void y() {
	  
 ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.ajio.com/");
  }
  @Test
public void i() {
	  
 ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.youtube.com/");
}
  
  @Test
public void k() {
	  
 ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--remote-allow-origins");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/login.php");
}
  
  
  
  
  
  
  
  
  
  
  
}
