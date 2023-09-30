package tablelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PolicyBazarrun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		PolicyBaazar y = new PolicyBaazar(driver);
		y.clickonsignin();
		Thread.sleep(5000);
	//	y.clickcountrycode();
	//	Thread.sleep(3000);
		y.mobilehome();
		Thread.sleep(5000);
		y.clicksigninwithpassword();
		Thread.sleep(4000);
		y.sendkeyspassword();
		Thread.sleep(4000);
		y.clicksigninbut();
		Thread.sleep(3000);
		y.clickMyAccount();
		Thread.sleep(4000);
		y.clickMyProfile();
		
	}

}
