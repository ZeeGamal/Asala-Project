package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaSettingsPage extends AsalaPageBase {

	public AsalaSettingsPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// all elements for setting page
	@AndroidFindBy(id = "")
	public WebElement aboutBt;

	@AndroidFindBy(id = "")
	public WebElement socialNetworkBt;

	@AndroidFindBy(id = "")
	public WebElement conectUsBt;
	
	@AndroidFindBy(id = "")
	public WebElement answerSurveyBt;
	
	@AndroidFindBy(id = "")
	public WebElement termsConditionBt;
	
	@AndroidFindBy(id = "")
	public WebElement languageBt;
	
	@AndroidFindBy(id = "")
	public WebElement logoutBt;

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
	
	public void clickTermesCondition () {
		clickBt(termsConditionBt);
	}
	
	public void clickLanguage () {
		clickBt(languageBt);
	}
	
	public void clickLogout () {
		clickBt(logoutBt);
	}

}
