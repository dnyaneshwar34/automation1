package grouping;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Suitlevel {
  @Test
  public void verifyfacebook() {
	  
	  ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("--disable-dev-shm-usage");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.facebook.com/login.php");
	  
	  driver.close();
	  
	  
	  
	  
	  
	  
	  
  }
}
