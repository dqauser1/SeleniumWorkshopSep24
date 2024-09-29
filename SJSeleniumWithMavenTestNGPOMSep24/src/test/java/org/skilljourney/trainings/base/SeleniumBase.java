package org.skilljourney.trainings.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {
	
	protected static WebDriver driver;
	
	protected static void openBrowser(String browsername) {
		
		switch (browsername.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
		
		case "edge":
			driver = new EdgeDriver();
			break;
			
		default:
			driver = new ChromeDriver();
			break;
		}
		
		driver.manage().window().maximize();
		
		System.out.println("Launched "+browsername);
		
		int timeOutSeconds = 10;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOutSeconds));
		
		System.out.println("Timeout set to "+timeOutSeconds);
		
		
	}

}
