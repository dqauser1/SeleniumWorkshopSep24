package org.skilljourney.trainings.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.skilljourney.trainings.pom.common.POMSeleniumBase;
import org.testng.Assert;

public class BasicFormPage extends POMSeleniumBase{
	
	public BasicFormPage() {
		//driver.get("https://www.skilljourney.in/Automation-Practice/HTML/forms.html");
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@placeholder='Name']")
	WebElement fullname;
	
	@FindBy(xpath = "//*[@placeholder='Email']")
	WebElement useremail;
	
	@FindBy(xpath = "//*[@placeholder='Message']")
	WebElement usermessage;
	
	public void enterName(String name) {
		
		fullname.sendKeys(name);
	}

	public void enterEmail(String email) {
		
		useremail.sendKeys(email);
		
	}
	
	public void enterMessage(String message) {
		
		usermessage.sendKeys(message);
		
	}

	public void verifyName(String name) {
		
		Assert.assertEquals(fullname.getText(), name);
		
	}

	public void submit() {
		
		usermessage.submit();
		
	}

	
	
}
