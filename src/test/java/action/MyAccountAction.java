package action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.MyAccountLocatorPage;
import util.HelperClass;

public class MyAccountAction {
	MyAccountLocatorPage myAccountLocatorPage;

	public MyAccountAction(){
		myAccountLocatorPage=new MyAccountLocatorPage();
		PageFactory.initElements(HelperClass.getDriver(),myAccountLocatorPage);
	}
	
	public void clickyouraccount() {
		myAccountLocatorPage.youraccount.click();
		}
	
	public void clickaccountclick()  {
//		HelperClass.wait.until(ExpectedConditions.visibilityOfAllElements(myAccountLocatorPage.myaccount));
		HelperClass.jse.executeScript("arguments[0].click()", myAccountLocatorPage.myaccount);
//		Thread.sleep(5000);
//		HelperClass.action.moveToElement(myAccountLocatorPage.myaccount).click();
		}
	public String getaccounttext() {
		return myAccountLocatorPage.accountcheck.getText();
		}
	public void clickmyorder() {
		myAccountLocatorPage.myorder.click();

		}
	public String getordertext() {
		return myAccountLocatorPage.ordercheck.getText();

		}
	public void setmyaddressbook() {
		myAccountLocatorPage.myaddressbook.click();

		}
	
	public void setchangeaddress() {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(myAccountLocatorPage.changeaddress)).click();;
	

		}
	public void setaddressClear() {
		myAccountLocatorPage.addressgiven.clear();

		}
	public void setaddress(String straddress) {
		myAccountLocatorPage.addressgiven.sendKeys(straddress);

		}
	
	public void setsaveaddress() {
		myAccountLocatorPage.saveaddress.click();
        
		}
	public String verifyAddress() {
		return myAccountLocatorPage.saveaddressVerify.getText();
		
	}
	

	
	
		
}
