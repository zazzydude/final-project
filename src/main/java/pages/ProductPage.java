package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "quantity_wanted")
	WebElement quantityTextBox;
	
	@FindBy(xpath=".//a[./span/i[@class='icon-minus']]")
	WebElement minusButton;
	
	@FindBy(xpath=".//a[./span/i[@class='icon-plus']]")
	WebElement plusButton;
	
	@FindBy(xpath=".//button[./i[@class='icon-twitter']]")
	WebElement twitterButton;
	
	@FindBy(xpath=".//button[./i[@class='icon-facebook']]")
	WebElement facebookButton;
	
	@FindBy(xpath=".//button[./i[@class='icon-google-plus']]")
	WebElement googlePlusButton;
	
	@FindBy(xpath=".//button[./i[@class='icon-pinterest']]")
	WebElement pinterestButton;
	
	@FindBy(xpath="(.//ul[@id='color_to_pick_list']/li/a)[1]")
	WebElement color1;
	
	@FindBy(xpath="(.//ul[@id='color_to_pick_list']/li/a)[2]")
	WebElement color2;
	
	@FindBy(xpath="(.//ul[@id='color_to_pick_list']/li/a)[3]")
	WebElement color3;
	
	@FindBy(xpath="(.//ul[@id='color_to_pick_list']/li/a)[4]")
	WebElement color4;
	
	@FindBy(id="group_1")
	WebElement sizeSelect;
	
	@FindBy(xpath=".//a[@title='Proceed to checkout']")
	WebElement poceedCheckoutButton;
	
	@FindBy(xpath=".//div[@class='button-container']/span")
	WebElement continueShopingButton;
	
	@FindBy(xpath="//p[@id='add_to_cart']/button")
	WebElement addToCartButton;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/p/a")
	WebElement wishList;
	
	public void makeWish() {
		wishList.click();
	}
	
	public void clickPlusButton() {
		plusButton.click();
	}
	
	/**
	 * this method receives the quantity of products you want to buy
	 * @param quantity
	 * @throws InterruptedException
	 */
	public void enterQuantity(String num) throws InterruptedException {
		quantityTextBox.sendKeys(num);
	}
	
	/**
	 * this method select de size of the product
	 * @param index
	 * @throws InterruptedException
	 */
	public void selectSize(int index) throws InterruptedException {
		Select sizeDropdown = new Select(sizeSelect);
		sizeDropdown.selectByIndex(index);
	}
	 /**
	  * this method select the color of the product
	  * @param index
	  * @throws InterruptedException
	  */
	public void selectColor(int index) throws InterruptedException {
		switch(index) {
			case 1:
				color1.click();
				break;
			case 2:
				color2.click();
				break;
			case 3:
				color3.click();
				break;
			case 4:
				color4.click();
				break;
			default:
				color1.click();
				break;
		}
	}
	
	/**
	 * This method clicks on the add to cart button
	 * @throws InterruptedException
	 */
	public void clickOnAddCart() throws InterruptedException {
		addToCartButton.click();
	}
}
