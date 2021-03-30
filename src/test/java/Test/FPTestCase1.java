package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.MyAccountPage.navBar;


public class FPTestCase1 {
	WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Usuario/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//implicit wait= de no ser posible realizar algun paso, espera hasta 10 segundos(en este caso)
		// entre cada uno de los pasos
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(enabled = false)
	public void successfullyLogin() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		mainPage.clickSignIn();
		loginPage.enterUserEmail("ya_el1995@hotmail.com");
		loginPage.enterUserPassword("KnD504012");
		loginPage.clickSubmitButton();
		
	}
	
	@Test(enabled = true)
	public void buyArticleSuccessfully() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		mainPage.clickSignIn();
		loginPage.enterUserEmail("ya_el1995@hotmail.com");
		loginPage.enterUserPassword("KnD504012");
		loginPage.clickSubmitButton();
		
		MyAccountPage accP = new MyAccountPage(driver);
		accP.getNavBarOptions(navBar.DRESSES).click();
		Thread.sleep(3000);
		
	}
	
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}