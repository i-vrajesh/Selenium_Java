package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class TestNG_Parameters {
    WebDriver driver;
    @Parameters({"browsername","url"})
    @Test
    public void parameters(@Optional("chrome") String browsername,String url){
        if(browsername.toLowerCase().equals("chrome")){
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
        }
        if(browsername.toLowerCase().equals("edge")){
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get(url);
        }
    }

    @AfterSuite
    public void teardown(){
        driver.quit();

    }

}
