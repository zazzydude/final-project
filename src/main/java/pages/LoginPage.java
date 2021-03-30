package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	final WebDriver driver;
	final int SLEEP_TIME = 1500;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="passwd")
	WebElement passwordTextBox;
	
	@FindBy(xpath=".//a[@href='http://automationpractice.com/index.php?controller=password']\r\n")
	WebElement forgotPasswordLink;
	
	@FindBy(id="SubmitLogin")
	WebElement submitButton;
	
	@FindBy(id="email_create")
	WebElement emailCreateTextBox;
	
	@FindBy(id="SubmitCreate")
	WebElement submitCreateButton;
	
	/**
	 * Send text to the input email of the login
	 * @param email -user email
	 * @throws InterruptedException
	 */
	public void enterUserEmail(String email) throws InterruptedException {
		this.emailTextBox.sendKeys(email);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Send text to the input user password of the login
	 * @param pass -user password
	 * @throws InterruptedException
	 */
	public void enterUserPassword(String pass) throws InterruptedException {
		this.passwordTextBox.sendKeys(pass);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the login submit button
	 * @throws InterruptedException
	 */
	public void clickSubmitButton() throws InterruptedException {
		this.submitButton.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Send a text to the input email to create a new account
	 * @param email -user email
	 * @throws InterruptedException
	 */
	public void enterRegisterEmail(String email) throws InterruptedException {
		this.emailCreateTextBox.sendKeys(email);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click on the create submit button to create a new account
	 * @throws InterruptedException
	 */
	public void clickSubmitCreateButton() throws InterruptedException {
		this.submitCreateButton.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click on the link to recover the user password
	 * @throws InterruptedException
	 */
	public void clickRecoverPasswordLink() throws InterruptedException {
		this.forgotPasswordLink.click();
		Thread.sleep(SLEEP_TIME);
	}
}