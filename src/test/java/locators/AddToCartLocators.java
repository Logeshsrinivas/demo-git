package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartLocators {
	@FindBy(xpath="//input[@id='search']") public WebElement searchbar;
	@FindBy(xpath ="(//div[@class='actions-primary'])[1]/form/button")
	public WebElement productAddToCart;
	@FindBy(xpath ="//a[@title='View and Edit Cart']")
	public WebElement viewCart;
	public String cartList="//div[@class='product-item-details']/strong/a";
	public String cartRemove ="//a[@class='action action-delete']";
	@FindBy(xpath ="(//td[@class='amount'])[3]")
	public WebElement totalPrice;
	
}
