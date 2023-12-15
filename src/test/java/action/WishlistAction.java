package action;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.datatable.DataTable;
import locators.WishlistLocators;
import util.HelperClass;

public class WishlistAction {
	
	WishlistLocators wishl;
	

	public WishlistAction(){
		wishl=new WishlistLocators();
		PageFactory.initElements(HelperClass.getDriver(),wishl);
	}
	
	public void clicksearch() {
		wishl.search.click();
	}
	
	public void setclicksearch(String search) {
		wishl.search.sendKeys(search,Keys.ENTER);
	}
	
	public void images() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishl.image));
		Actions action = new Actions(HelperClass.getDriver());
		HelperClass.action.moveToElement(wishl.image).perform();
	}
	
	public void clickproductWishList() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishl.wishlist));
		wishl.wishlist.click();
	}
	
	public void clickwishlistview() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(wishl.clickwishlist));
		wishl.clickwishlist.click();
	}
	
	public void clickwishView() {
		wishl.wishview.click();
	}
	
	public void clickShareButton() {
		HelperClass.jse.executeScript("window.scrollBy(0,400)","");
		wishl.sharebutton.click();
	}
	
	public void clicksharewishlist() {
		wishl.sharewishlist.click();
	}
	

	public void setenteremail(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	
		String enteremail = data.get("enteremail");
		wishl.enteremail.sendKeys( enteremail);
	
	}
	}
	
	public void message(DataTable datatable) {
		List<Map<String,String>> signUpForm = datatable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	
		String message= data.get("message");
		wishl.message.sendKeys(message);
	}
	}
	
	public String getVerifyWish(){
		return	wishl.wish.getText();
	}
	
	public void clickremove() {
		wishl.remove.click();
	}
	
		public void Clickw() {
		clicksearch();
				

}
	
}
