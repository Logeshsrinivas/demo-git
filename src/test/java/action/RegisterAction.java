package action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import locators.RegisterLocators;
import util.HelperClass;

public class RegisterAction {
	RegisterLocators regl ;
	
	public RegisterAction() {
		regl = new RegisterLocators();
		PageFactory.initElements(HelperClass.getDriver(), regl);
	}
	public void clickAccount() {
		regl.account.click();
	}
	public void clickMyccount() {
		regl.myAccount.click();
	}
	public void clickNewCustomer()  {
//		HelperClass.getDriver().switchTo().frame(0);
//		
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(regl.newCustomer));
//		Actions act = new Actions(HelperClass.getDriver());
//		act.moveToElement(regl.newCustomer).click().build().perform();
		HelperClass.jse.executeScript("arguments[0].click()", regl.newCustomer);
//		regl.newCustomer.click();
	}
	public void setFirstrname(String firstname) {
		regl.firstname.sendKeys(firstname);
	}
	public void setLastName(String lastname) {
		regl.lastname.sendKeys(lastname);
	}
	public void setEmail(String email) {
		regl.email.sendKeys(email);
	}
	public void setPassword(String password) {
		regl.password.sendKeys(password);
	}
	public void setCPassword(String cPassword) {
		regl.cpassword.sendKeys(cPassword);
	}
	public void clickCreateAccount() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(regl.createAccount));
		HelperClass.jse.executeScript("arguments[0].click()", regl.createAccount);
		
	}
	public String getVerifyText() {
		return regl.getVerification.getText();
	}
	
	public void NewAccount(String fristname, String lastname, String email, String password, String cPassword) {
		clickNewCustomer();
		setFirstrname(fristname);
		setLastName(lastname);
		setEmail(email);
		setPassword(password);
		setCPassword(cPassword);
	}
	public void Click() {
		clickAccount();
		clickMyccount();
		clickNewCustomer();
		
	}
}
