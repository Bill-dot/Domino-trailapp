package com.demo.my;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class VegPizza {
	public AndroidDriver<MobileElement> driver;
	public WebDriverWait wait;
	
	@Test(priority=2)
	public void selectVegPizza() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("searching for Veg button");
		System.out.println("found Veg Pizza and tapped.");

		driver.findElement(By.xpath("//android.widget.TextView[@text='Veg Pizza'][@resource-id='com.Dominos:id/title_txt1']")).click();
		
	}

}
