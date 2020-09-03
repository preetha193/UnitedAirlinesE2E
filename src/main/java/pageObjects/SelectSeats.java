package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectSeats {

	@FindBy(xpath="//*[@id=\'spanSeat31F\']")
	public static WebElement selectseatOnward;
	
	@FindBy(xpath="//*[@id=\'seatMap\']/section/section/div[3]/div[1]/button")
	public static WebElement seatNextFlight;
	
	@FindBy(xpath="//*[@id='spanSeat31F']")
	public static WebElement returnflightseat;
	
	@FindBy(id="btnContinue")
	public static WebElement continuebutton;
	
	
	
	
	
	
}
