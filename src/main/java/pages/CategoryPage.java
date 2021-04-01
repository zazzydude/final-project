package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	final WebDriver driver;
	
	public CategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
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
	
	//Doy click en proceed to checkout
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")
	WebElement proceedToCheckout;
	
	//Aqui guardo todos los articulos de la pagina en una lista de articulos
	@FindBy(xpath = "//ul[@class = 'product_list grid row']/li")
	//Esta es la lista de articulos
	List<WebElement> productList;
	
	//Guardo todos los botones de add to cart, son 7
	@FindBy(xpath = "//span[text()='Add to cart']")
	List<WebElement> addCart;
		
	//Envio el indice de el articulo que quiero
	public void selectItem(int itemIndex) {
		//Creo una accion para poder hacer un mouseOver a ese articulo
		Actions ac = new Actions(driver);
			
		//revisa si el indice que me paso es de un articulo que existe
		if (itemIndex <= productList.size()-1) {
			//Realizo el moseover
			ac.moveToElement(productList.get(itemIndex)).perform();
			//Doy click en el boton Add to cart
			addCart.get(itemIndex).click();
		
		}
		else {
			System.out.println("Error");
		}
	}
	
	public void clickProceed() {
		proceedToCheckout.click();
	}

	/**
	 * Click the casual dresses sub category option
	 * @throws InterruptedException
	 */
	public void clickCasualDresses() throws InterruptedException {
		this.casualDresses.click();
	}

	/**
	 * Click the evening dresses sub category option
	 * @throws InterruptedException
	 */
	public void clickEveningDresses() throws InterruptedException {
		this.eveningDresses.click();
	}

	/**
	 * Click the summer dresses sub category option
	 * @throws InterruptedException
	 */
	public void clickSummerDresses() throws InterruptedException {
		this.summerDresses.click();
	}

	/**
	 * Clicks the first product in the evening dresses sub category 
	 * @throws InterruptedException
	 */
	public void printedDress() throws InterruptedException {
		this.printedDress.click();
	}

	/**
	 * Clicks the + button to add a product 
	 * @throws InterruptedException
	 */
	public void plusButton() throws InterruptedException {
		this.plusButton.click();
	}

	/**
	 * Clicks the size slider to show the options
	 * @throws InterruptedException
	 */
	public void sizeSelector() throws InterruptedException {
		this.sizeSelector.click();
	}

	/**
	 * Clicks the option L in the dropdown menu
	 * @throws InterruptedException
	 */
	public void sizeL() throws InterruptedException {
		this.sizeL.click();
	}

	/**
	 * Clicks the color pink option 
	 * @throws InterruptedException
	 */
	public void colorSelector() throws InterruptedException {
		this.colorSelector.click();
	}

	/**
	 * Clicks the option add to cart
	 * @throws InterruptedException
	 */
	public void sendToCart() throws InterruptedException {
		this.sendToCart.click();
	}

	/**
	 * Clicks the proceed to checkout button 
	 * @throws InterruptedException
	 */
	public void checkOut() throws InterruptedException {
		this.checkOut.click();
	}

	/**
	 * Clicks the final proceed to checkout button 
	 * @throws InterruptedException
	 */
	public void checkOutFinal() throws InterruptedException {
		this.checkOutFinal.click();
	}
	
	
}
