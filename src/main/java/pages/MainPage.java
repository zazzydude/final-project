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
	
	public void clickSingIn() throws InterruptedException {
		this.signIn.click();
		Thread.sleep(SLEEP_TIME);
	}
}