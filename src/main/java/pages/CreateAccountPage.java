package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	//final WebDriver driver;
	final int SLEEP_TIME = 1500;
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
	
	public void mrRadioButton () {
		this.mrRadio.click();
	}
	
	public void mrsRadioButton () {
		this.mrsRadio.click();
	}
	
	public void firstNameTextBox (String name) {
		this.firstNameTextBox.sendKeys(name);
	}
	
	public void lastNameTextBox (String lastName) {
		this.lastNameTextBox.sendKeys(lastName);
	}
	
	public void emailTextBox (String mail) {
		this.emailTextBox.sendKeys(mail);
	}

	public void passwordTextBox (String password) {
		this.passwordTextBox.sendKeys(password);
	}
	
	public void daysDropdown (int index) {
		Select daySelect = new Select(dayDropdown);
		daySelect.selectByIndex(index);
	}
	
	public void monthsDropdown (int index) {
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByIndex(index);
	}
	
	public void yearsDropdown (String value) {
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByValue(value);;
	}
	
	public void newsLetterCheckBox () {
		this.signUpForNewsletterCheckBox.click();
	}
	
	public void reciveSpecialCheckBox () {
		this.receiveSpecialCheckBox.click();
	}
	
	public void addressFirstNameTextBox (String addressName) {
		this.addressFirstNameTextBox.sendKeys(addressName);
	}
	
	public void addressLastNameTextBox (String addressLastName) {
		this.addressLastNameTextBox.sendKeys(addressLastName);
	}
	
	public void companyTextBox (String company) {
		this.companyTextBox.sendKeys(company);
	}
	
	public void addressTextBox1 (String address1) {
		this.addressTextBox.sendKeys(address1);
	}
	
	public void addressTextBox2 (String address2) {
		this.address2TextBox.sendKeys(address2);
	}
	
	public void citiesTextBox (String city) {
		this.cityTextBox.sendKeys(city);
	}
	
	public void statesDropdown (String value) {
		Select stateSelect = new Select(stateDropdown);
		//stateSelect.selectByValue(value);
		stateSelect.selectByVisibleText(value);
	}
	
	public void zipTextBox (String zipCode) {
		this.zipCodeTextBox.sendKeys(zipCode);
	}

	public void ctryDropdown () {
		this.countryDropdown.click();
	}

	public void addInfo (String additional) {
		this.additionalInfoTextBox.sendKeys(additional);
	}

	public void homePhoneTextBox (String phonenumber) {
		this.homePhoneTextBox.sendKeys(phonenumber);
	}

	public void mobileTextBox (String mobilenumber) {
		this.homePhoneTextBox.sendKeys(mobilenumber);
	}

	public void addressAliasTextBox (String addressAlias) {
		this.addressAliasTextBox.clear();
		this.addressAliasTextBox.sendKeys(addressAlias);
	}

	public void regisButton () {
		this.registerButton.click();
	}
}