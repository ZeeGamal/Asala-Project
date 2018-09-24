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
	WebElement oneBt;
	
	@AndroidFindBy(id = "")
	WebElement twoBt;
	
	@AndroidFindBy(id = "")
	WebElement threeBt;
	
	@AndroidFindBy(id = "")
	WebElement fourBt;
	
	@AndroidFindBy(id = "")
	WebElement fiveBt;
	
	@AndroidFindBy(id = "")
	WebElement sexBt;
	
	@AndroidFindBy(id = "")
	WebElement sevenBt;
	
	@AndroidFindBy(id = "")
	WebElement eightBt;
	
	@AndroidFindBy(id = "")
	WebElement nineBt;
	
	@AndroidFindBy(id = "")
	WebElement tenBt;
	
	@AndroidFindBy(id = "")
	WebElement zeroBt;
	
	@AndroidFindBy(id = "")
	WebElement clearBt;
	
	@AndroidFindBy(id = "")
	WebElement resendCodeBt;
	
	public void addcode (String first , String seconde , String third , String forth) {
		
		setTxtElment(firsttxt, first);
		setTxtElment(secondetxt, seconde);
		setTxtElment(thirdTxt, third);
		setTxtElment(forthTxt, forth);
		
	}
	
	public void clickResendCode() {
		
		clickBt(resendCodeBt);
	}
	
	public void oneBtt () {

		clickBt(oneBt);
	}
	
	public void twoBtt () {

		clickBt(twoBt);
	}
	public void threeBtt () {

		clickBt(threeBt);
	}
	public void fourBtt () {

		clickBt(fourBt);
	}
	public void fiveBtt () {

		clickBt(fiveBt);
	}
	public void sexBtt () {

		clickBt(sexBt);
	}
	public void sevenBtt () {

		clickBt(sevenBt);
	}
	
	public void eigthBtt () {

		clickBt(eightBt);
	}
	
	public void nineBt () {

		clickBt(nineBt);
	}
	
	public void tenBtt () {

		clickBt(tenBt);
	}
	
	public void zeroBtt () {

		clickBt(zeroBt);
	}
	
	public void clearBtt () {

		clickBt(clearBt);
	}
	
	public void clickExitBt () {

		clickBt(exitBt);
	}

}
