package com.p2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Launch the Application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		//Wait
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		//Click on netbanking
		driver.findElement(By.xpath("//*[@class='selectWrapper']/div[contains(text(),'NetBanking')]")).click();
		driver.findElement(By.id("netbanking")).click();
		driver.findElement(By.id("loginsubmit")).click();
		
					Thread.sleep(3000);	
					
					//to get page title
		
					String pageTitle=driver.getTitle();
					System.out.println(pageTitle);
					System.out.println("*********************************");
	//Return a set of window handles which can be used to iterate over all the open windows of this Webdriver 
			Set<String> ws = driver.getWindowHandles();//get all the window address
//Each of the collection classes provides an iterator( ) method that returns an iterator to the start of the collection. 
   // using this iterator object, you can access each element in the collection, one element at a time.	
	Iterator<String> itr=ws.iterator();
	String w1=itr.next();
	String w2=itr.next();
	
	driver.switchTo().window(w2);//focus to 2nd window
	pageTitle=driver.getTitle();
	System.out.println(pageTitle);
	Thread.sleep(8000);
	//driver.findElement(By.linkText("Continue to NetBanking")).click();
	driver.findElement(By.xpath("//div[@class='pdtb25 text-center']/a")).click();
	Thread.sleep(8000);
	System.out.println("*********************************");
	pageTitle=driver.getTitle();
	System.out.println(pageTitle);
	
	}

}