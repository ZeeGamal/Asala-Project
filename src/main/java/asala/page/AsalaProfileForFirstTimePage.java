package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaProfileForFirstTimePage extends AsalaPageBase {

	public AsalaProfileForFirstTimePage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// profile page screen for first time 
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
	
	// back user to previous screen
	public void clickBack () {
		clickBt(backBt);
	}
	
	// click to save data
	public void clickSave () {
		clickBt(saveBt);
	}
	
	public void clickPhoto () {
		clickBt(photoBt);
	}
	
	
	
}
