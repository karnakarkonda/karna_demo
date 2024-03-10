//**********************************************************************************************************************
//NAME:KARNAKAR KONDA
//DATE:01/05/2020
//DESCRIPTION: AUTOMATION OF REGISTRATION PAGE OPEN CART APPLICATION

package com.wipro.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wipro.testbase.Base;

public class GiftVocher extends Base {
	WebDriver driver;

	@BeforeMethod
	public void Initialize() {
		driver = Lunch();
	}

	@Test
	public void giftVocher() throws IOException, InterruptedException {
		driver.get("https://demo.opencart.com/");
		File file = new File("C:\\Users\\karnakar\\Desktop\\Gift.xlsx");
		FileInputStream f3 = new FileInputStream(file);
		XSSFWorkbook wb3 = new XSSFWorkbook(f3);
		XSSFSheet sheet = wb3.getSheetAt(0);
		String s1 = sheet.getRow(0).getCell(0).getStringCellValue();
		String s2 = sheet.getRow(0).getCell(1).getStringCellValue();
		String s3 = sheet.getRow(0).getCell(2).getStringCellValue();
		String s4 = sheet.getRow(0).getCell(3).getStringCellValue();
		String s5 = sheet.getRow(0).getCell(4).getStringCellValue();
		String s6 = sheet.getRow(0).getCell(5).getStringCellValue();
		String s7 = sheet.getRow(0).getCell(6).getStringCellValue();
		String s8 = sheet.getRow(0).getCell(7).getStringCellValue();
		String s9 = sheet.getRow(0).getCell(8).getStringCellValue();
		String s10 = sheet.getRow(0).getCell(9).getStringCellValue();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("karnamudiraj141@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("karna1234562");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Gift Certificates")).click();
		driver.findElement(By.id("input-to-name")).sendKeys(s1);
		driver.findElement(By.id("input-to-email")).sendKeys(s2);
		driver.findElement(By.xpath("//input[@value='7']")).click();
		driver.findElement(By.id("input-message")).sendKeys(s3);
		driver.findElement(By.cssSelector(
				"html body div#account-voucher.container div.row div#content.col-sm-9 form.form-horizontal div.buttons.clearfix div.pull-right input"))
				.click();
		driver.findElement(By.cssSelector("input.btn")).click();
		driver.findElement(By.linkText("Continue")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div/table/tbody/tr[2]/td[4]/div/span/button[2]/i")).click();
		driver.findElement(By.linkText("Continue Shopping")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.id("input-enquiry")).sendKeys(
				"An inspiring combination of growth prospects, continuous innovation, fair play, and a great work culture makes Wipro an exhilarating workplace. All Wiproites can expect a bouquet of benefits as they walk in to discover a career for life.\r\n"
						+ "\r\n" + "");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Wish List")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Edit your account information")).click();
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(s4);
		driver.findElement(By.cssSelector("input.btn")).click();
		driver.findElement(By.linkText("View your return requests")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Modify your address book entries")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(s5);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(s6);
		driver.findElement(By.id("input-company")).clear();
		driver.findElement(By.id("input-company")).sendKeys(s7);
		driver.findElement(By.id("input-address-1")).clear();
		driver.findElement(By.id("input-address-1")).sendKeys(s8);
		driver.findElement(By.id("input-address-2")).clear();
		driver.findElement(By.id("input-address-2")).sendKeys(s9);

		driver.findElement(By.id("input-city")).sendKeys(s10);
		Select select = new Select(driver.findElement(By.id("input-country")));
		select.selectByVisibleText("India");
		Select select1 = new Select(driver.findElement(By.id("input-zone")));
		select1.selectByVisibleText("Telangana");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String str1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/table/tbody/tr/td[1]"))
				.getText();
		// System.out.println(str1);
		driver.findElement(By.linkText("Logout")).click();

	}

	@AfterMethod()
	public void m1() throws IOException {
		Screenshot("GiftVocher");
		// driver.close();
	}
}