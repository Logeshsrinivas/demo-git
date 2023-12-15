package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountLocatorPage {

	
	@FindBy(xpath="//div[@class='account-wrapper']")
	public WebElement youraccount;
	
	@FindBy(xpath="//a[@class='account']")
	public WebElement myaccount;
	
	@FindBy(xpath ="//strong[text()='Account Information']")
	public WebElement accountcheck;
	
	@FindBy(xpath="//a[text()='My Orders']")
	public WebElement myorder;
	
	@FindBy(xpath="(//span[text()='You have placed no orders.'])[1]")
	public WebElement ordercheck;
	
	@FindBy(xpath="//a[text()='Address Book']")
	public WebElement myaddressbook;
	
	@FindBy(xpath="(//div[@class='box-actions'])[1]/a")
	public WebElement changeaddress;
	
	@FindBy(xpath="//input[@id='street_1']")
	public WebElement addressgiven;
	
	@FindBy(xpath="//button[@title='Save Address']")
	public WebElement saveaddress;
	@FindBy(xpath="//div[text()='You saved the address.']")
	public WebElement saveaddressVerify;
	
	
	
	
	

}





