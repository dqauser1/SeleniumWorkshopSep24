package org.skilljourney.trainings.pom.tests;

import org.skilljourney.trainings.pom.pages.AutomationPracticeHomePage;
import org.skilljourney.trainings.pom.pages.FormsPage;
import org.skilljourney.trainings.pom.pages.POMBase;
import org.skilljourney.trainings.pom.pages.SlidersPage;
import org.skilljourney.trainings.pom.pages.StepperPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSkillJourneyPracticeSite extends POMBase{
	
	AutomationPracticeHomePage homepage;
	
	@BeforeTest
	void setUp() {
		homepage = new AutomationPracticeHomePage("https://www.skilljourney.in/Automation-Practice/HTML/");
	}
	
	@BeforeMethod
	void backtoHome() {
		if(getBrowserTitle().equals("Home")) { 
			homepage.navigateTo("Home");
		}
	}
	

	@AfterTest
	void tearDown() {
		driver.quit();
	}
	
	@Test
	void verifyStepperDefaults() {
		
		homepage.navigateTo("Stepper");
		
		Assert.assertEquals(driver.getTitle(), "Stepper");
		
		StepperPage stepperpage = new StepperPage();
		
		String activeStep = stepperpage.getActiveStep();
		
		Assert.assertEquals(activeStep, "Step 1");
		
	}
	
	@Test
	void verifySliders() {
		
		homepage.navigateTo("Sliders");
		
		SlidersPage slidersPage = new SlidersPage();
			
		Assert.assertEquals(slidersPage.getFirstSliderValue(),"50");
		
	}
	
	@Test
	void verifyForm() {
		homepage.navigateTo("Forms");
		
		FormsPage formsPage = new FormsPage();
		
		formsPage.login();
	}

}
