package com.p2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelected {

	public static WebDriver driver;
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("REGISTER")).click();
	}
	public static void searchItem() {
	WebElement mylist = driver.findElement(By.name("country"));
                List<WebElement> lt = mylist.findElements(By.tagName("option"));
		boolean status = false;
		for (int i = 0; i < lt.size(); i++) {
		String C = lt.get(i).getText();
		if (C.equals("INDIA ")) {
		Select select = new Select(mylist);
		select.selectByVisibleText("INDIA ");
     System.out.println("Option with 'INDIA' is available in Dropdown");
		status = true;
		break;
		}
		}
		if (status != true) {
System.out.println("Option with ' INDIA ' is  not available in Dropdown");
		}
		}
public static void tearDown() {
	//driver.close();
	}
	public static void main(String[] args) {
		setUp();
		searchItem();
		tearDown();
	}
	}