package basicsoflocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {

	public static void main(String[] args) {
		
		openBrowser();
		
		driver.navigate().to("https://www.skilljourney.in/Automation-Practice/HTML");
		
		//linkText
		driver.findElement(By.linkText("Forms")).click();
		
		//id
		WebElement dropdown = driver.findElement(By.id("context"));
		
		Select dDown = new Select(dropdown);
		
		dDown.selectByIndex(0);
//		dDown.selectByValue();
	}
	
	
	
}
