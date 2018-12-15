package DemoMavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTestMaven {
	
	@Test
	public void PageTest()
	{
		System.out.println("Welcome to the World of Jenkins.....");
		
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\Selenium_Practice\\Chrome_Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		System.out.println("Page Title is : " + dr.getTitle());
		System.out.println("Test Case passed");
	}

}
