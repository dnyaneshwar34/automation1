package tablelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBaazar {

	    
	
	    @FindBy(xpath = "//a[@class=\"sign-in\"]")
		private WebElement signin;
	    
	    @FindBy(xpath="//div[@class=\"dropdown-list\"]//ul//li[1]")
	    private WebElement countrycode;
	   
	    @FindBy(xpath ="(//input[@type=\"number\"])[2]")
	    private WebElement MobileNo;
	    
		@FindBy(xpath ="//div[@style=\"display: block !important; height: 0px;\"]")
		private WebElement MyAccount;
		
		
		@FindBy(xpath="//a[@onclick=\"topNavLoginGa('Your Profile');redirectToMyAcc('/profile');\"]")
		private WebElement MyProfile;
		
		@FindBy(xpath="(//a[@id=\"central-loggin-with-pwd\"])[2]")
		private WebElement signinwithpassword;
		
		
		@FindBy(xpath ="//input[@name=\"password\"]")
		private WebElement password;
		
		@FindBy(xpath="//a[@id=\"login-in-with-password\"]")
		private WebElement signinbt;
		
		public  PolicyBaazar (WebDriver driver) {
			
			PageFactory.initElements(driver,this);
			
		}
		
		public void clickonsignin() {
			signin.click();
			
		}
		
		public void clickcountrycode() {
			
			 countrycode.click();
		}
		
		public void mobilehome() {
			
			MobileNo.sendKeys("8788172074");
			
		}
		
		public void clicksigninwithpassword() {
			signinwithpassword.click();
			
		}
		
		public void clickMyAccount() {
			
			MyAccount.click();
			
		}
		
       public void clickMyProfile() {
			
    	   MyProfile.click();
			
		}
		
       public void sendkeyspassword() {
    	   password.sendKeys("Hanumanji@1");
       }
	
       public void clicksigninbut() {
    	   
    	   signinbt.click();
    	   
       }

	}


