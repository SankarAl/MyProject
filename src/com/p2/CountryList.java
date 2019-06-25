package com.p2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountryList {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		//Select country=new Select(driver.findElement(By.name("country")));
		
       List<WebElement> elist=driver.findElements(By.tagName("option"));
       
       System.out.println("No of Country's"+elist.size());
       int i;
       for (i=0;i<elist.size();i++)
       {
    	   System.out.println(elist.get(i).getText());
    	   //driver.close();
       }
       
	}

}
