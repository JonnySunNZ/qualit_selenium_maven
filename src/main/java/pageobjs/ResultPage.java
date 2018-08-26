package pageobjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.BasePage;

public class ResultPage extends BasePage {
	private String resultField = "/html/body/div[2]/div/ul/li[1]/h3/a";

	public ResultPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifySearchResult() {

		boolean correctResultFound = false;
		WebElement searchContent = findByXPath(resultField);

		// check that the text of profileName
		// in fact contains the set full name
		if (searchContent.getText().contains("Meet our team")) {
			correctResultFound = true;
		}

		return correctResultFound;
	}

}
