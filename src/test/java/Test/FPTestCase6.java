package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainPage;
import pages.Product;

public class FPTestCase6 {
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
	
	@Test
	public void successfullyLogin() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		Product pro = new Product(driver);
		
		mainPage.clicksignIn();
		loginPage.enterUserEmail("sergio12345@gmail.com");
		loginPage.enterUserPassword("00000");
		loginPage.clickSubmitButton();
		
		mainPage.logoImage();
		mainPage.bestSeller();
		mainPage.selectItem();
		pro.makeWish();
		
	}
	
	
	@AfterTest
	public void endSession() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}