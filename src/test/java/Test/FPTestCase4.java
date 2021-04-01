package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.Category;


public class FPTestCase4 {
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
	public void clickEveningDresses() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		Category category = new Category(driver);
		mainPage.dresses();
		category.clickEveningDresses();
		category.printedDress();

	}

	@Test(enabled = true)
	public void productConfig() throws InterruptedException{
		Category category = new Category(driver);
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