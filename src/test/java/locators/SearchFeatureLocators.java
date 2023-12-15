package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFeatureLocators {

	@FindBy(xpath="//input[@id='search']") public WebElement searchbar;
	@FindBy(xpath="//button[@class='action search']") public WebElement searchkey;
	@FindBy(xpath="(//div[@class='filter-options-title'])[1]") public WebElement category;
	@FindBy(xpath="(//input[@class='js-cdz-checkbox'])[1]") public WebElement cricket;
	@FindBy(xpath="//div[@class='filter-options-item shoe_size_up']") public WebElement shoesize;
	@FindBy(xpath="//a[text()='UK-9']") public WebElement exactsize;
//	@FindBy(xpath="//div[@class='product details product-item-details text-center']/div//strong/a") public WebElement listOfProducts;
	public String listofProducts ="//div[@class='product details product-item-details text-center']/div//strong/a";

}
