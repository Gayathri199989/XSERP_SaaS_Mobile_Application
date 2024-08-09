package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppConfiguration {
	//@BeforeTest
	public static AndroidDriver capabilities(String appName) throws IOException
	{
	// TODO Auto-generated method stub
		//System.getProperty("User.dir");
		FileInputStream f = new FileInputStream("C:\\ERP\\TestAutomationScripts\\XSERPMobileTest\\Xserp.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		AndroidDriver driver;
		
		File appDir = new File("src");
		File app = new File(appDir, (String) prop.get(appName));
		DesiredCapabilities cap = new DesiredCapabilities();
		String device=(String) prop.get("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		driver = new AndroidDriver(new URL("http://192.168.21.211:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		return driver;
		

	}


}
