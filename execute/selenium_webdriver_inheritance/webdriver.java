package selenium_webdriver_inheritance;
import selenium_webdriver_inheritance.*;

public class webdriver {
	public void openWebDriver(String browserName) {
		System.out.println("opened webpage!");
	}
	
	public String openWebDriver(String browserName,int browserVersion) {
		System.out.println("opened "+browserName+"webpage with the assigned browser version number : " + browserVersion);
	
		return browserName + ":" + browserVersion;
	}

	public void navigate(String URL) {
		System.out.println("navigated to the webpage!");
	}
	
	public void closeWebDriver(String browserName) {
		System.out.println("closed webpage!");
	}

	
	public static void main(String[] args) {
//		main method 
	}

}
