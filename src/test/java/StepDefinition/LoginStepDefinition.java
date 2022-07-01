package StepDefinition;

import Pages.LoginPage;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import util.ConfigReader;
import util.DriverConfiguration;
import util.SeleniumLibrary;

public class LoginStepDefinition extends DriverConfiguration {

    ConfigReader configReader = new ConfigReader();
    SeleniumLibrary seleniumLibrary = new SeleniumLibrary(driver);
    LoginPage loginPage = new LoginPage();
    @Given("^User is on the application$")
    public void userIsOnTheApplication() {
        driver.get(configReader.properties.getProperty("baseURL"));
        Assert.assertTrue(loginPage.isHomePageOpen());
    }



}
