package utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CucumberHomePage;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory
{

    public static RemoteWebDriver driver;
    DesiredCapabilities capabilities;

    @Before
    public void setUp() throws MalformedURLException
    {
        capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("browserName", "firefox");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
    }

    @After
    public void tearDown()
    {
        driver.close();
    }

}
