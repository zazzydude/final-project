package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	//final WebDriver driver;
	
	
	public Cart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Hit to "Proceed to check out" for 1st time	
		@FindBy(xpath= "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
		WebElement Proceed1;
		
		public void clickProceed1() {
			this.Proceed1.click();
		}
		
		//Hit to "Proceed to check out" for 2nd time	
		@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
		WebElement Proceed2;	
		
		public void clickProceed2() {
			this.Proceed2.click();
		}
		
		//Hit to "Proceed to check out" for 3rd time	
		@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div/form/p/button")
		WebElement Proceed3;
		
		public void clickProceed3() {
			this.Proceed3.click();
		}
		
		// Hit "agree" check box
		@FindBy(id="uniform-cgv")
		WebElement CbAgree;
		
		public void clickCbAgree() {
			this.CbAgree.click();
		}
		
		//Hit to "Proceed to check out" for 4th time	
		@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div/div/form/p/button")
		WebElement Proceed4;	
		
		public void clickProceed4() {
			this.Proceed4.click();
		}
		
		//payment with Bank check
		@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")
		WebElement PayBankCheck;
		
		public void clickPayBankCheck() {
			this.PayBankCheck.click();
		}
		
		//payment with Bank Wire
		@FindBy(xpath= "//*[@id='HOOK_PAYMENT']/div[2]/div/p/a")
		WebElement PayBankWire;
		
		public void clickPayBankWire() {
			this.PayBankWire.click();
		}
		
		//hit confirm payment 
		@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div/form/p/button")
		WebElement NavCart;	
		
		public void clickNavCart() {
			this.NavCart.click();
		}
	
}