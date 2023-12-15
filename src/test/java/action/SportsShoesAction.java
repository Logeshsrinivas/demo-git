package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import locators.SportsShoesLocators;
import util.HelperClass;

public class SportsShoesAction {
	SportsShoesLocators ss;
	public int size;
	
	public SportsShoesAction() {
		ss= new SportsShoesLocators();
		PageFactory.initElements(HelperClass.getDriver(),ss);
	}
		
		
		public void clicksshoes() {
			HelperClass.action.moveToElement(ss.sportsshoes).perform();
			
		}
		
		public void clickfootballshoes() {
			ss.football.click();
			
		}
		
		public void clickprice() {
			Select sss= new Select(ss.price);
			sss.selectByIndex(2);
		}
	
//		public void clickpriceamount() {
//	 	     ss.priceclick.click();
//	  	    }
		
		public void shoeclick() {
			clicksshoes();
			clickfootballshoes();
			clickprice();
		//	clickpriceamount();
		}
		
		public void printList() {
			HelperClass.wait.until(ExpectedConditions.elementToBeClickable(HelperClass.getDriver().findElement(By.xpath(ss.list))));
			List<WebElement> element  = HelperClass.getDriver().findElements(By.xpath(ss.list));
			size=element.size();
			System.out.println("Count of products diplayed :"+ size);
			for (WebElement element1 : element) {
				System.out.println("Product Name :" + element1.getText());
			}
		}
}
	
	


