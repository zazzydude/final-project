package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	final WebDriver driver;
	
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[2]/li[1]/div/div[2]/div[2]/a[2]")
	WebElement more;
		
	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[2]/li[1]")
	WebElement p1;
		
	public void selectItem() {
		//Creo una accion para poder hacer un mouseOver a ese articulo
		Actions ac = new Actions(driver);
		ac.moveToElement(p1).perform();
		more.click();
	}
	
	/**
	 * Click the Sign in button
	 * @throws InterruptedException
	 */
	public void clicksignIn()  {
		this.signIn.click();
		
	}
	
	/**
	 * Click the Contact Us button
	 * @throws InterruptedException
	 */
	public void contactUs()  {
		this.contactUs.click();
		
	}
	
	/**
	 * Click the Header image
	 * @throws InterruptedException
	 */
	public void imgResponsive() {
		this.imgResponsive.click();
		
	}
	
	/**
	 * Click the Logo_image
	 * @throws InterruptedException
	 */
	public void logoImage()  {
		this.logoImgResponsive.click();
		
	}
	
	/**
	 * Click the Shopping Cart button
	 * @throws InterruptedException
	 */
	public void shoppingCart()  {
		this.shoppingCart.click();
		
	}
	
	/**
	 * Click the Search button
	 * @throws InterruptedException
	 */
	public void search()  {
		this.search.click();
	
	}
	
	/**
	 * Send text to the input search query of the login
	 * @param data - user research
	 * @throws InterruptedException
	 */
	public void searchQuery(String data)  {
		this.searchQuery.sendKeys(data);
		
	}
	
	/**
	 * Click the Women button
	 * @throws InterruptedException
	 */
	public void women()  {
		this.women.click();
		
	}
	
	/**
	 * Click the Dresses button
	 * @throws InterruptedException
	 */
	public void dresses()  {
		this.dresses.click();
		
	}
	
	/**
	 * Click the tShirtsMenu button
	 * @throws InterruptedException
	 */
	public void tshirtsMenu()  {
		this.tshirtsMenu.click();
		
	}
	
	/**
	 * Click the Shop button
	 * @throws InterruptedException
	 */
	public void shopButton() {
		this.shopButton.click();
		
	}
	
	/**
	 * Click the Popular button
	 * @throws InterruptedException
	 */
	public void popular()  {
		this.popular.click();
		
	}
	
	/**
	 * Click the Best Sellers button
	 * @throws InterruptedException
	 */
	public void bestSellers() {
		this.bestSellers.click();
		
	}
	
	/**
	 * Click the Previous button
	 * @throws InterruptedException
	 */
	public void prev()  {
		this.prev.click();
		
	}
	
	
	/**
	 * Click the Next button
	 * @throws InterruptedException
	 */
	public void next()  {
		this.next.click();
		
	}
	
	/**
	 * Click the Banner 25%OFF Image
	 * @throws InterruptedException
	 */
	public void bannerSeis()  {
		this.bannerSeis.click();
		
	}
	
	/**
	 * Click the Banner 45%OFF Image
	 * @throws InterruptedException
	 */
	public void bannerSiete()  {
		this.bannerSiete.click();
		
	}
	
	/**
	 * Click the T-shirts button
	 * @throws InterruptedException
	 */
	public void tshirts() {
		this.tshirts.click();
		
	}
	
	
	/**
	 * Click the Blouses button
	 * @throws InterruptedException
	 */
	public void blouses()  {
		this.blouses.click();
		
	}
	
	/**
	 * Click the Casual Dresses button
	 * @throws InterruptedException
	 */
	public void casualDresses() {
		this.casualDresses.click();
		
	}
	
	/**
	 * Click the Evening Dresses button
	 * @throws InterruptedException
	 */
	public void eveningDresses()  {
		this.eveningDresses.click();
		
	}
	
	/**
	 * Click the Summer Dresses button
	 * @throws InterruptedException
	 */
	public void summerDresses()  {
		this.summerDresses.click();
		
	}
}
