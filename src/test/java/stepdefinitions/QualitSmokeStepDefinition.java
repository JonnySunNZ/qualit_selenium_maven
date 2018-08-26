package stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
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
		//		System.out.println("\"" + System.getProperty("timestamp") + "\"");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

		// set the driver based on property above
		BrowserDriver.setDriver(new ChromeDriver());
		BrowserDriver.getDriver().manage().window().maximize();
		BrowserDriver.getDriver().get("http://www.qualit.co.nz");
	}

	@After
	public void tearDown() {
		BrowserDriver.getDriver().quit();
	}

	@Given("I am in the qualit home page")
	public void i_am_in_the_qualit_home_page() {
		hPage = new HomePage(BrowserDriver.getDriver());
	}

	@Given("I input search content")
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

}
