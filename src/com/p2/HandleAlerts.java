package com.p2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	public static WebDriver driver;
	public static void main(String[] args) {
		//launch the Application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://secure.aponline.gov.in/CitizenPortal/UserInterface/Citizen/LoginForm.aspx");
		driver.manage().window().maximize();
		
		//to enter user id and to click submit without pwd
		driver.findElement(By.id("userId")).sendKeys("Sankar");
		driver.findElement(By.id("ImageButton1")).click();
		//Switch to Alert
		Alert movetoalert=driver.switchTo().alert();
		System.out.println(movetoalert.getText());
		movetoalert.accept();
					
		//to click on "GO"
		driver.findElement(By.id("imgBtnGo")).click();
		
	}

}
