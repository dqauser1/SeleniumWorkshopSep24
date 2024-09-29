package org.skilljourney.trainings.testngworkshop;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v127.tethering.model.Accepted;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RediffFinanceTableTest extends SeleniumTestNGBase {
	
	//1. Open the url:https://money.rediff.com/gainers
	
	//2. Click on Group Z
	
	//3. Print only those company names whose price is > 100 
		//4.a - Get All Elements in a List
		//4.b - Compare the prices of all elements and print those with price > 100
	
	@Test
		void testPriceGreaterThan100() throws InterruptedException {
			driver.get("https://money.rediff.com/gainers");
			
			WebElement groupZLink = driver.findElement(By.linkText("Group Z"));
			
			new Actions(driver).moveToElement(groupZLink).click().build().perform();
			
			//Thread.sleep(5000);
			
			//Get All Table Rows
			List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
			
			for(int i=1;i<tableRows.size();i++) {
				String price = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[" + i + "]/td[4]")).getText();
				
				if(Double.parseDouble(price) > 100.00) {
					System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+ i +"]/td[1]")).getText());
				}
			}
		}
		
		@Test
		void testPriceGreaterThan100alternate() throws InterruptedException {
			
			driver.get("https://money.rediff.com/gainers");
			
			WebElement groupZLink = driver.findElement(By.linkText("Group Z"));
			
			new Actions(driver).moveToElement(groupZLink).click().build().perform();
			
			//Thread.sleep(5000);
			
			//Get All Table Rows
			List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
			
			for (WebElement row : tableRows) {				
				List<WebElement> columns = row.findElements(By.tagName("td"));
				
				String price = columns.get(3).getText();
				price.replace(",", "");
				
				if(Double.parseDouble(price)>100) {
					System.out.println(columns.get(0).getText());
				}
				
				//int, char, float, byte
				//Wrapper Classes
//				String s = "547643,6458,75";
//				s = s.replace(",", "");
//				Double d = Double.parseDouble(s);
//				if(d>100);
				
				
				
			}
				
		}
		
}

