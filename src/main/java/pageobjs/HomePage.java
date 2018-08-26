package pageobjs;

import org.openqa.selenium.WebDriver;

import common.BasePage;

public class HomePage extends BasePage {
	private String searchButtonLoc = "search";
	private String inputFieldLoc = "SearchForm_SearchForm_Search";
	private String goBtn = "SearchForm_SearchForm_action_results";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickSearchBtn() {
		findById(searchButtonLoc).click();
	}
	
	public void inputSearchContent() {
		findById(inputFieldLoc).sendKeys("Meet our team");
	}
	
	public void clickGoBtn() {
		findById(goBtn).click();
	}
	
}
