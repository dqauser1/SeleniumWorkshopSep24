package basicsoflocators;

import org.openqa.selenium.By;

public class BasicLocators extends Base {

	public static void main(String[] args) {
		openBrowser();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		//id
		driver.findElement(By.id("firstName")).sendKeys("Rohit");
		
		//className
		String formHeading = driver.findElement(By.className("text-center")).getText();
		System.out.println(formHeading);
		
		
	}
}
