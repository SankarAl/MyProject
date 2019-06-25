import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RuggedRare {
	public static WebDriver driver;
@BeforeClass
public static void setUp() throws InterruptedException {
	// Launch chrome browser
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	// pass the url and Search test
	driver.get("http://34.205.144.74:3000/RuggedRare/#!/Admin");
	Thread.sleep(3000);

}
@Test
public static void loginApp() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Appmasters321");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
}
@AfterClass
public static void tearDown() {
	driver.quit();

}
}




