package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	final WebDriver driver;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	

	//lista de product
	@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]")
	WebElement listProduct;	
	
	//boton add to cart
	@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]")
	WebElement Cart1;
	

	//accion para mover cursor sobre producto
	public void selectitem() {
	Actions ac = new Actions(driver);
	ac.moveToElement(listProduct).perform();
	Cart1.click();
	
		
	}
		
	public void clickcart1() {
	this.Cart1.click();	
	//Thread.sleep(SLEEP_TIME);
	}
	
	
	//Aqui guardo todos los articulos de la pagina en una lista de articulos
	@FindBy(xpath = "//ul[@class = 'product_list grid row']/li")
	//Esta es la lista de articulos
	List<WebElement> productList;
	
		

	
	//Guardo todos los botones de add to cart, son 7
	@FindBy(xpath = "//span[text()='Add to cart']")
	List<WebElement> addCart;
	

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
	
	
	//hit home buton after signed in
	@FindBy(xpath= "/html/body/div/div[2]/div/div[3]/div/ul/li/a")
	WebElement homebutton;	
	
	public void clickHomeButton() {
		this.homebutton.click();
	}
}
