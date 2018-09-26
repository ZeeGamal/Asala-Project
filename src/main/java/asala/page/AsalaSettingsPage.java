package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaSettingsPage extends AsalaPageBase {

	public AsalaSettingsPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// all elements 
	@AndroidFindBy(id = "")
	public WebElement aboutBt;

	@AndroidFindBy(id = "")
	public WebElement socialNetworkBt;

	@AndroidFindBy(id = "")
	public WebElement conectUsBt;
	
	@AndroidFindBy(id = "")
	public WebElement answerSurveyBt;

	public void clickAbout () {
		clickBt(aboutBt);
	}

	public void clickSocialNetwork () {
		clickBt(socialNetworkBt);
	}

	public void clickConectUs () {
		clickBt(conectUsBt);
	}
	
	public void clickAnswerSurvey () {
		clickBt(answerSurveyBt);
	}

}
