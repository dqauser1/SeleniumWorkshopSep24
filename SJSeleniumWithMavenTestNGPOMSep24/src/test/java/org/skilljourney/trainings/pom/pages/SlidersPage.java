package org.skilljourney.trainings.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SlidersPage extends POMBase {
	
	@FindBy (id = "slider1-value")
	WebElement firstslidervalue;
	
	@FindBy (id = "slider2-value")
	WebElement secondslidervalue;
	
	public SlidersPage() {
		PageFactory.initElements(driver, this);
	}

	public String getFirstSliderValue() {
		return firstslidervalue.getText();
	}

}
