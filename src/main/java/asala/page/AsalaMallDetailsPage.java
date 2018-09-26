package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaMallDetailsPage extends AsalaPageBase {

	public AsalaMallDetailsPage(AppiumDriver<WebElement> driver) {
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
	WebElement storeTapBt;
	
	@AndroidFindBy(id = "")
	WebElement offersTapBt;
	
	@AndroidFindBy(id = "")
	WebElement eventsTapBt;
	
	@AndroidFindBy(id = "")
	WebElement mapTapBt;
	
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
		clickBt(storeTapBt);
	}
	
	// to view list of events
	public void clickEventTab () {
		clickBt(eventsTapBt);
	}
	
	// to view list of offers
	public void clickOfferTab () {
		clickBt(offersTapBt);
	}
	
	// to add location on map
	public void clickMap () {
		clickBt(mapTapBt);
	}

}
