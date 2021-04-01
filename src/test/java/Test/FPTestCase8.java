package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AccountPurchasePage;
import pages.CreateAccountPage;
import pages.LoginPage;
import pages.MainPage;

public class FPTestCase8 {
	WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
			
	@Test(
		enabled = true,
		description = "Update my personal information (change password)",
		groups = {}
	)
	public void login() throws InterruptedException {
		
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		AccountPurchasePage accountpurchase = new AccountPurchasePage(driver);
		CreateAccountPage createaccountpage = new CreateAccountPage(driver);
		mainPage.clicksignIn();
		loginPage.enterUserEmail("ya_el1995@hotmail.com");
		loginPage.enterUserPassword("54321");
		loginPage.clickSubmitButton();
		accountpurchase.personalInfoB();
		createaccountpage.mrRadioButton();
		accountpurchase.currentPassword("KnD504012");
		accountpurchase.newPassword("12345");
		accountpurchase.confirmationPassword("12345");
		accountpurchase.saveButton();
		Thread.sleep(3000);
		//accountpurchase.personalInfoB();
		createaccountpage.mrRadioButton();
		accountpurchase.currentPassword("KnD504012");
		accountpurchase.newPassword("54321");
		accountpurchase.confirmationPassword("54321");
		accountpurchase.saveButton();
		Thread.sleep(3000);
	
	}
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
