package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaOfferDetailsPage extends AsalaPageBase {

	public AsalaOfferDetailsPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//  offer details element
	@AndroidFindBy(id = "")
	WebElement likeBt;

	@AndroidFindBy(id = "")
	WebElement contactBt;

	@AndroidFindBy(id = "")
	WebElement directionBt;

	// user add this offer to favorite
	public void clickLike() {
		clickBt(likeBt);
	}

	// click to display contact info 
	public void clickContac() {
		clickBt(contactBt);
	}

	// to make direction & take user to map 
	public void clickDirection() {
		clickBt(directionBt);
	}

}
