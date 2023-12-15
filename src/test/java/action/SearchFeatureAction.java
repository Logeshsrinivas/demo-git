package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.SearchFeatureLocators;
import util.HelperClass;

public class SearchFeatureAction {

	SearchFeatureLocators searchfeaturelocators;
	public int size;
	public SearchFeatureAction() {
		searchfeaturelocators = new SearchFeatureLocators();
		PageFactory.initElements(HelperClass.getDriver(), searchfeaturelocators);
	}
	
	public void searchBar() {
		searchfeaturelocators.searchbar.click();
	}
	public void serachingProduct(String product) {
		searchfeaturelocators.searchbar.sendKeys(product);
	}
	
	public void searchButton() {
		searchfeaturelocators.searchkey.click();
	}
	
	public void catogeryOption() {
		searchfeaturelocators.category.click();
	}
	
	public void selectCricket() {
		searchfeaturelocators.cricket.click();
	}
	
	public void selectShoeSizeOption() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(searchfeaturelocators.shoesize));
		searchfeaturelocators.shoesize.click();
	}
	
	public void correctSize() {
		searchfeaturelocators.exactsize.click();
	}
	
	public void printList() {
		List<WebElement> element  = HelperClass.getDriver().findElements(By.xpath(searchfeaturelocators.listofProducts));
		size=element.size();
		System.out.println("Count of products diplayed"+ size);
		for (WebElement element1 : element) {
			System.out.println("Product Name :" + element1.getText());
		}
	}
	
	public void searchingActions(String product){
		serachingProduct(product);
	}
	
	public void finalCatogery() {
		catogeryOption();
		selectCricket();
	}
}
