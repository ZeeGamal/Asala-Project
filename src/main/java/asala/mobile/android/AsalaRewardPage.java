package asala.mobile.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaRewardPage extends AsalaPageBase {

	public AsalaRewardPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// reward screen elements 
	@AndroidFindBy(id = "")
	WebElement learnHowItWorkBt;

	@AndroidFindBy(id = "")
	WebElement pointHistoryBt;

	@AndroidFindBy(id = "")
	WebElement storesToRedeemFromBt;

	public void clickPointHistory () {

		clickBt(pointHistoryBt);
	}

	public void clickStoresToRedeemFrom () {

		clickBt(storesToRedeemFromBt);
	}
}
