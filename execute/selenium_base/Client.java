package selenium_base;
import selenium_webdriver_inheritance.*;

public class Client {

	public static void main(String[] args) {
		// Chrome automation test 1
		chromeWebriver chrome = new chromeWebriver();
		chrome.openWebDriver("www.google.com");
		System.out.println("driver.sleep(2000)");
		chrome.navigate("www.google.com");
		System.out.println("driver.sleep(2000)");
		chrome.closeWebDriver("www.google.com");
	
		System.out.println("-------------------------------");

		// brave automation test 1
		BraveWebDriver brave = new BraveWebDriver();
		chrome.openWebDriver("www.google.com");
		System.out.println("driver.sleep(2000)");
		chrome.navigate("www.google.com");
		System.out.println("driver.sleep(2000)");
		chrome.closeWebDriver("www.google.com");
		
	}

}
