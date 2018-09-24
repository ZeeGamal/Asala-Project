package asala.mobile.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaWelcomeScreenPage extends AsalaPageBase {

	public AsalaWelcomeScreenPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// welcome screen elements
	@AndroidFindBy(id = "")
	WebElement exitBt;

	@AndroidFindBy(id = "")
	WebElement getStartBt;
	

	// start button from welcome screen
	public void clickStartBt () {

		clickBt(getStartBt);
	}

	// click exit to skip screen 
	public void clickExitBt () {

		clickBt(exitBt);
	}
}
