package testingrar;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Overalltesting {
  @Test
  public void verifygoogle() throws InterruptedException {
	  
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  options.addArguments("disable-notifications");
	  
	  WebDriver driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.get("https://www.google.com/");
	  
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("iphone");
	
    List<WebElement> h       = driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]//ul[1]//li"));
	                int  count  = h.size();
                
                System.out.println(count);
                      
                        	for(int i=0;i<count-1;i++) {
                        		
                        	String text	= h.get(i).getText();
                        	 System.out.println(text);
                         }
                        	Thread.sleep(5000);
                        	WebElement o =  driver.findElement(By.xpath("//div[@class=\"OBMEnb\"]//ul[1]//li[4]"));
                        	 o.click();
                        	 
                        	 
  }
                        @Test
                     public void verifyajio() throws InterruptedException, IOException {
                        	
                        	ChromeOptions options = new ChromeOptions();
                      	  options.addArguments("--remote-allow-origins=*");
                      	  options.addArguments("disable-notifications");
                      	  
                      	  WebDriver driver = new ChromeDriver(options);
                      	  driver.manage().window().maximize();
                      	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                        	driver.navigate().to("https://www.ajio.com/shop/women");
                        	
                        	
                        	TakesScreenshot e = ((TakesScreenshot)driver);
                        	
                        WebElement s =	driver.findElement(By.xpath("//header/div[2]/a[1]/img[1]"));
                        	
                    File source    =	s.getScreenshotAs(OutputType.FILE);
                        	
                    String path = "D:\\New folder (9)\\screenshotwebelement\\logo.png";
                    
                    File destination = new File(path);
                    
                    FileHandler.copy(source, destination);
                        	Actions u = new Actions(driver);
                        	
                             WebElement t  =	driver.findElement(By.xpath("//div[@class=\"menu-newlist\"]//ul[1]//li"));
                        	u.moveToElement(t).click().build().perform();
                        	
                        	driver.navigate().back();
                       
               
        
                   
                        	Dimension l = new Dimension(1300,700);
                        	
                       
                        	
                        	System.out.println(driver.manage().window().getSize());
                     
                        	driver.manage().window().setSize(l);
                       
                        	
                        	
                        	Point r = new Point(7,7);
                       
                        	System.out.println(driver.manage().window().getPosition());
                        
                        	driver.manage().window().setPosition(r);
                        	
                        	
           WebElement n = driver.findElement(By.xpath("(//a[@rel=\"noreferrer\"])[147]"));
                        	
           Thread.sleep(5000);
                        JavascriptExecutor k = ((JavascriptExecutor)driver);	
                        	
                        	k.executeScript("arguments[0].scrollIntoView(true);",n);
                        	n.click();
                        	
                        	
                        	driver.navigate().to("https://www.policybazaar.com/");
               
                        
                       driver.findElement(By.xpath("//span[contains(text(),'My profile')]")).click();
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
                        	
  }
}
