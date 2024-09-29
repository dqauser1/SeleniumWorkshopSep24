package org.skilljourney.trainings.pom.tests;

import org.skilljourney.trainings.pom.pages.BasicFormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicFormsTest extends TestNGBase {
	
	@Test (dataProvider = "getBasicFormsDataFromExcel")
	void testSubmitBasicForm(String name, String email, String message) {
		
		BasicFormPage myForm = new BasicFormPage();
		
		//Enter Name
		myForm.enterName(name);
		
		//Enter Email
		myForm.enterEmail(email);
		
		//Enter Message
		myForm.enterMessage(message);
		
		//verify Name contains the name that i entered earlier
		//myForm.verifyName(name);
		
		//Submit
		myForm.submit();
		
		//verify Name contains blank
		//myForm.verifyName("");
		
	}	
	
	
}
