package org.selenium.trainings.synchronization;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.skilljourney.trainings.base.SeleniumBase;

public class CustomFluentWaitExample extends SeleniumBase{

	public static void main(String[] args) {
		
		openBrowser("Chrome");

		Function<WebDriver, WebElement> f = new Function<WebDriver, WebElement>() {
		    public WebElement apply(WebDriver driver) {
		        return driver.findElement(By.id("elementId"));
		    };
		};
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		WebElement e = fluentWait.until(f);
	}
}
