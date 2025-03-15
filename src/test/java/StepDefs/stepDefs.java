package StepDefs;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class stepDefs {

    @Test
    @Given("user will open browser")
    public void userWillOpenBrowser() {
    }
    @Test
    @And("user will enter Amazon url")
    public void userWillEnterAmazonUrl() {
    }
    @Test
    @Then("user enters {string} and {string} to login")
    public void userEntersAndToLogin(String username, String password) {
    }
    @Test
    @And("user clicks continue button")
    public void userClicksContinueButton() {
    }
    @Test
    @Then("user lands in home page")
    public void userLandsInHomePage() {
    }
}
