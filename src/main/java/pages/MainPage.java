package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

	final WebDriver driver;
	final int SLEEP_TIME = 1500;

	public MainPage(WebDriver driver)
	{
	this.driver = driver;	
	}

	@FindBy(xpath=".//a[@class='login']")
	WebElement singIn;
	
	@FindBy(xpath=".//a[@title='Contact Us']")
	WebElement contactUs;
	
	@FindBy(xpath="//*[@id='header']/div[1]/div/div/a")
	WebElement imgResponsive;

	@FindBy(xpath=".//img[@class='logo img-responsive']")
	WebElement logoImgResponsive;
	
	@FindBy(xpath=".//a[@title='View my shopping cart']")
	WebElement shoppingCart;
	
	@FindBy(xpath="//*[@id='searchbox']/button")
	WebElement search;
	
	@FindBy(xpath=".//input[@class='search_query form-control ac_input']")
	WebElement searchQuery;
	
	@FindBy(xpath=".//a[@title='Women']")
	WebElement women;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement dresses;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[3]/a")
	WebElement tshirtsMenu;
	
	@FindBy (xpath=".//*[@id='homeslider']/li[3]/div/p[2]/button")
	WebElement shopButton;

	@FindBy (xpath="//*[@id='home-page-tabs']/li[1]/a")
	WebElement popular;

	@FindBy (xpath=".//*[@id='home-page-tabs']/li[2]/a")
	WebElement bestSellers;
	
	@FindBy (xpath=".//a[@class='bx-prev']")
	WebElement prev;
	
	@FindBy (xpath=".//a[@class='bx-next']")
	WebElement next;
	
	@FindBy (xpath="//*[@id='htmlcontent_top']/ul/li[1]/a")
	WebElement bannerSeis;
	
	@FindBy (xpath="//*[@id='htmlcontent_top']/ul/li[2]/a")
	WebElement bannerSiete;
	
	@FindBy (xpath=".//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a")
	WebElement tshirts;
	
	@FindBy (xpath=".//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[2]/a")
	WebElement blouses;

	@FindBy (xpath="//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")
	WebElement casualDresses;
	
	@FindBy (xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[2]/a")
	WebElement eveningDresses;
	
	@FindBy (xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a")
	WebElement summerDresses;
	
	@FindBy(xpath=".//a[@class='login']")
	WebElement signIn;
	
	/**
	 * Click the Sign in button
	 * @throws InterruptedException
	 */
	public void clicksignIn() throws InterruptedException {
		this.signIn.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Contact Us button
	 * @throws InterruptedException
	 */
	public void contactUs() throws InterruptedException {
		this.contactUs.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Header image
	 * @throws InterruptedException
	 */
	public void imgResponsive() throws InterruptedException {
		this.imgResponsive.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Logo_image
	 * @throws InterruptedException
	 */
	public void logoImage() throws InterruptedException {
		this.logoImgResponsive.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Shopping Cart button
	 * @throws InterruptedException
	 */
	public void shoppingCart() throws InterruptedException {
		this.shoppingCart.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Search button
	 * @throws InterruptedException
	 */
	public void search() throws InterruptedException {
		this.search.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Send text to the input search query of the login
	 * @param data - user research
	 * @throws InterruptedException
	 */
	public void searchQuery(String data) throws InterruptedException {
		this.searchQuery.sendKeys(data);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Women button
	 * @throws InterruptedException
	 */
	public void women() throws InterruptedException {
		this.women.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Dresses button
	 * @throws InterruptedException
	 */
	public void dresses() throws InterruptedException {
		this.dresses.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the tShirtsMenu button
	 * @throws InterruptedException
	 */
	public void tshirtsMenu() throws InterruptedException {
		this.tshirtsMenu.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Shop button
	 * @throws InterruptedException
	 */
	public void shopButton() throws InterruptedException {
		this.shopButton.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Popular button
	 * @throws InterruptedException
	 */
	public void popular() throws InterruptedException {
		this.popular.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Best Sellers button
	 * @throws InterruptedException
	 */
	public void bestSellers() throws InterruptedException {
		this.bestSellers.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Previous button
	 * @throws InterruptedException
	 */
	public void prev() throws InterruptedException {
		this.prev.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	
	/**
	 * Click the Next button
	 * @throws InterruptedException
	 */
	public void next() throws InterruptedException {
		this.next.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Banner 25%OFF Image
	 * @throws InterruptedException
	 */
	public void bannerSeis() throws InterruptedException {
		this.bannerSeis.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Banner 45%OFF Image
	 * @throws InterruptedException
	 */
	public void bannerSiete() throws InterruptedException {
		this.bannerSiete.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the T-shirts button
	 * @throws InterruptedException
	 */
	public void tshirts() throws InterruptedException {
		this.tshirts.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	
	/**
	 * Click the Blouses button
	 * @throws InterruptedException
	 */
	public void blouses() throws InterruptedException {
		this.blouses.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Casual Dresses button
	 * @throws InterruptedException
	 */
	public void casualDresses() throws InterruptedException {
		this.casualDresses.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Evening Dresses button
	 * @throws InterruptedException
	 */
	public void eveningDresses() throws InterruptedException {
		this.eveningDresses.click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Click the Summer Dresses button
	 * @throws InterruptedException
	 */
	public void summerDresses() throws InterruptedException {
		this.summerDresses.click();
		Thread.sleep(SLEEP_TIME);
	}
}