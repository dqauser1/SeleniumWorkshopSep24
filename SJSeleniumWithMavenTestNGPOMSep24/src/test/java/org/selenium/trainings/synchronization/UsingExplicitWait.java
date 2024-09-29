package org.selenium.trainings.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait extends basicsoflocators.Base{

	public static void main(String[] args) {
		
		openBrowser();
		
		driver.get("https://www.google.com");
		
		WebElement googleSearchBox =driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("Selenium");
		googleSearchBox.sendKeys(Keys.ENTER);
		
		WebElement firstSearchResult = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(firstSearchResult));
		String resultText = firstSearchResult.getText();
		
		System.out.println(resultText);
		
		
	}

}
