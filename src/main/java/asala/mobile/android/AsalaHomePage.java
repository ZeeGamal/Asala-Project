package asala.mobile.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaHomePage extends AsalaPageBase {

	public AsalaHomePage(AppiumDriver<WebElement> driver) {
		super(driver);
	}

	// this element for navigation bar
	@AndroidFindBy(id = "")
	WebElement RewardsBt;

	@AndroidFindBy(id = "")
	WebElement userBt;

	@AndroidFindBy(id = "")
	WebElement settingBt;

	// this elements for mall card 
	@AndroidFindBy(id = "")
	WebElement MallBt;

	@AndroidFindBy(id = "")
	WebElement MallTwitterBt;

	@AndroidFindBy(id = "")
	WebElement MallInstgramBt;

	@AndroidFindBy(id = "")
	WebElement MallFacebookkBt;

	@AndroidFindBy(id = "")
	WebElement MallWebsiteBt;

	// to click reward 
	public void clickReward () {
		clickBt(RewardsBt);
	}

	// to click user profile
	public void clicUser () {
		clickBt(userBt);
	}

	// to click settings 
	public void clickSetting () {
		clickBt(settingBt);
	}

	// this function to click on mall 
	public void clickMall () {
		clickBt(MallBt);
	}

	public void clickTwitter () {
		clickBt(MallTwitterBt);
	}

	public void clickInstgram () {
		clickBt(MallInstgramBt);
	}

	public void clickFaceBook () {
		clickBt(MallFacebookkBt);
	}

	public void clickWebsite () {
		clickBt(MallWebsiteBt);
	}

}

