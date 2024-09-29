package org.skilljourney.trainings.pom;

public class SkillJourneyForms extends BaseTest {

	static HomeObjects home;
	static FormsObjects forms;
	
	public static void main(String[] args) {

		openBrowser();
		driver.get("https://www.skilljourney.in/Automation-Practice/HTML/");
		
		home = new HomeObjects(driver);
		forms = new FormsObjects(driver);
		
		home.openForms();
		
		forms.enterUserName("Tushar");
		forms.enterPassword("Tushar@123");
		forms.clickInlineSubmit();
		
	}

}
