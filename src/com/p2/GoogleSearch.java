package com.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//pass the url and Search test
		driver.get("https://www.google.com/");
		//Using Name
		//WebElement element = driver.findElement(By.name("q"));
		//Using X-path
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("Worldcup");
		element.clear();
		element.sendKeys("worldcup2019");
		Thread.sleep(3000);
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		//click on images link
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.xpath("//div/a[text()='Images']")).click();
		//Click on all Link
		driver.findElement(By.linkText("All")).click();
		//Read test from page using getText(); method
		String Res=driver.findElement(By.id("resultStats")).getText();
		System.out.println(Res);
		
		
		
		
		
		
		
		

	}

}
