package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.MainPage;

public class FPTestCase4 {
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
		description = "Select a menu option called 'Dresses'",
		groups = {}
	)
	public void clickEveningDresses() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		CategoryPage category = new CategoryPage(driver);
		mainPage.dresses();
		category.clickEveningDresses();
		category.printedDress();

	}

	@Test(
		enabled = true, 
		dependsOnMethods = {"clickEveningDresses"},
		description = "Configure the dress selected and proceed to check-out option without sign-in",
		groups = {}
	)
	public void productConfig() throws InterruptedException{
		CategoryPage category = new CategoryPage(driver);
		//Product product = new Product(driver);
		category.plusButton();
		category.sizeSelector();
		category.sizeL();
		category.colorSelector();
		category.sendToCart();
		category.checkOut();
		category.checkOutFinal();
	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
