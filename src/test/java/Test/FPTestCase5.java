package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.LoginPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.MyAccountPage.navBar;

public class FPTestCase5 {
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
		enabled = true,
		description = "Make a purchase when user are already sign-in",
		groups = {}
	)
	public void buyArticleSuccessfully() {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		CartPage cart = new CartPage(driver);
		
		mainPage.clicksignIn();
		loginPage.enterUserEmail("none@nonenone.com");
		loginPage.enterUserPassword("Therion255");
		loginPage.clickSubmitButton();
		
		MyAccountPage accP = new MyAccountPage(driver);
		accP.getNavBarOptions(navBar.DRESSES).click();

		
		//cart.clickProduct();	
		//cart.clickEvening();
		cart.selectitem();
		
		cart.clickProceed1();
		cart.clickProceed2();
		cart.clickProceed3();
		cart.clickCbAgree();
		cart.clickProceed4();
		cart.clickPayBankWire();
		cart.clickNavCart();
	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
