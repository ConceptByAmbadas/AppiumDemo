package com.Info;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {

	private WebDriver driver;

	@Test
	public void formTest() throws InterruptedException {
		List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.RelativeLayout"));
		textFieldsList.get(2).click();

		driver.findElement(By.className("android.widget.Spinner")).click();
		List<WebElement> listsDropDown = driver.findElements(By.className("android.widget.CheckedTextView"));
		for (WebElement listdropdown : listsDropDown) {
			String list = listdropdown.getText();
			if (list.equals("Oxygen")) {
				listdropdown.click();
			}
		}

		// click on check box
		WebElement checkBox = driver.findElement(By.className("android.widget.CheckBox"));
		if (checkBox.isSelected()) {
			checkBox.click();
		}

		// radio button click
		driver.findElements(By.className("android.widget.RadioButton")).get(1).click();

	}

	@Test
	public void loginTest() throws InterruptedException {
		List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
		int size = textFieldsList.size();

		textFieldsList.get(0).sendKeys("Admin");
		textFieldsList.get(1).sendKeys("Admin");
		driver.findElements(By.xpath("android.widget.Button")).get(1).click();
		WebElement logout = driver.findElement(By.name("LOGOUT"));
		String logOut = logout.getText();
		System.out.println(logOut);
		logout.click();
	}

	@BeforeMethod
	public void setUp() throws Exception {

		// set up appium
		File appDir = new File("E:/");
		File app = new File(appDir, "360Security_3.0_.0_.1051_105013_1mobile5__signed.apk"); // my
																								// case
																								// “demo1.apk”
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "Android");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Andriod");
		capabilities.setCapability("deviceName", "Micromax A106");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(CapabilityType.VERSION, "4.2");
		capabilities.setCapability(CapabilityType.PLATFORM, "WINDOW");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("app-package", "{app package name}"); // my
																			// case
																			// com.gorillalogic.monkeytalk.demo1
		capabilities.setCapability("app-activity", ".{main activity class}"); // my
																				// case
																				// RootActivity
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

}
