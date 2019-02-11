package com.Info;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class FirstTest {

	public static RemoteWebDriver driver;

	@Test
	public void test() {

		AppiumDriverLocalService service;
		AppiumDriver<MobileElement> driver = null;
		String path;
		// service = AppiumDriverLocalService.buildDefaultService();
		// service.start();
		path = System.getProperty("user.dir");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "Android");
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "Andriod");
		capabilities.setCapability("deviceName", "MI");
		capabilities.setCapability(CapabilityType.VERSION, "4.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", path + "//DemoAPK.apk");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[2]").click();
		/*
		 * try { Thread.sleep(100); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		driver.findElementByXPath("//android.widget.TextView[2]").click();
		// Demos']").click();

		// driver.findElement(By.xpath("//*[contains(text(), 'API

	}

	/*
	 * @Test public void validate()
	 *
	 * driver.findElement(By.xpath(
	 * "//android.widget.TextView[contains(@text, 'API Demos')]")).click();
	 * driver.findElementByAccessibilityId("Accessibility").click(); }
	 */
}