package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException  {
		// TODO Auto-generated method stub
		
		FileInputStream f = new FileInputStream("C:\\ERP\\TestAutomationScripts\\XSERPMobileTest\\src\\main\\java\\Configuration\\xserp-qa-release (7).apk");
		Properties prop = new Properties();
		prop.load(f);
		
		AndroidDriver<AndroidElement> driver;
		File appDir = new File("src");
		
		File app = new File(appDir, (String) prop.get(appName));
		DesiredCapabilities cap = new DesiredCapabilities();
		String XserpQa=(String) prop.get("XserpQa");
		cap.setCapability(MobileCapabilityType.APP, XserpQa);
		String device=(String) prop.get("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		driver = new AndroidDriver(new URL("http://192.168.21.211:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		
		return driver;
		

	}

}
