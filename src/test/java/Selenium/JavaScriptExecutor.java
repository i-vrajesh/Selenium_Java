package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup(); //from 4.6.0 no need to declare driver.. selenium manager will automatically do
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement email = (WebElement)js.executeScript("return document.getElementById('email');");
        email.sendKeys("test@email.com");
        js.executeScript("document.getElementById('pass').value='pass'");
        Thread.sleep(2000);
//        js.executeScript("document.getElementsByName('login').click()");
//        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,500)"); //consider scrolling from x=0,y=0
        js.executeScript("window.scrollBy0,500)"); //consider scrolling from where focus is on page
        js.executeScript("document.getElementsByName('login').scrollIntoView();");//scroll to element

        Thread.sleep(3000);

        driver.quit();
    }
}
