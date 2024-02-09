package udemy_POM_Prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	//Constructor
	LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
    //Locators
	/*By txt_username_location=By.xpath("//input[@placeholder='Username']");
	By txt_password_location=By.cssSelector("input[placeholder='Password']");
	By txt_submit_location=By.xpath("//button[normalize-space()='Login']");
	By txt_img_logo_location=By.xpath("//div[@class='orangehrm-login-logo-mobile']//img[@alt='orangehrm-logo']");*/
    
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(css="input[placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement txt_submit;
	
	@FindBy(xpath="//div[@class='orangehrm-login-logo-mobile']//img[@alt='orangehrm-logo']")
	WebElement txt_imgLogo;
	
    //Action methods
	public void setUserName(String username) {
		//driver.findElement(txt_username_location).sendKeys(username);
		txt_username.sendKeys(username);
	}

    public void setPassword(String password) {
    	//driver.findElement(txt_password_location).sendKeys(password);
        txt_password.sendKeys(password);
    }
    public void clickSubmit() {
    	//driver.findElement(txt_submit_location).click();
        txt_submit.click(); 
    }
    public boolean checkLogoPresence() {
    	//Boolean status=driver.findElement(txt_img_logo_location).isDisplayed();
    	//return status;
    	boolean status = txt_imgLogo.isDisplayed();
    	return status;
    }
}
