package com.wipro.testbase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	WebDriver driver;

	public WebDriver Lunch() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\karnakar\\eclipse-workspace\\OpenCart_Selenium_1275065_karnakar\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void Screenshot(String scr) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshots\\"+scr+".png"));
	}
}
