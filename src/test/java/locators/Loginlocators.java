package locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginlocators {

	@FindBy(xpath="//span[text()='Your account']") 
	public WebElement myaccount ;
	
	@FindBy(xpath = "(//input[@name='login[username]'])[2]")
	public WebElement email ;
	
	@FindBy(xpath = "(//input[@name='login[password]'])[2]")
	public WebElement password;
	
	@FindBy(xpath = "(//button[@type='submit'])[4]")
	public WebElement signin;
	
	@FindBy (xpath ="//a[@class='md-raised md-primary']")
	public WebElement signout;
	
	@FindBy (xpath ="//span[text()='You are signed out']")
	public WebElement signoutverify;
	 
	@FindBy(xpath ="//p[@class='title']/a")
	public WebElement loginverify;
	
	@FindBy(xpath ="(//div[text()='This is a required field.'])[1]")
	public WebElement invalidlogin;
	
	@FindBy(xpath ="/html/body/div[2]/div[8]/div/div/div[1]/div[2]/div/p[1]")
	public WebElement clicknormal;

	
	}

