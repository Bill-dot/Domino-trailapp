package com.demo.my;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SetUp  {
	public AndroidDriver<MobileElement> driver;
	public WebDriverWait wait;

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
}
