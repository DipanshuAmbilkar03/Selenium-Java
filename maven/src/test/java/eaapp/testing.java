package eaapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class testing {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
//       https://www.atlassian.com/
//       http://eaapp.somee.com/
        String url = "http://eaapp.somee.com/";

//       web API interface

         openUrl("http://eaapp.somee.com/",driver);

//       login
         login(driver);
//       create New User
         createUser(driver);
    }

    private static void openUrl(String url,WebDriver driver) throws MalformedURLException {
        URL website = new URL(url);
        System.out.println(website.getHost());

//        System.out.println(url.split("\\.")[0]+"!!!");
        driver.navigate().to(url);
        driver.manage().window().fullscreen();
    }

    private static void login(WebDriver driver) {
//        Java BY interface
//        By lnkLogin = By.linkText("Login");

//        web element interface for login click
//        WebElement loginBtn = driver.findElement(lnkLogin);
        WebElement loginBtn = driver.findElement(By.linkText("Login"));
        loginBtn.click();

//        admin username

//        By txtUserName = By.id("UserName");
//        WebElement txtUserNameElement = driver.findElement(txtUserName);
//        txtUserNameElement.sendKeys("admin");

        driver.findElement(By.id("UserName")).sendKeys("admin");

//        admin password

//        By txtPassWord = By.id("Password");
//        WebElement txtPassWordElement = driver.findElement(txtPassWord);
//        txtPassWordElement.sendKeys("password");

        driver.findElement(By.id("Password")).sendKeys("password");

//      signUp btn

//        By chkRememberMe = By.id("RememberMe");
//        WebElement lnkchkRememberMe = driver.findElement(chkRememberMe);
//        lnkchkRememberMe.click();

        driver.findElement(By.id("RememberMe")).click();

//      click sign in

//        By lnkSignin = By.className("btn-signin");
//        WebElement lnkSigninBtn = driver.findElement(lnkSignin);
//        lnkSigninBtn.click();


        driver.findElement(By.className("btn-signin")).click();
    }

    private static void createUser(WebDriver driver) {
//        click 👥 Employees
        driver.findElement(By.linkText("\uD83D\uDC65 Employees")).click();
//        create new Emp
        driver.findElement(By.className("btn-create")).click();

//        input box - searchTerm
        //name - Name
        driver.findElement(By.id("Name")).sendKeys("seleniumUser");
        driver.findElement(By.name("Age")).sendKeys("20");
        driver.findElement(By.id("Salary")).sendKeys("25000");

//        if(driver.findElement(By.xpath("//span[text()='The Duration Worked (months) field is required.']")).isDisplayed()) {
//            driver.findElement(By.name("DurationWorked")).sendKeys("24");
//        }else {
////            do nothing
//        }

//        WebElement gradeElement = driver.findElement(By.id("Grade"));
        Select grade = new Select(driver.findElement(By.id("Grade")));
        grade.selectByVisibleText("Junior");
//        grade.selectByValue("");

        driver.findElement(By.id("Email")).sendKeys("seleniumUser@gmail.com");

        driver.findElement(By.className("btn-submit")).submit();

        List<WebElement> validationErrorMsgDuration = driver.findElements(
                By.xpath("//span[text()='The Duration Worked (months) field is required.']")
        );

        if(!validationErrorMsgDuration.isEmpty() && validationErrorMsgDuration.get(0).isDisplayed()) {
            driver.findElement(By.name("DurationWorked")).sendKeys("24");
            driver.findElement(By.className("btn-submit")).submit();
        }
//        search box
//        driver.findElement(By.name("searchTerm")).sendKeys("Dipanshu");
//        driver.findElement(By.name("emailTerm")).sendKeys("dipanshudemo@gmail.com");
//        driver.findElement(By.name("searchTerm")).sendKeys("junior");

    }

}
