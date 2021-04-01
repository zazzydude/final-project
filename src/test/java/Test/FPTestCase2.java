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
	
	@Test
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
		createAccountPage.clickMrsRadioButton();
		createAccountPage.sendFirstNameTextBox("Marla");
		createAccountPage.sendLastNameTextBox("Garcia");
		createAccountPage.sendEmailTextBox("");
		createAccountPage.sendPasswordTextBox("2893a");
		createAccountPage.selectDayDropDown(2);
		createAccountPage.selectMonthDropDown(5);
		createAccountPage.selectYearsDropdown("1997");
		createAccountPage.clickNewsLetterCheckBox();
		createAccountPage.clickReciveSpecialCheckBox();
		createAccountPage.sendAddressFirstNameTextBox("Marla");
		createAccountPage.sendAddressLastNameTextBox("Garcia");
		createAccountPage.sendCompanyTextBox("PlantaNuclearDeSpringfield");
		createAccountPage.sendAddressTextBox1("Avenida Siempre Viva 742");
		createAccountPage.sendAddressTextBox2("House");
		createAccountPage.sendCitiesTextBox("Springfield");
		createAccountPage.selectStateDropDown(38);
		createAccountPage.sendZipTextBox("64700");
		createAccountPage.selectCountryDropDown(1);
		createAccountPage.sendAddInfo("Pregunta por Homero");
		createAccountPage.sendHomePhoneTextBox("015624853");
		createAccountPage.sendMobileTextBox("01192834648");
		createAccountPage.sendAddressAliasTextBox("Home");
		createAccountPage.clickRegisButton();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}