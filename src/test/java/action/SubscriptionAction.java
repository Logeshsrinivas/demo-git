package action;


import org.openqa.selenium.support.PageFactory;

import locators.SubscriptionLocators;
import util.HelperClass;



public class SubscriptionAction {

	SubscriptionLocators subscriptionlocators;
	
	public SubscriptionAction(){
		subscriptionlocators =new  SubscriptionLocators();
		PageFactory.initElements(HelperClass.getDriver(), subscriptionlocators);
	}
	
	public void clickHomepage() {
		subscriptionlocators.homepage.click();
	}
	
	public void srollToBottm() {
		HelperClass.jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}
	
	public void enterEmail(String email) {
		subscriptionlocators.emailAddress.sendKeys(email);
		
	}
	
	public void clickSubscribe() {
		subscriptionlocators.subscribe.click();
	}
	
	public String getTextforSubscribe() {
		return subscriptionlocators.subscribeMessage.getText();
	}
}
