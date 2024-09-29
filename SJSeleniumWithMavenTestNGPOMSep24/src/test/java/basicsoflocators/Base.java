package basicsoflocators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	protected static WebDriver driver;
	
	public static void openBrowser() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.google.com");
//		Dimension size = new Dimension(1024,768);
//		driver.manage().window().setSize(size);
	}

}
