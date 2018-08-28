package pageobjs;

import org.openqa.selenium.WebDriver;

import common.BasePage;

public class HomePage extends BasePage {
	private String searchButtonLoc = "#search";
	private String inputFieldLoc = "#SearchForm_SearchForm_Search";
	private String goBtn = "#SearchForm_SearchForm_action_results";
	private String cuBtn = "/html/body/div[1]/div/div[1]/ul/li[5]/a/span";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickSearchBtn() {
		findByCss(searchButtonLoc).click();
	}
	
	public void inputSearchContent() {
		findByCss(inputFieldLoc).sendKeys("Meet our team");
	}
	
	public void clickGoBtn() {
		findByCss(goBtn).click();
	}
	
	public void clickCUBtn() {
		findByXPath(cuBtn).click();
	}
	
}
