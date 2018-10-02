package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaOfferCard extends AsalaPageBase {

	public AsalaOfferCard(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id = "")
	WebElement clickOfferCardBt;
	
	@AndroidFindBy(id = "")
	WebElement clickOfferCardFavoritBt;
	
	public void clickOfferCard() {
		clickBt(clickOfferCardBt);
	}
	
	public void clickStoreCardFavorit() {
		clickBt(clickOfferCardFavoritBt);
	}

}
