package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePageObjects {
	public static WebElement txtSearchGoogle(WebDriver driver) {
		return driver.findElement(By.name("q"));
	}
	public static WebElement btnGoogleSearch(WebDriver driver){
		return driver.findElement(By.name("btnk"));
	}}