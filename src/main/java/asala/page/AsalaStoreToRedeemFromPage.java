package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaStoreToRedeemFromPage extends AsalaPageBase {

	public AsalaStoreToRedeemFromPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id = "")
	public WebElement storePhotoBt;
	
	public void clickStorePhoto () {
		clickBt(storePhotoBt);
	}
	

}
