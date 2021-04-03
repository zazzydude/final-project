package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {
	
	public AddressesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//a[@href='http://automationpractice.com/index.php?controller=address']")
	WebElement addNewAddressButton;
	
	/**
	 * Click on the Add New Address button
	 */
	public void clickAddNewAddressButton() {
		this.addNewAddressButton.click();
	}
}
