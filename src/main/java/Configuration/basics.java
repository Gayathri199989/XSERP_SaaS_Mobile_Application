package Configuration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//AndroidDriver driver = capabilities(String appName);
		AndroidDriver<AndroidElement> driver = capabilities("XserpQa");
		driver.findElement(By.id("com.schnell.xserp:id/userEmail")).sendKeys("qa.schnell@gmail.com");
		driver.findElement(By.id("com.schnell.xserp:id/password")).sendKeys("qaadmin");
		driver.findElement(By.id("com.schnell.xserp:id/signin")).click();
		driver.findElement(By.id("com.schnell.xserp:id/salesIcon")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "com.schnell.xserp:id/salesIcon")));
		 */
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='INV/OA LOOKUP']")).click();
		driver.findElement(By.id("com.schnell.xserp:id/fromDate")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.xpath("//android.view.View[@text='1']")).click();
		driver.findElement(By.id("com.schnell.xserp:id/searchButton")).click();
		


	}

}
