package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BasicControls {

    @Test
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webDriver.chrome.driver","//Path");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Radio btn
//        WebElement femaleRBtn = driver.findElement(By.id("femalerb"));
//        js.executeScript("arguments[0].scrollIntoView();",femaleRBtn);
////        femaleRBtn.click();
//        js.executeScript("arguments[0].click()",femaleRBtn);
//        System.out.println("Female Radio Button Selected: " + femaleRBtn.isSelected());
//        System.out.println("Female Radio Button Displayed: " + femaleRBtn.isDisplayed());
//        System.out.println("Female Radio Button Enabled: " + femaleRBtn.isEnabled());
//        Thread.sleep(1000);

        //CheckBox
//        WebElement hindiChkBox = driver.findElement(By.id("hindichbx"));
//        hindiChkBox.click();
//        System.out.println("Hindi Check Box is Selected: " + hindiChkBox.isSelected());
//        hindiChkBox.click();
//        System.out.println("Hindi Check Box is Selected: " + hindiChkBox.isSelected());
//        driver.quit();

        //SubmitBtn
        WebElement RegisterBtn = driver.findElement(By.id("registerbtn"));
        js.executeScript("arguments[0].scrollIntoView();",RegisterBtn);
        RegisterBtn.click();
        WebElement RegisterMsg = driver.findElement(By.id("msg"));
        System.out.println("Register Msg: "+RegisterMsg.getText());
        WebElement homePageLink = driver.findElement(By.partialLinkText("navigate"));
        homePageLink.click();
    }
}
