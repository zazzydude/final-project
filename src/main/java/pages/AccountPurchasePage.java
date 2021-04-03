package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPurchasePage {
	
	public AccountPurchasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//a[./img[@class='replace-2x'] and @title='Casual Dresses']")
	WebElement casualDresses ;

	@FindBy(xpath="(.//a[@title='Evening Dresses'])[3]")
	WebElement eveningDresses ;

	@FindBy(xpath=".//a[./img[@class='replace-2x'] and @title='Summer Dresses']")
	WebElement summerDresses ;
	
	@FindBy(xpath="//*[@id=\"old_passwd\"]")
	WebElement currentPassword;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement newPassword;
	
	@FindBy(xpath="//*[@id=\"confirmation\"]")
	WebElement confirmationPassword;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
	WebElement personalInfoB;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button")
	WebElement saveButton;

	/**
	 * Clicks the personal info button when Signing In 
	 */
	public void personalInfoB () {
		this.personalInfoB.click();
	}
	
	/**
	 * Clicks the Current Password text box
	 */
	public void currentPassword(String name) {
		this.currentPassword.sendKeys(name);
	}
	
	/**
	 * Clicks the New Password text box
	 */
	public void newPassword(String name) {
		this.newPassword.sendKeys(name);
	}
	
	/**
	 * Clicks the Confirmation Password text box
	 */
	public void confirmationPassword(String name) {
		this.confirmationPassword.sendKeys(name);
	}
	
	/**
	 * Clicks the save button in Your Personal Information page
	 */
	public void saveButton() {
		this.saveButton.click();
	}
}
