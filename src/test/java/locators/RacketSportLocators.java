package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RacketSportLocators {

	@FindBy(xpath="(//li[@class='item level0 level-top parent'])[23]/a") public WebElement racketSport;
	@FindBy(xpath="(//a[text()='Badminton Rackets'])[2]") public WebElement badmintonRacket;
	@FindBy(xpath="(//select[@id='sorter'])[1]") public WebElement sortByOption;
	@FindBy(xpath="(//option[@value='price'])[1]") public WebElement priceFilter;
	@FindBy(xpath="//a[text()='Nivia Badminton Racket M Power 300']") public WebElement pickOneRacket;
	@FindBy(xpath="//span[@class='base']") public WebElement textOfRacket;
	@FindBy(xpath="//a[@class='logo']") public WebElement racketHomePage;
	
}
