//**********************************************************************************************************************
//NAME:KARNAKAR KONDA
//DATE:01/05/2020
//DESCRIPTION: AUTOMATION OF REGISTRATION PAGE OPEN CART APPLICATION

package com.wipro.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wipro.testbase.Base;

public class AddingProducts extends Base{
	WebDriver driver;
	@BeforeMethod
	public void Initialize() {
		driver = Lunch();
	}
	@Test
	public void addingProducts() {
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("karnamudiraj141@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("karna1234562");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Phones & PDAs")).click();
		driver.findElement(By.xpath("//button[@data-original-title='Compare this Product'][1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/button[3]/i"))
				.click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/button[3]")).click();
		driver.findElement(By.xpath("//*[text()='Shopping Cart']")).click();	
	}

	@AfterMethod()
	public void m1() throws IOException {
		Screenshot("AddingProducts");
	//	driver.close();
	}
}
