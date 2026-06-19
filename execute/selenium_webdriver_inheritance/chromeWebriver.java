package selenium_webdriver_inheritance;

public class chromeWebriver extends webdriver {

	@Override
	public void closeWebDriver(String browserName) {
		super.closeWebDriver("closed the super class!!!");
		System.out.println("closed webpage!");
	}
}
