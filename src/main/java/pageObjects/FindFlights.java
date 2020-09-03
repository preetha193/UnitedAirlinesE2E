package pageObjects;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindFlights {
	
	
	@FindBy(id="bookFlightOriginInput")
	public static WebElement source;
	
	@FindBy(xpath="//*[@id=\"bookFlightOriginInput-menu-item-0\"]/button/div/span/li")
	public static WebElement houston;
	
	
	@FindBy(id="Combined-Shape")
	public static WebElement circle;
	
	@FindBy(id="bookFlightDestinationInput")
	public static WebElement destination;
	
	@FindBy(xpath="//*[@id=\'bookFlightDestinationInput-menu-item-0\']/button/div/span")
	public static WebElement chicago;
	
	//*[@id="bookFlightOriginInput-menu-item-0"]/button/div/span
	
	//*[@id="bookFlightOriginInput-menu-item-0"]/button/div
	
	
	//@FindBy(id="DepartDate")
	//public static WebElement departDate;
	
	@FindBy(xpath="/html/body/div[10]/div/div")
	public static WebElement calendarclick;
	
	@FindBy(xpath="/html/body/div[10]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[3]")
	public static WebElement startdate;
	
	
	
	@FindBy(xpath="//*[@id=\'DepartDate\']")
	public static WebElement onwarddateSelect;
	
	
	
	@FindBy(xpath="//*[@id=\'ReturnDate\']")
	public static WebElement returndateSelect;
	
	/*
	@FindBy(id="DepartDate")
	public static WebElement startdate;
	
	@FindBy(id="ReturnDate")
	public static WebElement returndate;
	*/
	
	@FindBy(xpath="/html/body/div[10]/div/button/svg")
	public static WebElement calendarclose;
	
	@FindBy(id="bookFlightModel.passengers")
	public static WebElement selectTravelers;
	
	@FindBy(xpath="//*[@id=\'bookFlightForm\']/div[4]/div/div[1]/div/div/button")
	public static WebElement submitbutton;

		

}
