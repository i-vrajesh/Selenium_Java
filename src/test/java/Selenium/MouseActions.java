package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.PseudoType;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/");
        WebElement seelniumPractice = driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/a"));
        WebElement basicControls = driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[7]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(seelniumPractice)
                .moveToElement(basicControls)
                .click()
                .perform();
        Thread.sleep(5000);
        WebElement fName = driver.findElement(By.id("firstName"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",fName);
        fName.sendKeys("John");
        actions.doubleClick(fName).perform();
        Thread.sleep(5000);
        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClick = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        actions.contextClick(rightClick).perform();
        driver.findElement(By.xpath("/html/body/ul/li[1]/span")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();
    }
}
