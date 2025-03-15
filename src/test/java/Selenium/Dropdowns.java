package Selenium;

import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement course = driver.findElement(By.id("course"));
        WebElement ide = driver.findElement(By.id("ide"));
        Select coursedpd = new Select(course);

        Thread.sleep(1000);
        coursedpd.selectByIndex(4);
        Thread.sleep(1000);
        coursedpd.selectByValue("java");
        Thread.sleep(1000);
        coursedpd.selectByContainsVisibleText("Dot");
        Thread.sleep(1000);
        coursedpd.selectByVisibleText("Python");
        Thread.sleep(1000);
        System.out.println(coursedpd.getFirstSelectedOption().getText());

        js.executeScript("arguments[0].scrollIntoView();",course);
        Select idedpd = new Select(ide);
        List <WebElement> ideOptions = idedpd.getOptions();
        System.out.println("Ide Options: ");
        for(WebElement ides : ideOptions){
            System.out.println(ides.getText());
        }
        idedpd.selectByIndex(0);
        Thread.sleep(1000);
        idedpd.selectByValue("ij");
        Thread.sleep(1000);
        idedpd.selectByVisibleText("Visual Studio");
        Thread.sleep(1000);
        idedpd.deselectByVisibleText("Eclipse");
        Thread.sleep(1000);

        List<WebElement> ideSelectedOptions = idedpd.getAllSelectedOptions();
        System.out.println("Ide Selected Options: ");
        for(WebElement idesel : ideSelectedOptions){
            System.out.println(idesel.getText());
        }
        driver.quit();
    }
}
