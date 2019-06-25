package com.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
	//Create the Object
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//Open the Google chrome Browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		//Maxmize the browser
		driver.manage().window().maximize();
		//pass the url
		driver.get("https://www.google.com/");
		//Click on Gmail Link
		driver.findElement(By.linkText("Gmail")).click();
		

	}

}
