package co.dipanshu.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo2 {

	public static void main(String[] args) {
		System.out.println("Automation Script");

        WebDriver driver = new ChromeDriver();

        driver.get("https://gmail.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("identifierId")).sendKeys("sid.aka.sendEmailId@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();

        Thread.sleep(2000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        driver.quit();

        if (actualTitle.toLowerCase().contains(expectedTitle.toLowerCase())) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed!");
        }

	}

}
