package AutoProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingPhones extends Base {
	WebDriver driver;

	@BeforeMethod
	public void Initialize() {
		driver = Lunch();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void addingPhones() throws InterruptedException, IOException {
		BufferedWriter bf2 = new BufferedWriter(new FileWriter("C:\\Users\\karnakar\\Desktop\\k3.text"));

		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("karnamudiraj141@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("karna1234562");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//body//div[2]//ul//li[1]//a//i[@class='fa fa-home']")).click();
		driver.findElement(By.xpath("//img[@alt='iPhone 6']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/ul[1]/li[1]/a/img")).click();
		int i = 0;
		while (i < 7) {
			driver.findElement(By.xpath("//button[@type='button'][2]")).click();
			// Thread.sleep(2000);
			i = i + 1;
		}
		driver.findElement(By.xpath("//button[@class='mfp-close']")).click();
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//*[text()='Shopping Cart']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[1]/h4/a")).click();
		Select s1 = new Select(driver.findElement(By.id("input-country")));
		s1.selectByVisibleText("India");
		Select s2 = new Select(driver.findElement(By.id("input-zone")));
		s2.selectByVisibleText("Telangana");
		driver.findElement(By.id("input-postcode")).sendKeys("502301");
		driver.findElement(By.id("button-quote")).click();
		driver.findElement(By.name("shipping_method")).click();
		driver.findElement(By.id("button-shipping")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[1]/div[1]/h4/a")).click();
		driver.findElement(By.id("input-coupon")).sendKeys("5000");
		driver.findElement(By.id("button-coupon")).click();
		String alert = driver.findElement(By.xpath("/html/body/div[2]/div[1]")).getText();
		bf2.write(alert);
		bf2.close();
		
	}

	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		// driver.close();
	}
}
