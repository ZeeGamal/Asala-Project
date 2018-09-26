package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaFilterScreenPage extends AsalaPageBase {

	public AsalaFilterScreenPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// filter screen elements 
	@AndroidFindBy(id = "")
	WebElement cancelBt;

	@AndroidFindBy(id = "")
	WebElement resetBt;

	@AndroidFindBy(id = "")
	WebElement alphabetBt;

	@AndroidFindBy(id = "")
	WebElement latestBt;

	@AndroidFindBy(id = "")
	WebElement ratingBt;

	@AndroidFindBy(id = "")
	WebElement brandsBt;

	@AndroidFindBy(id = "")
	WebElement accessoriesBt;

	@AndroidFindBy(id = "")
	WebElement fashionBt;


	@AndroidFindBy(id = "")
	WebElement applyBt;


	@AndroidFindBy(id = "")
	WebElement mapBt;

	// cancel & reset action
	public void clickCancel () {
		clickBt(cancelBt);
	}

	public void clickReset () {
		clickBt(resetBt);
	}

	// sort Classes
	public void clickAlphabet () {
		clickBt(alphabetBt);
	}

	public void clickLatest () {
		clickBt(latestBt);
	}

	public void clickRating () {
		clickBt(ratingBt);
	}

	// store filter by 
	public void clickBrand () {
		clickBt(brandsBt);
	}

	public void clickAccessories () {
		clickBt(accessoriesBt);
	}

	public void clickFashion () {
		clickBt(fashionBt);
	}

	// apply action
	public void clickApply () {
		clickBt(applyBt);
	}


}
