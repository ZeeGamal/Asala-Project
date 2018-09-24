package asala.mobile.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaProfilePageForFirstTime extends AsalaPageBase {

	public AsalaProfilePageForFirstTime(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id = "")
	WebElement backBt;
	
	@AndroidFindBy(id = "")
	WebElement saveBt;
	
	@AndroidFindBy(id = "")
	WebElement photoBt;
	
	@AndroidFindBy(id = "")
	WebElement nameTxt;
	
	@AndroidFindBy(id = "")
	WebElement emailTxt;
	
	@AndroidFindBy(id = "")
	WebElement genderDrobDowenList;
	
	@AndroidFindBy(id = "")
	WebElement cityDrobDowenList;
	
	@AndroidFindBy(id = "")
	WebElement dateOfBirth;
	
	public void clickBack () {
		clickBt(backBt);
	}
	
	public void clickSave () {
		clickBt(saveBt);
	}
	
}
