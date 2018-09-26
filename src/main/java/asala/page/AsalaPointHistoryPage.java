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
	WebElement earningBt;

	@AndroidFindBy(id = "")
	WebElement redeemBt;
	
	public void clickEarning () {
		clickBt(earningBt);
	}
	
	public void clickRedeem () {
		clickBt(redeemBt);
	}

}
