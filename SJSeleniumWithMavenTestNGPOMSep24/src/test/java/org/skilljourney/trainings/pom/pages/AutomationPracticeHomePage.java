package org.skilljourney.trainings.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeHomePage extends POMBase{

	@FindBy(linkText = "Stepper")
	WebElement stepper;
	
	@FindBy(linkText = "Sliders")
	WebElement sliders;
	
	@FindBy(linkText = "Forms")
	WebElement forms;
	
	public AutomationPracticeHomePage(String url) {
		super(url);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo(String string) {
		
		switch (string.toLowerCase()) {
		case "stepper":
			stepper.click();
			break;
			
		case "sliders":
			sliders.click();
			break;
			
		case "forms":
			forms.click();
			break;

		default:
			driver.navigate().to("https://www.skilljourney.in/Automation-Practice/HTML/");
			break;
		}
		
	}
	
	

}
