package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	
	public CreateAccountPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='header_logo']/a")
	WebElement homeButton;
	
	@FindBy(id="id_gender1")
	WebElement mrRadio;
	
	@FindBy(id="id_gender2")
	WebElement mrsRadio;
	
	@FindBy(id="customer_firstname")
	WebElement firstNameTextBox;
	
	@FindBy(id="customer_lastname")
	WebElement lastNameTextBox;
	
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="passwd")
	WebElement passwordTextBox;
	
	@FindBy(id="days")
	WebElement dayDropdown;
	
	@FindBy(id="months")
	WebElement monthDropdown;
	
	@FindBy(id="years")
	WebElement yearDropdown;
	
	@FindBy(id="newsletter")
	WebElement signUpForNewsletterCheckBox;
	
	@FindBy(id="optin")
	WebElement receiveSpecialCheckBox;
	
	@FindBy(id="firstname")
	WebElement addressFirstNameTextBox;
	
	@FindBy(id="lastname")
	WebElement addressLastNameTextBox;
	
	@FindBy(id="company")
	WebElement companyTextBox;
	
	@FindBy(id="address1") 
	WebElement addressTextBox;
	
	@FindBy(id="address2")
	WebElement address2TextBox;
	
	@FindBy(id="city")
	WebElement cityTextBox;

	@FindBy(id="id_state")
	WebElement stateDropdown;

	@FindBy(id="postcode")
	WebElement zipCodeTextBox;

	@FindBy(name="id_country")
	WebElement countryDropdown;

	@FindBy(id="other")
	WebElement additionalInfoTextBox;
	
	@FindBy(id="phone")
	WebElement homePhoneTextBox;

	@FindBy(id="phone_mobile")
	WebElement mobilePhoneTextBox;
	
	@FindBy(id="alias")
	WebElement addressAliasTextBox;
	
	@FindBy(id="submitAccount")
	WebElement registerButton;
	
	public void goHomeButton () {
		this.homeButton.click();
	}
	
	public void clickMrRadioButton () {
		this.mrRadio.click();
	}
	
	public void clickMrsRadioButton () {
		this.mrsRadio.click();
	}
	
	public void sendFirstNameTextBox (String name) {
		this.firstNameTextBox.sendKeys(name);
	}
	
	public void sendLastNameTextBox (String lastName) {
		this.lastNameTextBox.sendKeys(lastName);
	}
	
	public void sendEmailTextBox (String mail) {
		this.emailTextBox.sendKeys(mail);
	}

	public void sendPasswordTextBox (String password) {
		this.passwordTextBox.sendKeys(password);
	}
	
	public void clickDaysDropdown () {
		this.dayDropdown.click();
	}
	
	public void clickMonthsDropdown () {
		this.monthDropdown.click();
	}
	
	public void clickYearsDropdown () {
		this.yearDropdown.click();
	}
	
	public void clickNewsLetterCheckBox () {
		this.signUpForNewsletterCheckBox.click();
	}
	
	public void clickReciveSpecialCheckBox () {
		this.receiveSpecialCheckBox.click();
	}
	
	public void sendAddressFirstNameTextBox (String addressName) {
		this.addressFirstNameTextBox.sendKeys(addressName);
	}
	
	public void sendAddressLastNameTextBox (String addressLastName) {
		this.addressLastNameTextBox.sendKeys(addressLastName);
	}
	
	public void sendCompanyTextBox (String company) {
		this.companyTextBox.sendKeys(company);
	}
	
	public void sendAddressTextBox1 (String address1) {
		this.addressTextBox.sendKeys(address1);
	}
	
	public void sendAddressTextBox2 (String address2) {
		this.address2TextBox.sendKeys(address2);
	}
	
	public void sendCitiesTextBox (String city) {
		this.cityTextBox.sendKeys(city);
	}
	
	public void clickStatesDropdown () {
		this.stateDropdown.click();
	}
	
	public void sendZipTextBox (String zipCode) {
		this.zipCodeTextBox.sendKeys(zipCode);
	}

	public void clickCtryDropdown () {
		this.countryDropdown.click();
	}

	public void sendAddInfo (String additional) {
		this.additionalInfoTextBox.sendKeys(additional);
	}

	public void sendHomePhoneTextBox (String phonenumber) {
		this.homePhoneTextBox.sendKeys(phonenumber);
	}

	public void sendMobileTextBox (String mobilenumber) {
		this.homePhoneTextBox.sendKeys(mobilenumber);
	}

	public void sendAddressAliasTextBox (String addressAlias) {
		this.addressAliasTextBox.sendKeys(addressAlias);
	}

	public void clickRegisButton () {
		this.registerButton.click();
	}
	public void selectDayDropDown(int option)  {
		Select stateSelect = new Select(dayDropdown);
		stateSelect.selectByIndex(option);
		
	}
	
	public void selectMonthDropDown(int option)  {
		Select stateSelect = new Select(monthDropdown);
		stateSelect.selectByIndex(option);
		
	}
	
	public void selectYearsDropdown (String value) {
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByValue(value);
	}
	
	public void selectStateDropDown(int option)  {
		Select stateSelect = new Select(stateDropdown);
		stateSelect.selectByIndex(option);
		
	}
	
	public void selectCountryDropDown(int option)  {
		Select stateSelect = new Select(countryDropdown);
		stateSelect.selectByIndex(option);
		
	}
}