package asala.mobile.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaWelcomeScreenPage extends AsalaPageBase {

	public AsalaWelcomeScreenPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "")
	WebElement exitBt;

	@AndroidFindBy(id = "")
	WebElement getStartBt;

	public void clickStartBt () {

		clickBt(getStartBt);
	}

	public void clickExitBt () {

		clickBt(exitBt);
	}
}
