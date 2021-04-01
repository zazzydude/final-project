package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class MyWishListPage {
	final WebDriver driver;
	final int SLEEP_TIME = 1500;
	
	public MyWishListPage(WebDriver driver) { 
		this.driver = driver;
	}
	
	@FindBy(id="name")
	WebElement nameTextBox;
	
	@FindBy(id="submitWishlist")
	WebElement saveButton;
	
	@FindBy(xpath=".//table/tbody/tr/td[1]/a")
	WebElement whishListNames[];
	
	@FindBy(xpath=".//table/tbody/tr/td[6]/a")
	WebElement whishListDeleteButtons[];
	
	/**
	 * Send a string to the name text box on the wish list page
	 * @param name - name of the wish list to create
	 * @throws InterruptedException
	 */
	public void enterWhishListName(String name) throws InterruptedException {
		this.nameTextBox.sendKeys(name);
		Thread.sleep(SLEEP_TIME);
	}
	
	public void clickSaveButton() throws InterruptedException {
		this.saveButton.clear();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Hit one wish list name in the order of position
	 * @param index -position number
	 * @throws InterruptedException
	 */
	public void clickWishlist(int index) throws InterruptedException {
		this.whishListNames[index].click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Hit the name of one wish list created
	 * @param name- name of the wish list
	 * @throws InterruptedException
	 */
	public void clickWishlist(String name) throws InterruptedException {
		int index = -1;
		for (int x=0; x<whishListNames.length; x++) {
			WebElement element = this.whishListNames[x];
			if(element.getText().toLowerCase().equals(name.toLowerCase())) {
				index = x;
				break;
			}
		}
		
		if (index > -1)
			this.whishListNames[index].click();
		else
			Console.log(null, null, whishListNames, null);
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Delete one wish list name in the order of position
	 * @param index -position number
	 * @throws InterruptedException
	 */
	public void deleteWishlist(int index) throws InterruptedException {
		this.whishListDeleteButtons[index].click();
		Thread.sleep(SLEEP_TIME);
	}
	
	/**
	 * Delete one wish list by its name 
	 * @param name -name o wish list
	 * @throws InterruptedException
	 */
	public void deleteWishlist(String name) throws InterruptedException {
		int index = -1;
		for (int x=0; x<whishListNames.length; x++) {
			WebElement element = this.whishListNames[x];
			if(element.getText().toLowerCase().equals(name.toLowerCase())) {
				index = x;
				break;
			}
		}
		
		if (index > -1)
			this.whishListDeleteButtons[index].click();
		else
			Console.log(null, null, whishListNames, null);
		Thread.sleep(SLEEP_TIME);
	}
	
	
}
