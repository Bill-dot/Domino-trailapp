package com.demo.my;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Login {

	static AndroidDriver<MobileElement> driver;


	WebDriverWait wait;
	DesiredCapabilities capabilities = new DesiredCapabilities();


	/**
	 * This method is used to do set up before launching 
	 */
	@BeforeTest()
	public void setUp() {

		capabilities.setCapability("deviceName", "Galaxy J3 pro");
		capabilities.setCapability("os_version", "7.0");
		capabilities.setCapability("device_id", "42008f8fe4e69457");
		capabilities.setCapability("newCommandTimeout", 12000);
		capabilities.setCapability("appPackage", "com.celcom.pulse");
		capabilities.setCapability("appActivity","com.celcom.pulse.MainActivity");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", false);
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 10);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void checkLogin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(1000);
		//With BC Login
				driver.findElement(By.xpath("//*[@resource-id='userId']/android.widget.EditText[@index='0']")).sendKeys("S525103764");
				driver.findElement(By.xpath("//*[@resource-id='password']/android.widget.EditText[@index='0']")).sendKeys("Celcom@2019");
				driver.findElement(By.xpath("//*[@resource-id=\"loginButton\"]")).click();
				Thread.sleep(10000);
				
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//android.widget.ToggleButton[@resource-id='scanIdSegment']")).click();// tap on existing tab
				WebElement element= (MobileElement)driver.findElement(By.xpath("//android.view.View[@index='0']/android.widget.Image[@index='0']"));  // scroll
				Thread.sleep(2000);
				TouchAction action = new TouchAction(driver);
				action.press(element).moveTo(100,100).release().perform();
				driver.findElement(By.xpath("//android.view.View[@index='5']/android.widget.Image[@index='0']")).click(); // click on customer service
				
				driver.findElement(By.xpath("//android.widget.Button[contains(@text, 'Temporary Disconnect')]")).click(); // tapping on terminate device
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.widget.ToggleButton[@index='3']")).click(); // tapping on manual.
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Spinner[@resource-id='undefined']")).click();// 
				driver.findElement(By.xpath("//android.view.View[contains(@resource-id, 'lbl')][@text='Mobile Number']")).click(); // drop down and selection of manual number
				driver.findElement(By.xpath("//android.widget.EditText[@index='3' and @resource-id='ManualCustomInput']")).sendKeys("0133701758");
				driver.findElement(By.xpath("//android.widget.Button[@resource-id='hideButton']")).click();
			//	driver.findElement(By.xpath("//android.widget.Button[@index='2']")).click(); // for open order
				Thread.sleep(10000);
				driver.findElement(By.xpath("//android.widget.Button[@index='3']")).click(); // tapping on confirm from the pop-up
				Thread.sleep(2000);
				
				
			
					
				
				
				
				driver.findElement(By.xpath("//android.widget.Button[@resource-id='captureButton']")).click(); // tapping on capture button to move to the camera
				driver.findElement(By.xpath("//android.widget.Button[@index='2']" )).click(); // allowing access
				driver.findElement(By.xpath("//android.widget.Button[@index='2']" )).click(); // allowing access
				Thread.sleep(2000);
				driver.findElement(By.xpath("//GLButton[@index='4']")).click(); // capturing
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click(); // clicking on ok after capturing image
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.widget.Button[@resource-id='confirmButton']")).click(); // taping on next
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//android.widget.Button[@resource-id='captureButton']")).click(); // tapping on capture button to move to the camera
				Thread.sleep(2000);
				driver.findElement(By.xpath("//GLButton[@index='4']")).click(); // capturing
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click(); // clicking on ok after capturing image
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.widget.Button[@resource-id='confirmButton']")).click(); // taping on next
				Thread.sleep(2000);

				driver.findElement(By.xpath("//android.widget.Button[@resource-id='captureButton']")).click(); // tapping on capture button to move to the camera
				Thread.sleep(2000);
				driver.findElement(By.xpath("//GLButton[@index='4']")).click(); // capturing
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.widget.TextView[@index='1']")).click(); // clicking on ok after capturing image
				Thread.sleep(2000);
				driver.findElement(By.xpath("//android.widget.Button[@resource-id='confirmButton']")).click(); // taping on next
				Thread.sleep(2000);

				// WebElement temp= (MobileElement)driver.findElement(By.xpath("//android.view.View[@text='Temporary Disconnect' and @index='1']"));
				System.out.println("found temp element");
				 // driver.findElement(By.xpath("//android.widget.Spinner[@index='1']")).click();
				//TouchAction at= new TouchAction(driver);
				int count=0;
				int a=0;
				while(a==0) {
					System.out.println("in while loop");														/* scroll down until you find the element */
					
					try {
						System.out.println("in try loop");
						
						int b=driver.findElements(By.xpath("//android.widget.Spinner[@index='1']")).size();
						if(count>=2 && count< 4 && b==1 ) {
							System.out.println("in if loop");
							break;}
						else {
							System.out.println("in else loop");
							action.press(100,900).moveTo(100,300).release().perform();
							count++;}
							
					}catch(Exception e) {
						System.out.println("in catch loop");
					}
					
				}
				
				driver.findElement(By.xpath("//android.widget.Spinner[@index='1']")).click();  // click on choose reason
				driver.findElement(By.xpath("//android.widget.RadioButton[@text='Poor network-drop calls'][@index='1']")).click();   //select the reason
				driver.findElement(By.xpath("//android.widget.Button[@text='Next'][@index='0']")).click(); // click on next
				Thread.sleep(3000);
				driver.findElement(By.linkText("//android.widget.CheckBox[@index='1']")).click();  // check the checkbox (not working)
				
				
		//		//With CXP Login
		//		driver.findElement(By.xpath("//*[@resource-id='userId']/android.widget.EditText[@index='0']")).sendKeys("username");;
		//		driver.findElement(By.xpath("//*[@resource-id='password']/android.widget.EditText[@index='0']")).sendKeys("password");;
		//		driver.findElement(By.xpath("//*[@resource-id=\"loginButton\"]")).click();

		//		//With CP1 Login
		//		driver.findElement(By.xpath("//*[@resource-id='userId']/android.widget.EditText[@index='0']")).sendKeys("S002932248");;
		//		driver.findElement(By.xpath("//*[@resource-id='password']/android.widget.EditText[@index='0']")).sendKeys("Jan@2019");;
		//		driver.findElement(By.xpath("//*[@resource-id=\"loginButton\"]")).click();
		//				
		//				//With CP2 Login
		//		driver.findElement(By.xpath("//*[@resource-id='userId']/android.widget.EditText[@index='0']")).sendKeys("S002932229");;
		//		driver.findElement(By.xpath("//*[@resource-id='password']/android.widget.EditText[@index='0']")).sendKeys("P@ssword1");;
		//		driver.findElement(By.xpath("//*[@resource-id=\"loginButton\"]")).click();
		//				
		//				//With CP2 Login
		//		driver.findElement(By.xpath("//*[@resource-id='userId']/android.widget.EditText[@index='0']")).sendKeys("S002932207");;
		//		driver.findElement(By.xpath("//*[@resource-id='password']/android.widget.EditText[@index='0']")).sendKeys("Jan@2019");;
		//		driver.findElement(By.xpath("//*[@resource-id=\"loginButton\"]")).click();
					
	}
	
	public static void main(String[] args) throws InterruptedException {
		Login login = new Login();
		//TD td= new TD();
		login.setUp();
		login.checkLogin();
		//Thread.sleep(5000);
		//td.terminate();
	}

}
