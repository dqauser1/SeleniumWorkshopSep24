package org.selenium.trainings.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;

public class UsingImplicitWait extends basicsoflocators.Base{

	public static void main(String[] args) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
