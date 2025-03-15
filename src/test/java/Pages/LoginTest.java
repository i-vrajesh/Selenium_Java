package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.function.Function;

@Test
public class LoginTest {
    WebDriver driver;

    @FindBy(id="username")
    WebElement username;
    public void loginTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        Select dropdown = new Select(driver.findElement(By.id("")));
        dropdown.selectByVisibleText("Option 1");
        dropdown.selectByIndex(2);
        dropdown.selectByValue("Value3");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id(""))).click().perform();
        driver.findElement(By.id("")).getCssValue("background-color");

        WebElement element = driver.findElement(By.id(""));
        File screenshot1 = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot1,new File("path"));

        File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot2,new File("path"));

        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.getText();
        alert.dismiss();
        driver.manage().deleteAllCookies();





        }

}
