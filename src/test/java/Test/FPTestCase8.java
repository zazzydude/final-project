package Test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.AccountPurchase;
import pages.CreateAccountPage;


public class FPTestCase8 {
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
		public void login() throws InterruptedException {
			
			MainPage mainPage = new MainPage(driver);
			LoginPage loginPage = new LoginPage(driver);
			AccountPurchase accountpurchase = new AccountPurchase(driver);
			CreateAccountPage createaccountpage = new CreateAccountPage(driver);
			mainPage.clicksignIn();
			loginPage.enterUserEmail("ya_el1995@hotmail.com");
			loginPage.enterUserPassword("KnD504012");
			loginPage.clickSubmitButton();
			accountpurchase.personalInfoB();
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
