package org.skilljourney.trainings.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsObjects {

	
private WebDriver driver;
	
	public FormsObjects(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//form[@id='inline-form']/button[text()='Submit']")
	private WebElement inlineSubmitButton;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@placeholder='Message']")
	private WebElement message;
	
	@FindBy(xpath = "//button[text()='Send']")
	private WebElement basicFormSendButton;
	
	@FindBy(id = "name")
	private WebElement formWithLabelsName;
	
	@FindBy(id = "email")
	private WebElement formWithLabelsEmail;
	
	@FindBy(id = "#context")
	private WebElement formWithLabelsRolesDropDown;
	
	@FindBy(css = "#labeled-form button[type='submit']")
	private WebElement formWithLabelSubmitButton;
	
	@FindBy(name ="newsletter")
	private WebElement  SubscribeToNewsletterCheckBox;
	
	@FindBy(name ="updates")
	private WebElement receiveProductUpdatesCheckBox;
	
	@FindBy(xpath ="//input[@name='gender' and @value='male']")
	private WebElement   genderRadioMale;

	@FindBy(xpath ="//input[@name='gender' and @value='female']")
	private WebElement   genderRadioFemale;

	@FindBy(xpath ="//input[@name='gender' and @value='other']")
	private WebElement   genderRadioOther;
	
	@FindBy(xpath = "//form[@id ='radio-form']/button[contains(text(),'Submit')]")
	private WebElement RadioSubmitButton;


	public void enterUserName(String name) {
		
		userName.sendKeys(name);
	}


	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}


	public void clickInlineSubmit() {
		inlineSubmitButton.click();
	}
	
}