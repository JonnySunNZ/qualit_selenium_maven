package stepdefinitions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjs.HomePage;
import pageobjs.ResultPage;
import utilities.BrowserDriver;

public class QualitSmokeStepDefinition {
	HomePage hPage;
	ResultPage rPage;

	@Before
	public void setupBrowser(Scenario scenario) {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

		// set the driver based on property above
		BrowserDriver.setDriver(new ChromeDriver());

		Dimension d = new Dimension(1382, 744);
		// Resize the current window to the given dimension
		BrowserDriver.getDriver().manage().window().setSize(d);

//		BrowserDriver.getDriver().manage().window().maximize();
		BrowserDriver.getDriver().get("http://www.qualit.co.nz");

//		// try using geckodriver
//		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//		BrowserDriver.setDriver(new FirefoxDriver());
//		BrowserDriver.getDriver().manage().window().maximize();
//		BrowserDriver.getDriver().get("http://www.qualit.co.nz");
	}

	@After
	public void tearDown() {
		BrowserDriver.getDriver().quit();
	}

	@Given("I am in the qualit home page")
	public void i_am_in_the_qualit_home_page() throws InterruptedException {

	}

	@And("I input search content")
	public void i_input_search_content() {
		hPage = new HomePage(BrowserDriver.getDriver());

		hPage.clickSearchBtn();
		hPage.inputSearchContent();
		hPage.clickGoBtn();
	}

	@Then("I should see search result")
	public void verify() throws InterruptedException {
		rPage = new ResultPage(BrowserDriver.getDriver());

		Assert.assertEquals(rPage.verifySearchResult(), true);

		Thread.sleep(2000);
	}

	@And("I click contact us link")
	public void i_click_contact_us_link() {
		hPage = new HomePage(BrowserDriver.getDriver());

		hPage.clickCUBtn();
	}

	@Then("I should see contact us page")
	public void i_should_see_contact_us_page() throws InterruptedException {
		Thread.sleep(3000);
	}

}
