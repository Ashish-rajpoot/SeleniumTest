package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Testing {

	WebDriver driver;
	
	@BeforeTest	
	public void StartBrowser() {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\ashis\\Downloads\\chromedriver_98.0.47\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void Test() {
		driver.get("https://www.simplilearn.com/");
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"topHeader\"]/div/nav[2]/a"));
		loginbtn.click();
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
}
