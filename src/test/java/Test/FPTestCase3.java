package test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateAccountPage;
import pages.LoginPage;
import pages.MainPage;

public class FPTestCase3 {
	WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(
		description = "Creation of a new account with an inexisting email account",
		groups = {}
	)
	public void successfullyLogin() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		mainPage.clicksignIn();	
		
		java.util.Date fecha = new Date();
				
		String s1= String.valueOf(fecha);
		
		s1 = s1.replace(" ","");//replaces all occurrences of " " to ""
		s1 = s1.replace(":","");//replaces all occurrences of ":" to ""
		
		
		loginPage.enterRegisterEmail(s1 + "@bncxjhip.com");
		
		
		loginPage.clickSubmitCreateButton();
		createAccountPage.mrRadioButton ();
		createAccountPage.firstNameTextBox ("Antonio");
		createAccountPage.lastNameTextBox ("Villarreal");
		createAccountPage.passwordTextBox ("986532");
		createAccountPage.daysDropdown(3);
		createAccountPage.monthsDropdown(1);
		createAccountPage.yearsDropdown("1988");
		createAccountPage.newsLetterCheckBox ();
		createAccountPage.reciveSpecialCheckBox ();
		createAccountPage.addressFirstNameTextBox ("Antonio");
		createAccountPage.addressLastNameTextBox ("Villarreal");
		createAccountPage.companyTextBox ("Graphics Inc");
		createAccountPage.addressTextBox1 ("Calle 4 1050");
		createAccountPage.addressTextBox2 ("Departamento 3A");
		createAccountPage.citiesTextBox ("Monterrey");
		createAccountPage.selectStateDropDown(2);
		createAccountPage.zipTextBox ("66532");
		createAccountPage.addInfo ("Departamento en tercer piso al lado derecho de las escaleras");
		createAccountPage.homePhoneTextBox ("8185689475");
		createAccountPage.mobileTextBox ("8119653245");
		createAccountPage.addressAliasTextBox ("Casita");
		createAccountPage.regisButton ();
		
	}

	@AfterTest
	public void endSession()
	{
		driver.quit();
	}
}
