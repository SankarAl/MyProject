package com.p2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReturnAValueFromMethod {
	public static WebDriver driver;
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
public static String clickLinks(String nLanguage,String iLanguage){
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
String langStatus;
	if (nLanguage.equals("हिन्दी")) {
		langStatus = "Hindi link got clicked";
		} else if (nLanguage.equals("తెలుగు")) {
		langStatus = "Telugu link got clicked";
		} else {
		langStatus = "English link got clicked";
		}
		driver.findElement(By.linkText(nLanguage)).click();
		driver.findElement(By.linkText(iLanguage)).click();	
		return langStatus;
		}	
public static void tearDown() {
		driver.quit();
	}	
	public static void main(String[] args) {
		setUp();
		String language1=clickLinks("हिन्दी","English");
		String language2=clickLinks("తెలుగు","English");
		
		System.out.println(language1);
		System.out.println(language2);
		
		tearDown();
	}
	}