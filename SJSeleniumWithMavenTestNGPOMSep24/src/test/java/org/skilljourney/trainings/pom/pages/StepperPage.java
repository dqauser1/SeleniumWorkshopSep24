package org.skilljourney.trainings.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StepperPage extends POMBase{
	
	public StepperPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[@class='step active']")
	WebElement activeStep;
	
	public String getActiveStep() {
		return activeStep.getText();
	}

}
