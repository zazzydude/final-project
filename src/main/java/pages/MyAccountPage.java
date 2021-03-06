package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	public enum navBar {
		WOMEN,
		DRESSES,
		TSHIRT
	}
	
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
	WebElement orderHistoryDetails;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a")
	WebElement myWishLists;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a")
	WebElement myCreditSlips;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a")
	WebElement myAddresses;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
	WebElement myPersonalInformation;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/a")
	WebElement homeButton;
	
	
	
	
	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li")
	List<WebElement> NavBarOptions;
	
	
	
	// Switch CASE
	public WebElement getNavBarOptions(navBar options) {
	WebElement element;	
		switch(options) {
			case WOMEN:
				element = NavBarOptions.get(0);
				break;
			case DRESSES:
				element = NavBarOptions.get(1);
				break;
			case TSHIRT:
				element = NavBarOptions.get(2);
				break;
				
				default:
					element = null;
		}
		return element;
	}
	
	/**
	 * Click the Order History Details button
	 * @throws InterruptedException
	 */
	public void clickOrderHistoryDetails() {
		this.orderHistoryDetails.click();
	}
	
	
	/**
	 * Click My Wish Lists button
	 */
	public void clickmyWishLists() {
		this.myWishLists.click();
	}
	
	
	/**
	 * Click My Credit Slips button
	 */
	public void clickMyCreditSlips() {
		this.myCreditSlips.click();
	}
	
	
	/**
	 * Click My Addresses button

	 */
	public void clickMyAddresses() {
		this.myAddresses.click();
	}
	
	
	/**
	 * Click MyPersonalInformation button
	 * @throws InterruptedException
	 */
	public void clickMyPersonalInformation() {
		this.myPersonalInformation.click();
	}
}
