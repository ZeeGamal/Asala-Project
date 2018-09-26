package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaPointHistoryPage extends AsalaPageBase {

	public AsalaPointHistoryPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id = "")
	public WebElement backBt;
	
	@AndroidFindBy(id = "")
	WebElement earningTabBt;

	@AndroidFindBy(id = "")
	WebElement redeemTabBt;
	
	public void clickEarning () {
		clickBt(earningTabBt);
	}
	
	public void clickRedeem () {
		clickBt(earningTabBt);
	}
	
	public void clickBack () {
		clickBt(backBt);
	}

}
