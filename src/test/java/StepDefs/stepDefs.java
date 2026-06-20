package StepDefs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class stepDefs {
    WebDriver driver = new ChromeDriver();

    @BeforeAll
    @Given("user will open browser")
    public void userWillOpenBrowser() {
        driver.manage().window().maximize();
    }
    @Test
    @And("user will enter Amazon url")
    public void userWillEnterAmazonUrl() {
        driver.get("https://www.amazon.in/");

    }

    @Then("user enters {string} and {string} to login")
    public void userEntersAndToLogin(String username, String password) {
    }

    @And("user clicks continue button")
    public void userClicksContinueButton() {
    }

    @Then("user lands in home page")
    public void userLandsInHomePage() {
    }

    @AfterAll
    @And("terminate browser")
    public void terminateBrowser() {
        if(driver==null){
            driver.quit();
        }else{
            System.out.println();
        }
    }
}
