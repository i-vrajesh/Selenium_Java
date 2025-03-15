package TestRunner;
import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Amazon", features={"src/test/resources/Features"},
glue = {"src/StepDefs.stepDefs"},
plugin={"pretty","html:target/htmlreport.html"})
public class CommonRunnerTest extends AbstractTestNGCucumberTests{

}
