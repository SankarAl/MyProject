package com.p2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayLinks {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {	
	//Launch the application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://in.ebay.com/");
		Thread.sleep(2000);
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Count the no of links
		List<WebElement>  olinks=driver.findElements(By.tagName("a"));	
		//Display the no of links
		System.out.println(olinks.size());
		
		for (int i=0; i < olinks.size(); i++){
			System.out.println(olinks.get(i).getText());
			
		/*for(WebElement olink:olinks){
			//Display the link Textnames
			System.out.println(olink.getText());*/
		}
		driver.quit();

	}

}
