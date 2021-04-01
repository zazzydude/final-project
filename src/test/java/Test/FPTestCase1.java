package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainPage;

public class FPTestCase1 {
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
		description = "Successfully login with a correct username and password",
		groups = {"sanity", "regression"}, 
		priority = 1
	)
	public void successfullyLogin() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		mainPage.clicksignIn();
		loginPage.enterUserEmail("ya_el1995@hotmail.com");
		loginPage.enterUserPassword("54321");
		loginPage.clickSubmitButton();
		
	}
	
	@Test(
		description = "Unsuccessfully login with an incorrect password",
		groups = {"sanity", "regression"}, 
		priority = 0
	)
	public void unsuccessfullyLogin() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		mainPage.clicksignIn();
		loginPage.enterUserEmail("ya_el1995@hotmail.com");
		loginPage.enterUserPassword("54");
		loginPage.clickSubmitButton();
		
	}
		
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
