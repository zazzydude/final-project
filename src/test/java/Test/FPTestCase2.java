package Test;

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

public class FPTestCase2 {
	WebDriver driver;

	@BeforeTest
	public void setBaseUrl() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(
		description = "Successfully creation of a new account",
		groups = {}
	)
	public void createANewaccount() {
		
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		java.util.Date fecha = new Date();
		mainPage.clicksignIn();
		String s1= String.valueOf(fecha);
		s1 = s1.replace(" ","");//replaces all occurrences of " " to ""
		s1 = s1.replace(":","");//replaces all occurrences of ":" to ""
		loginPage.enterRegisterEmail(s1 + "@hotmail.com");
		loginPage.clickSubmitCreateButton();
		createAccountPage.mrsRadioButton();
		createAccountPage.firstNameTextBox("Marla");
		createAccountPage.lastNameTextBox("Garcia");
		createAccountPage.emailTextBox("");
		createAccountPage.passwordTextBox("2893a");
		createAccountPage.daysDropdown(2);
		createAccountPage.monthsDropdown(5);
		createAccountPage.yearsDropdown("1997");
		createAccountPage.newsLetterCheckBox();
		createAccountPage.reciveSpecialCheckBox();
		createAccountPage.addressFirstNameTextBox("Marla");
		createAccountPage.addressLastNameTextBox("Garcia");
		createAccountPage.companyTextBox("PlantaNuclearDeSpringfield");
		createAccountPage.addressTextBox1("Avenida Siempre Viva 742");
		createAccountPage.addressTextBox2("House");
		createAccountPage.citiesTextBox("Springfield");
		createAccountPage.selectStateDropDown(38);
		createAccountPage.zipTextBox("64700");
		createAccountPage.selectStateDropDown(1);
		createAccountPage.addInfo("Pregunta por Homero");
		createAccountPage.homePhoneTextBox("015624853");
		createAccountPage.mobileTextBox("01192834648");
		createAccountPage.addressAliasTextBox("Home");
		createAccountPage.regisButton();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
