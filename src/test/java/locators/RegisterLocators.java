package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	@FindBy(xpath="//div[@class='account-wrapper']")
	public WebElement account;
	@FindBy(xpath="//a[text()=' My account']")
	public WebElement myAccount;
	@FindBy(xpath="(//span[text()='Create an Account'])[1]")
	public WebElement newCustomer;
	@FindBy(id="firstname")
	public WebElement firstname;
	@FindBy(id="lastname")
	public WebElement lastname;
	@FindBy(id="email_address")
	public WebElement email;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(id="password-confirmation")
	public WebElement cpassword;
	@FindBy(xpath="(//button[@id='send2'])[1]")
	public WebElement createAccount;
	@FindBy(xpath="//div[text()='Thank you for registering with Khelmart Enterprises.']")
	public WebElement getVerification;
}
