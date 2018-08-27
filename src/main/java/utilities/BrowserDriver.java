package utilities;

import org.openqa.selenium.WebDriver;

public class BrowserDriver {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return BrowserDriver.driver;
	}
	
	public static void setDriver(WebDriver driver) {
		BrowserDriver.driver = driver;
	}

}
