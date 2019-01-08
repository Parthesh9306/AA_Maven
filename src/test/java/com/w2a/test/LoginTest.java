package com.w2a.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		String chromedriverpath = "D:\\Parthesh IMP\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() throws InterruptedException
	{
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Features']")).click();

	}
	
	@AfterSuite
	public void quit()
	{
		driver.quit();
	}
	
	
}
