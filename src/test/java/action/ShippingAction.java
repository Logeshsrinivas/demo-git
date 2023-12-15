package action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import locators.ShippingLocator;
import util.HelperClass;

public class ShippingAction {
	ShippingLocator loc;
	
	public ShippingAction() {
		loc = new ShippingLocator();
		PageFactory.initElements(HelperClass.getDriver(), loc);
	}
	
	public void searchProduct(String search) {
		loc.search.sendKeys(search,Keys.ENTER);
	}
	public void clickProduct() {
		loc.clickProduct.click();
	}
	public void selectSize() {
		Select select = new Select(loc.size);
		select.selectByIndex(3);
	}
	public void clickShippingCost() {
		loc.shippingCost.click();
	}
	public void setRegion() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(loc.region));
		Select select = new Select(loc.region);
		select.selectByIndex(31);
	}
	public void setZip(String zip) {
		loc.zip.sendKeys(zip);
	}
	public void clickCalculate() {
		HelperClass.jse.executeScript("window.scrollBy(0,100)");
		loc.calculate.click();
	}
	public String getVerifyText() {
		String str =loc.verifyText.getText();
		HelperClass.jse.executeScript("window.scrollBy(0,-100)");
		return str;
	}
}
