package org.selenium.trainings.synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingFluentWait extends basicsoflocators.Base{

	public static void main(String[] args) {
		
		openBrowser();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		//text()
		String formHeading = driver.findElement(By.xpath("//*[text()='Student Registration Form']")).getText();
		System.out.println(formHeading);
		
		//contains(text())
		formHeading = driver.findElement(By.xpath("//*[contains(text(),'Registration Form')]")).getText();
		System.out.println(formHeading);
		
		//starts-with()
		formHeading = driver.findElement(By.xpath("//*[starts-with(text(),'Stud')]")).getText();
		System.out.println(formHeading);
		
		//jumping to parent tag
		
		WebElement maleRadio = driver.findElement(By.xpath("//*[contains(text(),'Male')]/.."));
		
		//Fluent wait
		FluentWait fWait =new FluentWait(driver);
		
		//Specify the maximum timeout of the wait
		fWait.withTimeout(Duration.ofSeconds(10));
		
		//Specify the polling time
		fWait.pollingEvery(Duration.ofSeconds(2));
		
		fWait.until(ExpectedConditions.elementToBeClickable(maleRadio));
		
		
		maleRadio.click();
		
		
	}

}
