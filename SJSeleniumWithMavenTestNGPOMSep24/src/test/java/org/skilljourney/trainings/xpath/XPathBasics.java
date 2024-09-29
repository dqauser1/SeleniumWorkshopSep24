package org.skilljourney.trainings.xpath;

import org.openqa.selenium.By;

public class XPathBasics extends basicsoflocators.Base {

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
		driver.findElement(By.xpath("//*[contains(text(),'Male')]/..")).click();
		
		
		
	}
}
