//**********************************************************************************************************************
//NAME:KARNAKAR KONDA
//DATE:01/05/2020
//DESCRIPTION: AUTOMATION OF REGISTRATION PAGE OPEN CART APPLICATION

package com.wipro.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wipro.testbase.Base;

//import AutoProject.Base;

public class PNLinks extends Base {
	WebDriver driver;

	@BeforeMethod
	public void Initialize() {
		driver = Lunch();

	}

	@Test
	public void orderHistory() {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("karnamudiraj141@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("karna1234562");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		List<WebElement> w = driver.findElements(By.tagName("a"));
		int count = 0;
		for (WebElement i : w) {
			count++;
		}
		System.out.println(count);
	}

	@AfterMethod()
	public void m1() throws IOException {
		Screenshot("PNLinks");
		//driver.close();

	}

}