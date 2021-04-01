package Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Cart;
import pages.Category;
import pages.CreateAccountPage;
import pages.LoginPage;
import pages.MainPage;

public class FPTestCase9 {
	WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		/* implicit wait= de no ser posible realizar algun paso, espera hasta 10 segundos(en este caso)
		 entre cada uno de los pasos*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * Methos of the FPTC11.1
	 * @throws InterruptedException
	 */
	@Test
	public void createAccontAndBuyArticle() throws InterruptedException {
		java.util.Date fecha = new Date();
		String s1= String.valueOf(fecha);
		s1 = s1.replace(" ","");//replaces all occurrences of " " to ""
		s1 = s1.replace(":","");//replaces all occurrences of ":" to ""
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		Category catPage = new Category(driver);
		Cart cart = new Cart(driver);
		
		//click on Sign in
		mainPage.clicksignIn();
		// enter a email and click on create account
		loginPage.enterRegisterEmail(s1+"@hotmail.com");
		loginPage.clickSubmitCreateButton();
		//data intsert in de create account page
		createAccount.mrsRadioButton();
		createAccount.firstNameTextBox("Maria");
		createAccount.lastNameTextBox("Perez");
		createAccount.passwordTextBox("00000");
		createAccount.daysDropdown(3);
		createAccount.monthsDropdown(3);
		createAccount.yearsDropdown("1958");
		createAccount.addressTextBox1("Calma 123");
		createAccount.citiesTextBox("Edingburg");
		createAccount.statesDropdown("Texas");
		createAccount.zipTextBox("12345");
		createAccount.mobileTextBox("8180296420");
		createAccount.addressAliasTextBox("Home");
		createAccount.regisButton();
		
		mainPage.searchQuery("Dresses");
		mainPage.search();
		Thread.sleep(3000);
		catPage.selectItem(0);
		Thread.sleep(3000);
		catPage.clickProceed();
		
		Thread.sleep(3000);
		
		cart.clickProceed2();
		cart.clickProceed3();
		cart.clickCbAgree();
		cart.clickProceed4();
		cart.clickPayBankWire();
		cart.clickNavCart();
		
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
