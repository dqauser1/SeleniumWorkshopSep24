package org.skilljourney.trainings.pom.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMSeleniumBase {
	
	public static WebDriver driver;
	
	public void openBrowser() {
		driver = new ChromeDriver();
	}

}
