package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.AddToCartLocators;
import util.HelperClass;

public class AddToCartAction {
	AddToCartLocators atcl ;
	
	public AddToCartAction() {
		atcl = new AddToCartLocators();
		PageFactory.initElements(HelperClass.getDriver(), atcl);
	}
	
	public void searchproduct(String search) {
		atcl.searchbar.sendKeys(search,Keys.ENTER);
	}
	public void addToCart() {
		HelperClass.jse.executeScript("window.scrollBy(0,400)","");
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(atcl.productAddToCart));
		atcl.productAddToCart.click();
	}
	public void viewCart() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(atcl.viewCart));
		atcl.viewCart.click();
	}
	public void listofProducts() {
		List<WebElement> str = HelperClass.getDriver().findElements(By.xpath(atcl.cartList));
		System.out.println("No.OF Products in cart :" + str.size());
		for (WebElement webElement : str) {
			System.out.println("Product Name :" + webElement.getText());
		}
	}
		public void removefromCart() {
			List<WebElement> str = HelperClass.getDriver().findElements(By.xpath(atcl.cartRemove));
			HelperClass.wait.until(ExpectedConditions.visibilityOfAllElements(str));
			String tp="";
			for (WebElement webElement : str) {
				HelperClass.wait.until(ExpectedConditions.elementToBeClickable(atcl.totalPrice));
				String tprice=atcl.totalPrice.getText();
				for (int i = 0; i < tprice.length(); i++) {

					if((tprice.charAt(i)>='0'&&tprice.charAt(i)<='9'))
					{		tp=tp+tprice.charAt(i);
					}
				}
				int i=Integer.parseInt(tp);
				System.out.println(i);
				if(i<=1000000) {
					return;
				}else {
					webElement.click();
					tp="";
				}

			}

		
		}
}

