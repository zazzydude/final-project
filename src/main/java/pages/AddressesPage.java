package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPage {
	final WebDriver driver;
	final int SLEEP_TIME = 3500;
	
	public AddressesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath=".//a[@href='http://automationpractice.com/index.php?controller=address']")
	WebElement addNewAddressButton;
	
	/**
	 * Click on the Add New Address button
	 * @throws InterruptedException
	 */
	public void clickAddNewAddressButton() throws InterruptedException {
		this.addNewAddressButton.click();
		Thread.sleep(SLEEP_TIME);
	}
}
