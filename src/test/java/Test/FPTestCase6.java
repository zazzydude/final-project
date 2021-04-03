package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainPage;
import pages.ProductPage;

public class FPTestCase6 {
	WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		/* implicit wait= de no ser posible realizar algun paso, espera hasta 10 segundos(en este caso)
		 entre cada uno de los pasos*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(
		description = "Add a product to a wishlist",
		groups = {}
	)
	public void successfullyLogin() {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		ProductPage pro = new ProductPage(driver);
		
		mainPage.clicksignIn();
		loginPage.enterUserEmail("sergio12345@gmail.com");
		loginPage.enterUserPassword("00000");
		loginPage.clickSubmitButton();
		
		mainPage.logoImage();
		mainPage.bestSellers();
		mainPage.selectItem();
		pro.makeWish();
		
	}
	
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
