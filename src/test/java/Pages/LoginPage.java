package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import util.DriverConfiguration;
import util.SeleniumLibrary;

public class LoginPage extends DriverConfiguration {

    SeleniumLibrary seleniumLibrary = new SeleniumLibrary(driver);

    By homePageTitle = By.cssSelector("[aria-label='Amazon']");

    public boolean isHomePageOpen() {
        try{seleniumLibrary.findElement(homePageTitle);
        return true;
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
            return false;
        }
    }


    dri
}
