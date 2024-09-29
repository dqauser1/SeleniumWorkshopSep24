package org.skilljourney.trainings.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {

	private WebDriver driver;
	
	//parameterized constructor
	public HomeObjects(WebDriver driver) {

//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Stepper']")
	private WebElement stepper;
	
	@FindBy(xpath = "//a[text()='Accordion']")
	private WebElement accordion;
	
	@FindBy(xpath = "//a[text()='Forms']")
	private WebElement forms;
	
	public void openForms() {
		forms.click();
		System.out.println("Clicked on Forms");
	}
	
	//WebElement stepper = driver.findElement(By.xpath("//a[text()='Stepper']"));
	
	//WebElement accordion = driver.findElement(By.xpath("//a[text()='Accordion']"));
	
	//WebElement forms = driver.findElement(By.xpath("//a[text()='Forms']"));
	
}
