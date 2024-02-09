package udemy_POM_Prac;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPage lp;
@BeforeClass
	void setup()
	{
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	  
	
@Test(priority=1)
void testLogo()
{
	lp=new LoginPage(driver);
	
	Assert.assertEquals(lp.checkLogoPresence(), true);
}
@Test(priority=2)
void testLogin()
{
	lp.setUserName("Admin");
	lp.setPassword("admin123");
	lp.clickSubmit();


}

@AfterClass
void tearDown() {
	driver.quit();
}
}