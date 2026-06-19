package co.dipanshu.selenium.demo;

public class demoAutomation {

	public static void main(String[] args) throws InterruptedException  {
		System.out.print("Automation Script");
		
		System.setProperty("", "");
		Webdriver driver = new ChromeDriver();
		driver.get("https://gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifierId")).sendKeys("sid.aka.sendEmailId@gmail.com");
		driver.findElement(By.className("CwAk91")).click();
		Thread.sleep(2000);
		
		String str = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(str.equalsIgnoreCase(str)) {
			System.out.print("Test Passed");
		}else {
			System.out.print("Test Failed!");
		}
	}
}
