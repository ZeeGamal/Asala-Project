package asala.mobile.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaAuthCodePage extends AsalaPageBase {

	public AsalaAuthCodePage(AppiumDriver<WebElement> driver) {
		super(driver);
	}

	
	@AndroidFindBy(id = "")
	WebElement exitBt;
	
	@AndroidFindBy(id = "")
	WebElement firsttxt;
	
	@AndroidFindBy(id = "")
	WebElement secondetxt;
	
	@AndroidFindBy(id = "")
	WebElement thirdTxt;
	
	@AndroidFindBy(id = "")
	WebElement forthTxt;
	
	@AndroidFindBy(id = "")
	WebElement resendCodeBt;
	
	
}
