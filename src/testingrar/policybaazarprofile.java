package testingrar;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class policybaazarprofile {
  @Test
  public void profile() {
	  
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  options.addArguments("disable-notifications");
	  WebDriver driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.get("https://www.policybazaar.com/");
	  
            String ExpectedTitle ="Insurance - Compare&Buy Insurance Plans - Health,Term,Life...";
            String ActualTitle = driver.getTitle();
         
            if(ExpectedTitle.equals(ActualTitle)) {
           
            	System.out.println("pass");
           
            }
            else {
            	
            	System.out.println("fail");
           
            }
            
            
            
            String Actualurl = driver.getCurrentUrl();
            String  Expectedurl   = "https://www.policybazaar.com/";
           
            if(Actualurl.equals(Expectedurl)) {
            
            	System.out.println("pass");
        
            }
            
            else {
            	System.out.println("fail");

            	
            }
                      
            
            WebElement logo =         driver.findElement(By.xpath("//a[@class=\"logo\"]"));
                    if(logo.isDisplayed()) {
                    	
                    	System.out.println("logo is visible.return"+logo.isDisplayed());
                    }
                    else {
                    	
                    	System.out.println("logo is not visible.return"+logo.isDisplayed());
                    }
            
                  WebElement signin =  driver.findElement(By.xpath("//a[@class=\"sign-in\"]"));
                  if(signin.isSelected()) {
                  	
                  	System.out.println("sign in is visible.return"+signin.isSelected());
                  }
                  else {
                  	
                  	System.out.println("sign in is not visible.return"+signin.isSelected());
                  }
	  
                  
                  WebElement logoo = driver.findElement(By.xpath("//a[@class=\"sign-in\"]"));
                  if(logoo.isEnabled()) {
                  	
                  	System.out.println("logoo is visible.return"+logoo.isEnabled());
                  }
                  else {
                  	
                  	System.out.println("logoo is not visible.return"+logoo.isEnabled());
                  }
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
  }
}
