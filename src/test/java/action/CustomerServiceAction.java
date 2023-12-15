package action;

import org.openqa.selenium.support.PageFactory;

import locators.CustomerServiceLocators;
import util.HelperClass;

public class CustomerServiceAction {
	CustomerServiceLocators csl;
	
	public   CustomerServiceAction() {
	csl = new CustomerServiceLocators();
	PageFactory.initElements(HelperClass.getDriver(), csl);
}
	public void  CustomerService() {
		HelperClass.jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	 public void ReturnRequest() {
		 csl.returnrequest.click();
	 }
	 public String VerifyReturnRequest() {
		 return csl.verifyreturnrequest.getText();
		 
	 }
		 public void  TrackMyOrder () {
			 csl.trackorder.click();
		 }
			 
			 public String VerifyTrackMyOrder() {
				 return csl.verifytrackorder.getText();
			 }
		 
			 public void ContacUs() {
				 csl.contactus.click();
			 }
			 public String VerifyContactUs() {
				return csl.verifycontactus.getText();
			 }
			 public void StorePickup() {
				 csl.storepickup.click();
			 }
			 public String verifyStorePickup() {
				 return csl.verifystorepickup.getText();
			 }
	 }
	 