package asala.mobile.android;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaMallDetalis extends AsalaPageBase {

	public AsalaMallDetalis(AppiumDriver<WebElement> driver) {
		super(driver);
	}
	
	// while user click in mall this element in this mall 
	@AndroidFindBy(id = "")
	WebElement searchTxt;
	
	@AndroidFindBy(id = "")
	WebElement filterBt;
	
	@AndroidFindBy(id = "")
	WebElement mallNameTxt;
	
	@AndroidFindBy(id = "")
	WebElement storeBt;
	
	@AndroidFindBy(id = "")
	WebElement offersBt;
	
	@AndroidFindBy(id = "")
	WebElement eventsBt;
	
	@AndroidFindBy(id = "")
	WebElement mapBt;
	
	// search text box for searching 
	public void searchInMallContent(String searchValue) {
		setTxtElment(searchTxt, searchValue);
	}
	// if user need to filter
	public void clickFilter () {
		clickBt(filterBt);
	}
	
	// to view list of store
	public void clickStoreTab () {
		clickBt(storeBt);
	}
	
	// to view list of events
	public void clickEventTab () {
		clickBt(eventsBt);
	}
	
	// to view list of offers
	public void clickOfferTab () {
		clickBt(offersBt);
	}
	
	// to add location on map
	public void clickMap () {
		clickBt(mapBt);
	}

}
