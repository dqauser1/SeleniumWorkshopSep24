package org.skilljourney.trainings.testngworkshop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SeleniumTestNGBase {
	static WebDriver driver;
	
	@BeforeTest
	void setUp() {
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //driver.manage().window().fullscreen();
	}
	
	@AfterTest
	void tearDown() {
		driver.quit();
	}

}
