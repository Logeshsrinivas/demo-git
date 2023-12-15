package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingLocator {
@FindBy(id="search")
public WebElement search; 
@FindBy(xpath="(//img[@class='product-image-photo hovered-img'])[1]")
public WebElement clickProduct;
@FindBy(xpath ="//select[@name='options[4667]']")
public WebElement size;
@FindBy(xpath="//a[text()='Calculate Shipping Cost']")
public WebElement shippingCost;
@FindBy(id ="region_id")
public WebElement region;
@FindBy(id ="zip")
public WebElement zip;
@FindBy(xpath ="//span[text()='Calculate']")
public WebElement calculate;
@FindBy(xpath ="//div[text()='Free Shipping']")
public WebElement verifyText;
}
