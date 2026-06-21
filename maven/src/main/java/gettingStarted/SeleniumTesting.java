package gettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://google.com");
//		driver.manage().window().fullscreen();
		System.out.println(driver.manage().logs());

		System.out.println("The browser Handle : "+driver.getWindowHandle());

		for(String handle: driver.getWindowHandles()) {
			System.out.println("The browser Handle : "+ handle);
		}
	}

}
