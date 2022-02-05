package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	WebDriver driver;
	
	
	public void StartBrowser() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ashis\\Downloads\\chromedriver_98.0.47\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
	}
	
	
	public void Test() {
		
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"topHeader\"]/div/nav[2]/a"));
		loginbtn.click();
	}

}
