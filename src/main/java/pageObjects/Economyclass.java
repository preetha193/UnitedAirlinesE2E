package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Economyclass {

	
	@FindBy(xpath="//*[@id=\'sr_product_ECONOMY_304-1253-UA\']/div/div[3]/input")
	//
	public static WebElement onward;
	
	
	@FindBy(xpath="//*[@id=\'sr_product_ECONOMY_306-1883-UA\']/div/div[3]/input")
	public static WebElement returnflight;
	
	
	@FindBy(id="btn-continue-as-guest")
	public static WebElement continueasGuest;
	
	@FindBy(id="product_btn_B01_1")
	public static WebElement BundleSelect;
	
	              
	@FindBy(xpath="//*[@id='step-nav-total']/div/div/div/div")
	public static WebElement getTotal;
	
	
	@FindBy(id="btn-continue")
	public static WebElement continuebutton;
	
	
	
	
	
	
}
