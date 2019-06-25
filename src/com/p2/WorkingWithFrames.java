package com.p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithFrames {
	public static WebDriver fd;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		fd = new ChromeDriver();
		fd.manage().window().maximize();
		// Intilize the url
		fd.get("http://jqueryui.com/draggable/");
		// wait
		Thread.sleep(3000);
		fd.switchTo().frame(fd.findElement(By.xpath("//*[@class='demo-frame']")));
		WebElement w = fd.findElement(By.id("draggable"));
		Thread.sleep(2000);
		new Actions(fd).dragAndDropBy(w, 120, 110).perform();
		Thread.sleep(5000);
		fd.get("http://jqueryui.com/droppable/");
		fd.switchTo().frame(fd.findElement(By.xpath("//*[@class='demo-frame']")));
		WebElement w1 = fd.findElement(By.id("draggable"));
		WebElement w2 = fd.findElement(By.id("droppable"));
		Thread.sleep(2000);
		new Actions(fd).dragAndDrop(w1, w2).perform();
		

	}

}
