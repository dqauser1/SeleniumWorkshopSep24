package basicsoflocators;

import org.openqa.selenium.By;

public class BasicsOfXPath extends Base {

	public static void main(String[] args) {

		openBrowser();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		//absolute xpath
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/input"))
//		.sendKeys("Rohit");
		
		//relative xpath
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rohit");
		
	}

}
