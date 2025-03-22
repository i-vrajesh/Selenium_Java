package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        /* XPATH Introduction : XML Path Language
        * Types of Xpath : Absolute(/) & Relative(//)
        * XPath using Attributes : //tagName[@attribute='value']
        * Xpath Operators : =, !=, <, <=, >, >=
        * Xpath Conditions : and, or, not
        * Xpath with Index : //table[@id='contactList']/tbody/tr[3]/td[1]
        * Xpath Functions :
            text - //a[text()='Sign in'],
            contains - //a[contains(text(),'Sign in into')], //div[contains(@class,'signin')],
            starts-with - //a[starts-with(text(),'Sign in into')],
            normalize-space - //label[normalize-space(text())='First Name'],
            last - //table[@id='contactList']/tbody/tr[last()],
            position - //table[@id='contactList']/tbody/tr[position()>2]
        * Xpath Axes
        * Xpath Shortcuts
        * Third party Xpath Tools
        * */
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement heading = driver.findElement(By.xpath("//h1[@itemprop='name' and @class='post-title entry-title']"));
        js.executeScript("arguments[0].scrollIntoView();",heading);
        driver.findElement(By.xpath("//input[@maxlength<=12]")).sendKeys("FName");
        driver.findElement(By.xpath("//input[@maxlength!=10]")).sendKeys("LName");
        WebElement table = driver.findElement(By.xpath("//table[@id='contactList']"));
        js.executeScript("arguments[0].scrollIntoView();",table);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
