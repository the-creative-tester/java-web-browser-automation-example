package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.net.URL;
import pages.CucumberHomePage;
import utils.DriverFactory;
import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.assertTrue;

public class CucumberSteps
{

    RemoteWebDriver driver = DriverFactory.driver;
    CucumberHomePage cucumberHomePage = PageFactory.initElements(driver, CucumberHomePage.class);

    @Given("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to(String page) throws Throwable {
        driver.get(page);
    }

    @When("^I take a look at the Docs$")
    public void i_take_a_look_at_the_docs() throws Throwable {
        // WebElement element = driver.findElement(By.linkText("Docs"));
        // element.click();
        cucumberHomePage.clickDocsLink();
    }

    @Then("^I see a browser title containing \"([^\"]*)\"$")
    public void i_see_a_browser_title_containing(String text) throws Throwable {
        assertTrue(driver.getTitle().contains(text));
    }

}