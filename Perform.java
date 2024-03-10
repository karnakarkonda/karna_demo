//**********************************************************************************************************************
//NAME:KARNAKAR KONDA
//DATE:01/05/2020
//DESCRIPTION: AUTOMATION OF REGISTRATION PAGE OPEN CART APPLICATION

package com.wipro.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wipro.testbase.Base;

public class Perform extends Base {
	WebDriver driver;
	@BeforeMethod
	public void Initialize() {
		driver = Lunch();
	}
	@Test
	public void perform() throws InterruptedException {
		driver.get("https://demo.opencart.com/index.php?route=common/home");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Canon");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@name='search']"))).perform();
		action.sendKeys(Keys.ENTER).perform();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Canon EOS 5D']")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Shopping Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		
	}

	@AfterMethod()
	public void m1() throws IOException {
		Screenshot("Perform");
	//	driver.close();

	}
}
