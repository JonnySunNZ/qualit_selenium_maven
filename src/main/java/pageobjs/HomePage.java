package pageobjs;

import org.openqa.selenium.WebDriver;

import common.BasePage;

public class HomePage extends BasePage {
	private String searchButtonLoc = "/html/body/div[1]/div/a[2]";
	private String inputFieldLoc = "/html/body/div[1]/div/div[2]/form/fieldset/div/div/input";
	private String goBtn = "/html/body/div[1]/div/div[2]/form/fieldset/input";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickSearchBtn() {
		findByXPath(searchButtonLoc).click();
	}
	
	public void inputSearchContent() {
		findByXPath(inputFieldLoc).sendKeys("Meet our team");
	}
	
	public void clickGoBtn() {
		findByXPath(goBtn).click();
	}
	
}
