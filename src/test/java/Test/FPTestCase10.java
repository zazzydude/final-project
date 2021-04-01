package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MainPage;

public class FPTestCase10 {
	WebDriver driver;

	@BeforeTest
	public void setBaseUrl() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	@Test(
		enabled = true,
		description = "Successfully search of product",
		groups = {}
	)
	public void successfullySearch()  {
		MainPage mainPage = new MainPage(driver);
		mainPage.searchQuery("dress");
		mainPage.search();
	}
		
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
