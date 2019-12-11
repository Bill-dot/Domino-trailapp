package com.demo.my;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class First {
	
	public AndroidDriver<MobileElement> driver;
	
	public WebDriverWait wait;
	public DesiredCapabilities capabilities = new DesiredCapabilities();
	
	@BeforeSuite
	public void setUp() throws InterruptedException {
		capabilities.setCapability("deviceName", "Redimi Note 5 Pro");
		capabilities.setCapability("os_version", "9.0");
		capabilities.setCapability("device_id", "62a8f49a");
		capabilities.setCapability("newCommandTimeout", 12000);
		capabilities.setCapability("appPackage", "com.Dominos");
		capabilities.setCapability("appActivity","com.Dominos.activity.home.HomeActivity");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", false);
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 10);
//			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
//			Thread.sleep(10000); 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("ended First");
	}
	
	@Test(priority=1)
	public void signIn() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("searching for ALLOW button");
		driver.findElement(By.xpath("//android.widget.Button[@index='1'][@text='ALLOW']")).click();
		System.out.println("found Allow button and clicked");
		Thread.sleep(10000);
		System.out.println("serching for the NUMBER");
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
		System.out.println("found and tapped on NUMBER");
		System.out.println("searching for submit button");
		driver.findElement(By.xpath("//android.widget.TextView[@index='3'][@text='SUBMIT']")).click();
		System.out.println("found submit button");
	}
	
	@Test(priority=2)
	public void selectVegPizza() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("searching for Veg button");

		driver.findElement(By.xpath("//android.widget.TextView[@text='Veg Pizza'][@resource-id='com.Dominos:id/title_txt1']")).click();
		System.out.println("found Veg Pizza and tapped.");
		
	}
	
	
}
