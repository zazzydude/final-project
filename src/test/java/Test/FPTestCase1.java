package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainPage;

public class FPTestCase1 {
	WebDriver driver;
	
	//test #2 git 

	@BeforeTest
	public void setBaseUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Luis\\Documents\\acadamy1\\academy\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void successfullyLogin() throws InterruptedException {
		MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		mainPage.clickSingIn();
		loginPage.enterUserEmail("ya_el1995@hotmail.com");
		loginPage.enterUserPassword("KnD504012");
		loginPage.clickSubmitButton();
	}
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}