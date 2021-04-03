package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {

	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	 */
	public void enterFirstName(String name) {
		this.firstNameTextBox.clear();
		this.firstNameTextBox.sendKeys(name);
	}
	
	/**
	 * Write a text on the last name text box
	 * @param lastName - text to write
	 */
	public void enterLastName(String lastName) {
		this.lastNameTextBox.clear();
		this.lastNameTextBox.sendKeys(lastName);
	}
	
	/**
	 * Write a text on the company text box
	 * @param company -text to write
	 */
	public void enterCompany(String company) {
		this.companyTextBox.clear();
		this.companyTextBox.sendKeys(company);
	}
	
	/**
	 * Write a text on the address text box
	 * @param address -text to write
	 */
	public void enterAddress(String address) {
		this.address1TextBox.clear();
		this.address1TextBox.sendKeys(address);
	}
	
	/**
	 * Write a text on the address (line2) text box
	 * @param address2 -text to write
	 * @throws InterruptedException
	 */
	public void enterAddressLine2(String address2) {
		this.address2TextBox.clear();
		this.address2TextBox.sendKeys(address2);
	}
	
	/**
	 * Write a text on the city text box
	 * @param city - text to write
	 */
	public void enterCity(String city) {
		this.cityTextBox.clear();
		this.cityTextBox.sendKeys(city);
	}
	
	/**
	 * Select an option in the state drop-down by the order index
	 * @param option -number of index
	 */
	public void selectState(int option) {
		Select stateSelect = new Select(this.idStateSelect);
		stateSelect.selectByIndex(option);
	}
	
	/**
	 * Select a option in the state drop-down by the showed value
	 * @param option -text of the value
	 */
	public void selectState(String option) {
		Select stateSelect = new Select(this.idStateSelect);
		stateSelect.selectByVisibleText(option);
	}
	
	/**
	 * Write a text on the ZIP/Postal code text box
	 * @param postCode -text to write
	 */
	public void enterPostalCode(String postCode) {
		this.postCodeTextBox.clear();
		this.postCodeTextBox.sendKeys(postCode);
	}
	
	/**
	 * Select an option in the country drop-down by the order index
	 * @param option -number of index
	 */
	public void selectCountry(int option) {
		Select countrySelect = new Select(this.idCountrySelect);
		countrySelect.selectByIndex(option);
	}
	
	/**
	 * Select a option in the country drop-down by the showed value
	 * @param option -text of the value
	 */
	public void selectCountry(String option) {
		Select countrySelect = new Select(this.idCountrySelect);
		countrySelect.selectByVisibleText(option);
	}
	
	/**
	 * Write a text on the home phone text box
	 * @param phone -text to write
	 */
	public void enterHomePhone(String phone) {
		this.phoneTextBox.clear();
		this.phoneTextBox.sendKeys(phone);
	}
	
	/**
	 * Write a text on the mobile phone text box
	 * @param phone -text to write
	 */
	public void enterMobilePhone(String phone) {
		this.phoneMobileTextBox.clear();
		this.phoneMobileTextBox.sendKeys(phone);
	}
	
	/**
	 * Write a text on the Additional information text box
	 * @param info -text to write
	 */
	public void enterAdditionalInformation(String info) {
		this.otherTextBox.clear();
		this.otherTextBox.sendKeys(info);
	}
	
	/**
	 * Write a text on the Address Title text box
	 * @param title -text to write
	 */
	public void enterAddressTitle(String title) {
		this.aliasTextBox.clear();
		this.aliasTextBox.sendKeys(title);
	}
	
	/**
	 * Click the Save button
	 */
	public void clickSaveButton() {
		this.submitAddressButton.click();
	}
}
