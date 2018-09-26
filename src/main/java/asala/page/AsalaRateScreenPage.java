package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaRateScreenPage extends AsalaPageBase {

	public AsalaRateScreenPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// rate popup elements
	@AndroidFindBy(id = "")
	WebElement rateOneBt;

	@AndroidFindBy(id = "")
	WebElement rateTwoBt;

	@AndroidFindBy(id = "")
	WebElement rateThreeBt;

	@AndroidFindBy(id = "")
	WebElement rateFourBt;

	@AndroidFindBy(id = "")
	WebElement rateFiveBt;

	@AndroidFindBy(id = "")
	WebElement writeCommentTxt;

	@AndroidFindBy(id = "")
	WebElement submitBt;
	
	// to chose one star
	public void clickRateOne() {
		clickBt(rateOneBt);
	}
	
	// to chose two star
	public void clickRateTwo() {
		clickBt(rateTwoBt);
	}
	
	// to chose three star
	public void clickRatethree() {
		clickBt(rateThreeBt);
	}
	
	// to chose four star
	public void clickRateFour() {
		clickBt(rateFourBt);
	}
	
	// to chose five star
	public void clickRateFive() {
		clickBt(rateFiveBt);
	}
	
	// to write comment in text
	public void writecomment(String comment) {
		setTxtElment(writeCommentTxt, comment);
	}
	
	// to submit this rating 
	public void clickToSubmit() {
		clickBt(submitBt);
	}
	

}
