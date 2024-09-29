package org.skilljourney.trainings.testngworkshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Edge196Test extends SeleniumTestNGBase {
	
	@Test
	void testEmailSubmission() throws InterruptedException {
		driver.get("https://www.edge196.com/");
		
		//How to Switch Frames
		driver.switchTo().frame("iframewin");
		
		WebElement email = driver.findElement(By.name("CONTACT_EMAIL"));
		
		//Declare an Action variable
		Actions myAction = new Actions(driver);
		
		//Define what Actions you want to do
		myAction.scrollToElement(email);
		
		//Perform those Actions
		myAction.build().perform();
		
		Thread.sleep(5000);
		
		email.sendKeys("ameya.naik@xyz.com");
		
		driver.findElement(By.xpath("//input[@value='Join Now']")).click();
	}

}
