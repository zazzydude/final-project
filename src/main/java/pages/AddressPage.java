package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	final WebDriver driver;
	final int SLEEP_TIME = 1500;
	
	public AddressPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id="firstname")
	WebElement firstNameTextBox;
	
	@FindBy(id="lastname")
	WebElement lastNameTextBox;
	
	@FindBy(id="company")
	WebElement companyTextBox;
	
	@FindBy(id="address1")
	WebElement address1TextBox;
	
	@FindBy(id="address2")
	WebElement address2TextBox;
	
	@FindBy(id="city")
	WebElement cityTextBox;
	
	@FindBy(id="id_state")
	WebElement idStateSelect;
	
	@FindBy(id="postcode")
	WebElement postCodeTextBox;
	
	@FindBy(id="id_country")
	WebElement idCountrySelect;
	
	@FindBy(id="phone")
	WebElement phoneTextBox;
	
	@FindBy(id="phone_mobile")
	WebElement phoneMobileTextBox;
	
	@FindBy(id="other")
	WebElement otherTextBox;
	
	@FindBy(id="alias")
	WebElement aliasTextBox;
	
	@FindBy(id="submitAddress")
	WebElement submitAddressButton;
	
	/**
	 * Write a text on the first name text box
	 * @param name -text to write
	 * @throws InterruptedException
	 */
	public void enterFirstName(String name) throws InterruptedException {
		this.firstNameTextBox.clear();
		this.firstNameTextBox.sendKeys(name);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the last name text box
	 * @param lastName - text to write
	 * @throws InterruptedException
	 */
	public void enterLastName(String lastName) throws InterruptedException {
		this.lastNameTextBox.clear();
		this.lastNameTextBox.sendKeys(lastName);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the company text box
	 * @param company -text to write
	 * @throws InterruptedException
	 */
	public void enterCompany(String company) throws InterruptedException {
		this.companyTextBox.clear();
		this.companyTextBox.sendKeys(company);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the address text box
	 * @param address -text to write
	 * @throws InterruptedException
	 */
	public void enterAddress(String address) throws InterruptedException {
		this.address1TextBox.clear();
		this.address1TextBox.sendKeys(address);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the address (line2) text box
	 * @param address2 -text to write
	 * @throws InterruptedException
	 */
	public void enterAddressLine2(String address2) throws InterruptedException {
		this.address2TextBox.clear();
		this.address2TextBox.sendKeys(address2);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the city text box
	 * @param city - text to write
	 * @throws InterruptedException
	 */
	public void enterCity(String city) throws InterruptedException {
		this.cityTextBox.clear();
		this.cityTextBox.sendKeys(city);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Select an option in the state drop-down by the order index
	 * @param option -number of index
	 * @throws InterruptedException
	 */
	public void selectState(int option) throws InterruptedException {
		Select stateSelect = new Select(this.idStateSelect);
		stateSelect.selectByIndex(option);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Select a option in the state drop-down by the showed value
	 * @param option -text of the value
	 * @throws InterruptedException
	 */
	public void selectState(String option) throws InterruptedException {
		Select stateSelect = new Select(this.idStateSelect);
		stateSelect.selectByVisibleText(option);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the ZIP/Postal code text box
	 * @param postCode -text to write
	 * @throws InterruptedException
	 */
	public void enterPostalCode(String postCode) throws InterruptedException {
		this.postCodeTextBox.clear();
		this.postCodeTextBox.sendKeys(postCode);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Select an option in the country drop-down by the order index
	 * @param option -number of index
	 * @throws InterruptedException
	 */
	public void selectCountry(int option) throws InterruptedException {
		Select countrySelect = new Select(this.idCountrySelect);
		countrySelect.selectByIndex(option);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Select a option in the country drop-down by the showed value
	 * @param option -text of the value
	 * @throws InterruptedException
	 */
	public void selectCountry(String option) throws InterruptedException {
		Select countrySelect = new Select(this.idCountrySelect);
		countrySelect.selectByVisibleText(option);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the home phone text box
	 * @param phone -text to write
	 * @throws InterruptedException
	 */
	public void enterHomePhone(String phone) throws InterruptedException {
		this.phoneTextBox.clear();
		this.phoneTextBox.sendKeys(phone);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the mobile phone text box
	 * @param phone -text to write
	 * @throws InterruptedException
	 */
	public void enterMobilePhone(String phone) throws InterruptedException {
		this.phoneMobileTextBox.clear();
		this.phoneMobileTextBox.sendKeys(phone);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the Additional information text box
	 * @param info -text to write
	 * @throws InterruptedException
	 */
	public void enterAdditionalInformation(String info) throws InterruptedException {
		this.otherTextBox.clear();
		this.otherTextBox.sendKeys(info);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Write a text on the Address Title text box
	 * @param title -text to write
	 * @throws InterruptedException
	 */
	public void enterAddressTitle(String title) throws InterruptedException {
		this.aliasTextBox.clear();
		this.aliasTextBox.sendKeys(title);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Save button
	 * @throws InterruptedException
	 */
	public void clickSaveButton() throws InterruptedException {
		this.submitAddressButton.click();
		Thread.sleep(SLEEP_TIME);
	}
}
