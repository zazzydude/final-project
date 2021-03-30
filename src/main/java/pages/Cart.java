package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {
	final WebDriver driver;
	
	
	public Cart (WebDriver driver) {
		this.driver=driver;
	}

	
	//*[@id="layer_cart"]/div[1]/div[2]/div[4]/a

	//Hit to add to cart  
	@FindBy(xpath= ".//a[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]")
	WebElement Cart1;
	
	//Hit to "Proceed to check out" for 1st time	
	@FindBy(xpath= ".//a[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a")
	WebElement Proceed1;
	
	//Hit to "Proceed to check out" for 2nd time	
	@FindBy(xpath= ".//a[@id='center_column']/p[2]/a[1]")
	WebElement Proceed2;	
	
	//Hit to "Proceed to check out" for 3rd time	
	@FindBy(xpath= ".//a[@id='center_column']/form/p/button")
	WebElement Proceed3;	
	
	// Hit "agree" check box
	@FindBy(id="uniform-cgv")
	WebElement CbAgree;
	
	//Hit to "Proceed to check out" for 4th time	
	@FindBy(xpath= ".//a[@id='form']/p/button")
	WebElement Proceed4;	
	
	
	//payment with Bank check
	@FindBy(xpath= "//*[@id=\'HOOK_PAYMENT\']/div[1]/div/p/a")
	WebElement PayBankCheck;
	
	//payment with Bank Wire
	@FindBy(xpath= "//*[@id=\'HOOK_PAYMENT\']/div[2]/div/p/a")
	WebElement PayBankWire;
	
	//hit confirm payment 
	@FindBy(xpath= "//*[@id=\'cart_navigation\']/button")
	WebElement NavCart;
	

}


