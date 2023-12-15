package action;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder.Builder;

import locators.SwimmingLocators;
import util.HelperClass;

public class SwimmingAction {
	SwimmingLocators swimlocator;
	public int size;
	
	public SwimmingAction() {
		swimlocator = new SwimmingLocators();
		PageFactory.initElements(HelperClass.getDriver(), swimlocator);
		
	}
	 public void OtherSportCategory() {
		 HelperClass.action.moveToElement(swimlocator.othersport).perform();
	 }
	 public void Swimmingcap() {
		 swimlocator.swimmingcap.click();
	 }
	 public void Filter() {
		 swimlocator.filter.click();
	 }
	 public void View() {
		 HelperClass.action.moveToElement (swimlocator.view).click();
	 }
	public void listofProduct() throws InterruptedException {
		Thread.sleep(5000);
		List<WebElement> element  = HelperClass.getDriver().findElements(By.xpath(swimlocator.listofProducts));
		size=element.size();
		System.out.println("Count of products diplayed"+ size);
		for (WebElement element1 : element) {
			System.out.println("Product Name :" + element1.getText());
		}
	}
}
