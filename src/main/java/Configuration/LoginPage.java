package Configuration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends AppConfiguration {

	@AndroidFindBy(id = "com.schnell.xserp:id/next")
	public WebElement SalesPromo;

	@AndroidFindBy(id = "com.schnell.xserp:id/next")
	public WebElement POPromo;

	@AndroidFindBy(id = "com.schnell.xserp:id/next")
	public WebElement AccountsPromo;

	@AndroidFindBy(id = "com.schnell.xserp:id/next")
	public WebElement StoresPromo;

	@AndroidFindBy(id = "com.schnell.xserp:id/next")
	public WebElement POPromo1;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	public WebElement AllowPer;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	public WebElement Username;

	@AndroidFindBy(id = "com.schnell.xserp:id/password")
	public WebElement Password;

	@AndroidFindBy(id = "com.schnell.xserp:id/signin")
	public WebElement SignIn;

	private AndroidDriver driver;

	
	  //AndroidDriver driver;
	  
	  
	  
	  
		/*
		 * @Test public void allow() throws MalformedURLException { AndroidDriver driver
		 * = capabilities(); Promo1.click(); Promo2.click(); Promo3.click();
		 * Promo4.click(); Promo5.click(); Promo6.click();
		 * 
		 * }
		 */
	  
	  
	  
	  
	  
	  @BeforeTest public void LoginPage (AndroidDriver driver) { this.driver =
	  driver; PageFactory.initElements(new AppiumFieldDecorator (driver), this);
	  
	  }
	 

	// @Test
	public void login() throws IOException {

		AndroidDriver driver = capabilities("XserpQa");
		SalesPromo.click();
		POPromo.click();
		AccountsPromo.click();
		StoresPromo.click();
		POPromo1.click();
		AllowPer.click();
		Username.click();
		Password.click();
		SignIn.click();
	}

}
