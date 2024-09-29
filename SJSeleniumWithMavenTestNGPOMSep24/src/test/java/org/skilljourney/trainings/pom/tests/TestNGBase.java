package org.skilljourney.trainings.pom.tests;

import java.io.IOException;

import org.skilljourney.trainings.pom.common.POMSeleniumBase;
import org.skilljourney.trainings.pom.common.ReadFromExcel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestNGBase extends POMSeleniumBase{
	
	@BeforeTest
	void setUp() {
		openBrowser();		
	}
	
	@AfterTest
	void closeBrowser() {
		driver.quit();
	}
	
	@BeforeMethod
	void gobackToMainPage() {
		driver.navigate().to("https://www.skilljourney.in/Automation-Practice/HTML/forms.html");
	}
	
	@DataProvider
	String[][] getBasicFormsDataFromMethod() {
		
		String[][] formData = new String[2][3];
		
		formData[0][0] = "Ameya Naik";
		formData[0][1] = "ameya.naik@gmail.com";
		formData[0][2] = "Message from Ameya";
		
		formData[1][0] = "Rohit Bhargava";
		formData[1][1] = "rohit.bhargava@gmail.com";
		formData[1][2] = "Message from Rohit";
		
		return formData;		
	}
	
	@DataProvider
	Object[][] getBasicFormsDataFromExcel() throws IOException {
		return ReadFromExcel.readExcelData("src\\resources\\Names.xlsx");
	}

}
