package grouping;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(grouping.Listeners.class)
public class Test2 {
 
	
	@Test
  public void verifyajio() {
	  
	  
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("--disable-dev-shm-usage");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  options.addArguments("disable-notifications");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://www.ajio.com/");
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
