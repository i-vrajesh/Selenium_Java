package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementProperties {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        System.out.println(driver.findElement(By.name("commit")).getTagName());
        System.out.println(driver.findElement(By.name("commit")).getDomAttribute("type"));
        driver.findElement(By.id("login_field")).sendKeys("test@email.com");
        System.out.println(driver.findElement(By.id("login_field")).getAttribute("value")); //getting text from text box
        System.out.println(driver.findElement(By.xpath("//input[@id='login_field']/preceding-sibling::label")).getText());
        System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
        driver.quit();
    }
}
