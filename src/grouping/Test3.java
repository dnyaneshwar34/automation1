package grouping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Test3 {
	
	@Test
	public void verifypolicybaazar() {
	
	ChromeOptions options = new ChromeOptions(); 
	options.addArguments("--remote-allow-origins=*"); 
	options.addArguments("--no-sandbox"); 
	options.addArguments("--disable-dev-shm-usage");
	
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	
	
	
	
	
	
	
	
	
	

}
}