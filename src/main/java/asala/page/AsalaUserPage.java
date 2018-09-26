package asala.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AsalaUserPage extends AsalaPageBase {

	public AsalaUserPage(AppiumDriver<WebElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "")
	public WebElement editBt;

	@AndroidFindBy(id = "")
	public WebElement checkInBt;

	@AndroidFindBy(id = "")
	public WebElement favoritBt;

	public void clickEdit () {
		clickBt(editBt);
	}

	public void clickCheckIn () {
		clickBt(checkInBt);
	}

	public void clickFavorit () {
		clickBt(favoritBt);
	}

}
