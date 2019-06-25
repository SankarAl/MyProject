package com.p2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDate {
	static WebDriver driver;
	static void operation(By locator) {
		driver.findElement(locator).click();
	
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");//url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		operation(LocatorsOfSpiceJet.roundTripbuton);						
		operation(LocatorsOfSpiceJet.dropDown);		
		operation(LocatorsOfSpiceJet.From);
		operation(LocatorsOfSpiceJet.To);
		operation(LocatorsOfSpiceJet.departureDate);
		Thread.sleep(500);
		operation(LocatorsOfSpiceJet.passengerDropDown);	
		operation(LocatorsOfSpiceJet.adultCount);
		operation(LocatorsOfSpiceJet.clickOnDone);
		Select s=new Select(driver.findElement(LocatorsOfSpiceJet.currenctDropDown));
		s.selectByIndex(2);
		operation(LocatorsOfSpiceJet.searchFlights);
		driver.close();

	}

}