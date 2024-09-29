package org.skilljourney.trainings.testngworkshop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTests {
	
	//Static Class property
	static WebDriver driver;
	
	//1. Setup - Open Browser and navigate to Google
	@BeforeTest
	void setUp() {
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	void restoreHomePage() {
		driver.navigate().to("https://www.google.com");
	}
	
	//2. Test 1 - Search for a text and verify if results open
	@Test
	void googleSearch() {
		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}
	
	//3. Test 2 Click on I am Feeling Lucky and verify if new page opens
	@Test
	void googleFeelingLucky() {
		driver.findElement(By.xpath("(//input[@name=\"btnI\"])[2]")).click();
		Assert.assertTrue(driver.getTitle().contains("Doodle"));
	}
	
	//4. Test 3 - Type only "Sele", wait for suggestions and verify all 
	// Google Suggestions contain the letters "Sele" 
	@Test
	void suggestionsTest() {
		
		driver.findElement(By.name("q")).sendKeys("Sele");
		
		By suggestionsLocator = By.xpath("//div[@class='OBMEnb']//li");
		
//		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		myWait.until(ExpectedConditions.presenceOfElementLocated(suggestionsLocator));
		
		String text = driver.findElement(suggestionsLocator).getText();
		
		System.out.println(text);
		
		List<WebElement> suggestions = driver.findElements(suggestionsLocator);
		
		int lengthofSuggestions = suggestions.size();
		
		for(int i=0; i<lengthofSuggestions; i++) {
			text = suggestions.get(i).getText();
			System.out.println(text);
			Assert.assertTrue(text.toLowerCase().contains("sele"));
		}
		
		//For every element inside the list of elements
		for (WebElement item : suggestions) {
			System.out.println(item.getText());
			Assert.assertTrue(item.getText().toLowerCase().contains("sele"));
		}
		
	}
	
	
	
	
	//5. Close the Browser
	@AfterTest
	void tearDown() {
		//driver.close();
		driver.quit();
	}

}
