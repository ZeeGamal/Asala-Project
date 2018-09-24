package asala.mobile.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaLoginPage extends AsalaPageBase {

	public AsalaLoginPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	// login elements 
	@AndroidFindBy(id = "")
	WebElement exitBt;

	@AndroidFindBy(id = "")
	WebElement loginTxt;

	@AndroidFindBy(id = "")
	WebElement phonetxt;

	@AndroidFindBy(id = "")
	WebElement loginBt;

	@AndroidFindBy(id = "")
	WebElement skipBt;

	public void clickExitBt () {

		clickBt(exitBt);
	}

	// to make login 
	public void login(String phone) {

		setTxtElment(phonetxt, phone);
		clickBt(loginBt);
	}
	
	// to skip login 
	public void clickSkip () {
		
		clickBt(skipBt);
		
	}

}
