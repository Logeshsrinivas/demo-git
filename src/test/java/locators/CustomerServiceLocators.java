package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerServiceLocators {
	@FindBy(xpath ="//a[@title='Return Request']")
	public WebElement returnrequest;
	@FindBy(xpath ="//div[text()='You have placed no return request.']")
	 public WebElement verifyreturnrequest;
	@FindBy(xpath ="//a[@title='Track my Order']")
    public WebElement trackorder;
	@FindBy(xpath="(//span[text()='You have placed no orders.'])[1]")
     public WebElement 	verifytrackorder;
	@FindBy(xpath ="(//a[text()='Contact Us'])[2]")
    public WebElement contactus;
	@FindBy(xpath ="//strong[text()='Khelmart Enterprises']")
	public WebElement verifycontactus;
	@FindBy(xpath ="//a[text()='Store Pickup']")
    public WebElement storepickup;
	@FindBy(xpath ="(//a[text()='inquiry@khelmart.com'])[2]")
    public WebElement verifystorepickup;
}
