package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Category {
	final WebDriver driver;
	final int SLEEP_TIME = 1500;
	
	public Category(WebDriver driver) {
		this.driver = driver;		
	
	}
	@FindBy(xpath=".//a[./img[@class='replace-2x'] and @title='Casual Dresses']")
	WebElement casualDresses ;
	
	@FindBy(xpath=".//a[./img[@class='replace-2x'] and @title='Evening Dresses']")
	WebElement eveningDresses ;
	
	@FindBy(xpath=".//a[./img[@class='replace-2x'] and @title='Summer Dresses']")
	WebElement summerDresses ;
	
	@FindBy(xpath=".//ul[@class='product_list grid row']/li/.//a[@class='product_img_link']")
	WebElement dresses[] ;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement cartButton ;
	
	@FindBy(xpath="//*[@id=\"selectProductSort\"]")
	WebElement sortBy ;
	
	/**
	 * Click the casual dresses sub category option
	 * @throws InterruptedException
	 */
	public void clickCasualDresses() throws InterruptedException {
		this.casualDresses.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the evening dresses sub category option
	 * @throws InterruptedException
	 */
	public void clickEveningDresses() throws InterruptedException {
		this.eveningDresses.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the summer dresses sub category option
	 * @throws InterruptedException
	 */
	public void clickSummerDresses() throws InterruptedException {
		this.summerDresses.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the summer dresses sub category option
	 * @throws InterruptedException
	 */
	public void clickDresses() throws InterruptedException {
		this.dresses[1].click();
		Thread.sleep(SLEEP_TIME);
	}
	
	
	
}