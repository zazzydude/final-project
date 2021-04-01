package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	public LoginPage (WebDriver driver) {
		//Puse aqui el initElements para que cada vez que creemos una instancia de esta clase
		// Se inicialice nuestros elementos
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="passwd")
	WebElement passwordTextBox;
	
	@FindBy(xpath=".//a[@href='http://automationpractice.com/index.php?controller=password']\r\n")
	WebElement forgotPasswordLink;
	
	@FindBy(id="SubmitLogin")
	public WebElement submitButton;
	
	@FindBy(id="email_create")
	WebElement emailCreateTextBox;
	
	@FindBy(id="SubmitCreate")
	WebElement submitCreateButton;
	
	/**
	 * Send text to the input email of the login
	 * @param email -user email
	 * @throws InterruptedException
	 */
	public void enterUserEmail(String email) {
		//Quite todos los waits por que con el implicit wait ya no son necesarios
		this.emailTextBox.sendKeys(email);
		
	}
	
	/**
	 * Send text to the input user password of the login
	 * @param pass -user password
	 * @throws InterruptedException
	 */
	public void enterUserPassword(String pass) {
		this.passwordTextBox.sendKeys(pass);
		
	}
	
	/**
	 * Click the login submit button
	 * @throws InterruptedException
	 */
	public void clickSubmitButton() {
		this.submitButton.click();
		
	}
	
	/**
	 * Send a text to the input email to create a new account
	 * @param email -user email
	 * @throws InterruptedException
	 */
	public void enterRegisterEmail(String email)  {
		this.emailCreateTextBox.sendKeys(email);
		
	}
	
	/**
	 * Click on the create submit button to create a new account
	 * @throws InterruptedException
	 */
	public void clickSubmitCreateButton()  {
		this.submitCreateButton.click();
		
	}
	
	/**
	 * Click on the link to recover the user password
	 * @throws InterruptedException
	 */
	public void clickRecoverPasswordLink() {
		this.forgotPasswordLink.click();
		
	}
}