package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
	
	
	final WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
	WebElement orderHistoryDetails;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a")
	WebElement myWishLists;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a")
	WebElement myCreditSlips;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a")
	WebElement myAddresses;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
	WebElement myPersonalInformation;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/a")
	WebElement homeButton;


}