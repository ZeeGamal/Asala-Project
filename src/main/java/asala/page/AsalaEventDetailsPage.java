package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaEventDetailsPage extends AsalaPageBase {

	public AsalaEventDetailsPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// event details element 

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

	
	// check in some event
	public void clickCheckIn() {
		clickBt(checkInBt);
	}

	// user add this event to favorite
	public void clickLike() {
		clickBt(likeBt);
	}

	// click to display contact info 
	public void clickContac() {
		clickBt(contactBt);
	}

	// event email
	public void clickEmail() {
		clickBt(emailBt);
	}

	// event phone
	public void clickPhone() {
		clickBt(phoneBt);
	}

	// to make direction & take user to map 
	public void clickDirection() {
		clickBt(directionBt);
	}

}
