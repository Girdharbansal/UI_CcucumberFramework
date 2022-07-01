package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runner.RunWith;
import util.DriverConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "target/test-classes/Features",
        glue = {"StepDefinition"}
)
class TestRunner {

    @AfterClass
    public static void tearDown(){
       DriverConfiguration.driver.quit();
    }
}
