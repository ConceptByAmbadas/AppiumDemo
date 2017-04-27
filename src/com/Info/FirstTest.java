package com.Info;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class FirstTest {

	private static RemoteWebDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		try
		{


			//File appDir = new File("{pathApk file}");
			//File classpathRoot = new File(System.getProperty("user.dir"));
			///File appDir = new File(classpathRoot, "/Seleium_data/Appium_Data/");
			//File app = new File(appDir, "360Security_3.0_.0_.1051_105013_1mobile5__signed.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("device","Android");
			capabilities.setCapability(CapabilityType.BROWSER_NAME,  "Andriod");
			capabilities.setCapability("deviceName", "0123456789ABCDEF");
			capabilities.setCapability(CapabilityType.VERSION, "4.2");
			capabilities.setCapability("platformName", "Android");
			// capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "360Security_3.0_.0_.1051_105013_1mobile5__signed");
			capabilities.setCapability("appActivity", "360Security_3.0_.0_.1051_105013_1mobile5__signed");
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

			http://127.0.0.1:4723/wd/hub


				//File classpathRoot = new File(System.getProperty("user.dir"));
				//File appDir = new File(classpathRoot, "E:/Seleium_data/Appium_Data/");
				//File app = new File(appDir, "360Security_3.0_.0_.1051_105013_1mobile5__signed.apk");

				//	DesiredCapabilities capabilities = new DesiredCapabilities();
				//capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
				//capabilities.setCapability("deviceName", "Micromax A106");
				//capabilities.setCapability("platformVersion", "4.4.2");
				//capabilities.setCapability("platformName", "Android");
				//capabilities.setCapability("app", app.getAbsolutePath());
				//capabilities.setCapability("appPackage", "360Security_3.0_.0_.1051_105013_1mobile5__signed");
				//capabilities.setCapability("appActivity", "360Security_3.0_.0_.1051_105013_1mobile5__signed");

				//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				Thread.sleep(10000);
			//driver.quit();
		}
		catch(Exception ex)
		{
			System.out.println("error is"+ex.getMessage());
		}
	}
}