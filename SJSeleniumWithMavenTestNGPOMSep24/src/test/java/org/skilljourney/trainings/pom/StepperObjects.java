package org.skilljourney.trainings.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StepperObjects {

	private WebDriver driver;
	
	@FindBy(xpath = "//div[text()='Step 1']")
	private WebElement step1;
	
	@FindBy(xpath = "//div[text()='Step 2']")
	private WebElement step2;
	
	@FindBy(xpath = "//div[text()='Step 3']")
	private WebElement step3;
	
	@FindBy(xpath = "//button[text()='Previous']")
	private WebElement previousButton;
	
	@FindBy(xpath = "//div[text()='Next']")
	private WebElement nextButton;
	
//	WebElement step1 = driver.findElement(By.xpath("//div[text()='Step 1']"));
//	
//	WebElement step2 = driver.findElement(By.xpath("//div[text()='Step 2']"));
//	
//	WebElement step3 = driver.findElement(By.xpath("//div[text()='Step 3']"));
//	
//	WebElement previousButton = driver.findElement(By.xpath("//button[text()='Previous']"));
//	
//	WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
	
	
}
