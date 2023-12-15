package action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.Loginlocators;
import util.HelperClass;



public class LoginPageAction {

	Loginlocators loginPageLocator=null;
	 
	public LoginPageAction() {
		loginPageLocator  = new Loginlocators();
		
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocator);
	}
	public void myAccount(){
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(loginPageLocator.myaccount));
		loginPageLocator.myaccount.click();
	}
	
		public void setEmail(String stremail){
			loginPageLocator.email.sendKeys(stremail);
		}
			public void setpassword(String strPassword) {
				loginPageLocator.password.sendKeys(strPassword);
		}
			public void clicksignin() {
				loginPageLocator.signin.click();
			}
				
				public void clicksignout() {
					loginPageLocator.signout.click();
			}
				public void clicknormal() {
					loginPageLocator.clicknormal.click();
			}
			public void logininfo(String stremail,String strPassword) {
				setEmail(stremail);
				setpassword(strPassword);
			}
			public String getVerifyText() {
				HelperClass.wait.until(ExpectedConditions.elementToBeClickable(loginPageLocator.loginverify));
				return loginPageLocator.loginverify.getText();
			}
			public String getsignoutVerifyText() {
				return loginPageLocator.signoutverify.getText();
			}
			
			public String getVerifyErrorText() {
			return loginPageLocator.invalidlogin.getText() ;
				
			}
}