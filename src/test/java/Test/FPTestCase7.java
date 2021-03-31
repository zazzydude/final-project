package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddressPage;
import pages.AddressesPage;
import pages.LoginPage;
import pages.MainPage;
import pages.MyAccountPage;


public class FPTestCase7 {
	WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(enabled = true, groups = {"sanity", "regression"})
	public void successfullyLogin() throws InterruptedException {
		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		mainPage.clicksignIn();
		loginPage.enterUserEmail("ya_el1995@hotmail.com");
		loginPage.enterUserPassword("KnD504012");
		loginPage.clickSubmitButton();
		
	}
	
	@Test(dependsOnMethods = { "successfullyLogin" }, groups = {"sanity", "regression"})
	public void AddNewAddress() throws InterruptedException {
		//Going to the My Addresses section
		MyAccountPage myAccountPage = PageFactory.initElements(driver, MyAccountPage.class);
		myAccountPage.clickMyAddresses();
		
		//Hit the Add New Address button
		AddressesPage addressesPage = PageFactory.initElements(driver, AddressesPage.class);
		addressesPage.clickAddNewAddressButton();
		
		//Writing all the necessary info for the new address
		AddressPage addressPage = PageFactory.initElements(driver, AddressPage.class);
		addressPage.enterFirstName("Yael");
		addressPage.enterLastName("Santana");
		addressPage.enterCompany("Accenture");
		addressPage.enterAddress("Domicilio #1345");
		addressPage.enterAddressLine2("Interior #2");
		addressPage.enterCity("Ciudad");
		addressPage.selectState("Colorado");
		addressPage.enterPostalCode("45123");
		addressPage.selectCountry(0);
		addressPage.enterHomePhone("8549671230");
		addressPage.enterMobilePhone("4512478955");
		addressPage.enterAddressTitle("Autogenerated " + ((int) (Math.random() * 100)));
		
		//Hit the save button
		addressPage.clickSaveButton();
	}
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
