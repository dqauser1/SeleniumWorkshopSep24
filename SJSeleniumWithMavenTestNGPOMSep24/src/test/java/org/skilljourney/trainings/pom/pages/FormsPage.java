package org.skilljourney.trainings.pom.pages;

import java.lang.module.FindException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends POMBase{

	@FindBy(xpath = "//form[@id='inline-form']/input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath = "//form[@id='inline-form']/input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//form[@id='inline-form']/button")
	WebElement submit;
	
	public FormsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {

		username.sendKeys("ameya");
		password.sendKeys("ameya123");
		submit.click();
	}

}
