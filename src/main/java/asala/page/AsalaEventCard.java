package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaEventCard extends AsalaPageBase {

	public AsalaEventCard(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id = "")
	WebElement clickEventCardBt;
	
	@AndroidFindBy(id = "")
	WebElement clickEventCardFavoritBt;
	
	public void clickOfferCard() {
		clickBt(clickEventCardBt);
	}
	
	public void clickStoreCardFavorit() {
		clickBt(clickEventCardFavoritBt);
	}

}
