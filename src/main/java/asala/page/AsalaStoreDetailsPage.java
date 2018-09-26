package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaStoreDetailsPage extends AsalaPageBase{

	public AsalaStoreDetailsPage(AppiumDriver<WebElement> driver) {
		super(driver);
	}

	// store details element 
	@AndroidFindBy(id = "")
	WebElement checkInBt;

	@AndroidFindBy(id = "")
	WebElement likeBt;

	@AndroidFindBy(id = "")
	WebElement contactBt;

	@AndroidFindBy(id = "")
	WebElement emailBt;

	@AndroidFindBy(id = "")
	WebElement phoneBt;

	@AndroidFindBy(id = "")
	WebElement directionBt;

	@AndroidFindBy(id = "")
	WebElement rateBt;

	@AndroidFindBy(id = "")
	WebElement shopReviewSeeAllBt;


	@AndroidFindBy(id = "")
	WebElement activeOfferSeeAllBt;


	@AndroidFindBy(id = "")
	WebElement similarStoreSeeAllBt;
	
	// user make check in 
	public void clickCheckIn() {
		clickBt(checkInBt);
	}
	
	// user add this store to favorite
	public void clickLike() {
		clickBt(likeBt);
	}
	
	// click to display contact info 
	public void clickContac() {
		clickBt(contactBt);
	}
	
	// store email
	public void clickEmail() {
		clickBt(emailBt);
	}
	
	// store phone
	public void clickPhone() {
		clickBt(phoneBt);
	}
	
	// to make direction & take user to map 
	public void clickDirection() {
		clickBt(directionBt);
	}
	
	// to take user to rate screen
	public void clickRate() {
		clickBt(rateBt);
	}
	
	// to see all review about this store
	public void clickShopReviewSeeAll() {
		clickBt(shopReviewSeeAllBt);
	}
	
	// to see all active store
	public void clickActiveofferSeeAll() {
		clickBt(activeOfferSeeAllBt);
	}
	
	// to see all similar store
	public void clickSimilarStoreSeeAll() {
		clickBt(similarStoreSeeAllBt);
	}
}
