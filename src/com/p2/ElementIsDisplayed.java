package com.p2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	public static WebDriver driver;

// Launch the application
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	
}

// Login validation
public void loginTest() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement objUserName = driver.findElement(By.name("userName"));

	if (objUserName.isDisplayed()) {
System.out.println("Username element found in Application and Script executing ....");
		if (objUserName.isEnabled()) {
			System.out.println("Username element is enable for typing");
			objUserName.sendKeys("qaq");

			driver.findElement(By.name("password")).sendKeys("qaq");
			driver.findElement(By.name("login")).click();

		} else {
			System.out.println("Username element is disable for typing");
		}		}
	else {
		System.out.println("Username element not found in Application");
	}
}

public void tearDown() {
	driver.close();
}

public static void main(String[] args) {
	ElementIsDisplayed obj = new ElementIsDisplayed();
	obj.setUp();
	obj.loginTest();
	obj.tearDown();
}
}