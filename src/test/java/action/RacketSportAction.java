package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.RacketSportLocators;
import locators.SubscriptionLocators;
import util.HelperClass;


public class RacketSportAction {
 

	RacketSportLocators racketSportLocators;
	
	public RacketSportAction(){
		racketSportLocators = new RacketSportLocators();
		PageFactory.initElements(HelperClass.getDriver(), racketSportLocators);
	}
	
	public void racketSportCatogery() {
		HelperClass.action.moveToElement(racketSportLocators.racketSport).perform();
	}
	
	public void clickBadmintonRacket() {
		racketSportLocators.badmintonRacket.click();
	}
	
	public void clickSortBy() {
		racketSportLocators.sortByOption.click();
	}
	
	public void clickPriceFilter() {
		racketSportLocators.priceFilter.click();
	}
	
	public void clickOneRacket() {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(racketSportLocators.pickOneRacket));
		//HelperClass.jse.executeScript("arguments[0].click()",racketSportLocators.pickOneRacket);
		racketSportLocators.pickOneRacket.click();
	}
	
	public 	String getTextRacket() {
		return racketSportLocators.textOfRacket.getText();
	}
}
