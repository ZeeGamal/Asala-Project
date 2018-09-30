package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaStoreCard extends AsalaPageBase {

	public AsalaStoreCard(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id = "")
	WebElement clickStoreCardBt;
	
	@AndroidFindBy(id = "")
	WebElement clickStoreCardFavoritBt;
	
	
	
	public void clickStoreCard() {
		clickBt(clickStoreCardBt);
	}
	
	public void clickStoreCardFavorit() {
		clickBt(clickStoreCardFavoritBt);
	}

}
