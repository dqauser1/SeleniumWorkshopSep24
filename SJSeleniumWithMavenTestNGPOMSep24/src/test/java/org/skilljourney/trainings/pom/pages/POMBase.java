package org.skilljourney.trainings.pom.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class POMBase {
	
	protected static WebDriver driver;
	
	public POMBase() {
	}
	
	public POMBase(String url) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	protected Object getBrowserTitle() {
		return driver.getTitle();
	}

}
