package Test;

import java.util.Locale.Category;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Cart;
import pages.LoginPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.MyAccountPage.navBar;
import pages.Product;

public class FPTestCase5 {
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
	

	
	@Test(enabled = true)
	public void buyArticleSuccessfully() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		Product product = new Product(driver);
		Cart cart = new Cart(driver);
		
		mainPage.clicksignIn();
		loginPage.enterUserEmail("none@nonenone.com");
		loginPage.enterUserPassword("Therion255");
		loginPage.clickSubmitButton();
		
		MyAccountPage accP = new MyAccountPage(driver);
		accP.getNavBarOptions(navBar.DRESSES).click();

		
		//cart.clickProduct();
		//Thread.sleep(3000);	
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
	
}
