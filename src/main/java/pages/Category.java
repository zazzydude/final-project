package pages;
//Git test 1 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {
	final int SLEEP_TIME = 1500;

	public Category(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//a[./img[@class='replace-2x'] and @title='Casual Dresses']")
	WebElement casualDresses ;

	@FindBy(xpath="(.//a[@title='Evening Dresses'])[3]")
	WebElement eveningDresses ;

	@FindBy(xpath=".//a[./img[@class='replace-2x'] and @title='Summer Dresses']")
	WebElement summerDresses ;

	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement cartButton ;

	@FindBy(xpath="//*[@id=\"selectProductSort\"]")
	WebElement sortBy ;

	@FindBy(xpath="//*[@id=\'center_column\']/ul/li/div/div[2]/h5/a")
	WebElement printedDress ;

	@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]")
	WebElement plusButton ;

	@FindBy(xpath="//*[@id=\"group_1\"]/option[3]")
	WebElement sizeL ;

	@FindBy(xpath="//*[@id=\"group_1\"]")
	WebElement sizeSelector ;

	@FindBy(xpath="//*[@id=\"color_24\"]")
	WebElement colorSelector ;

	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement sendToCart ;

	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement checkOut ;

	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement checkOutFinal ;

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
		//Thread.sleep(SLEEP_TIME);
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
	 * Clicks the first product in the evening dresses sub category 
	 * @throws InterruptedException
	 */
	public void printedDress() throws InterruptedException {
		this.printedDress.click();
		Thread.sleep(SLEEP_TIME);
	}

	/**
	 * Clicks the + button to add a product 
	 * @throws InterruptedException
	 */
	public void plusButton() throws InterruptedException {
		this.plusButton.click();
		Thread.sleep(SLEEP_TIME);
	}

	/**
	 * Clicks the size slider to show the options
	 * @throws InterruptedException
	 */
	public void sizeSelector() throws InterruptedException {
		this.sizeSelector.click();
		Thread.sleep(SLEEP_TIME);
	}

	/**
	 * Clicks the option L in the dropdown menu
	 * @throws InterruptedException
	 */
	public void sizeL() throws InterruptedException {
		this.sizeL.click();
		Thread.sleep(SLEEP_TIME);
	}

	/**
	 * Clicks the color pink option 
	 * @throws InterruptedException
	 */
	public void colorSelector() throws InterruptedException {
		this.colorSelector.click();
		Thread.sleep(SLEEP_TIME);
	}

	/**
	 * Clicks the option add to cart
	 * @throws InterruptedException
	 */
	public void sendToCart() throws InterruptedException {
		this.sendToCart.click();
		Thread.sleep(SLEEP_TIME);
	}

	/**
	 * Clicks the proceed to checkout button 
	 * @throws InterruptedException
	 */
	public void checkOut() throws InterruptedException {
		this.checkOut.click();
		Thread.sleep(SLEEP_TIME);
	}

	/**
	 * Clicks the final proceed to checkout button 
	 * @throws InterruptedException
	 */
	public void checkOutFinal() throws InterruptedException {
		this.checkOutFinal.click();
		Thread.sleep(SLEEP_TIME);
	}
}