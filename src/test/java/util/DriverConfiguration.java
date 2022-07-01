package util;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfiguration {
    private ConfigReader configReader;
    public static WebDriver driver;

    public DriverConfiguration(){
        configReader = new ConfigReader();
        this.driver = getDriver();
    }
    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver",configReader.properties.getProperty("driverPath"));
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver= new ChromeDriver(chromeOptions);
        return driver;
    }

}
