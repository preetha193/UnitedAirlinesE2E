package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageObjects.Economyclass;
import pageObjects.SelectSeats;
import pageObjects.TravelerInfo;

public class FlightList extends FindingFlights{
	@Test (priority = 1)
	public void selectFlight() throws InterruptedException, AWTException
	{

		PageFactory.initElements(driver, Economyclass.class);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		wait2.until(ExpectedConditions.elementToBeClickable(Economyclass.onward)).click();
		//select onward flight
		//Economyclass.onward.click();
	
		wait2.until(ExpectedConditions.elementToBeClickable(Economyclass.returnflight)).click();
		//select return flight
		//Economyclass.returnflight.click();

		//driver.switchTo().frame(0);

		Economyclass.continueasGuest.click();
		Economyclass.BundleSelect.click();
		Thread.sleep(3000);
		String total=Economyclass.getTotal.getText();
		Assert.assertEquals(total,"$148.20");
		Economyclass.continuebutton.click();
	}

	@Test (priority = 2)
	public void travelerinfo() throws InterruptedException
	{

		PageFactory.initElements(driver, TravelerInfo.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		TravelerInfo.fname.sendKeys("fname");
		TravelerInfo.Lname.sendKeys("lname");

		Select select=new Select(TravelerInfo.BirthMonth);
		select.selectByIndex(3);
		WebDriverWait wait4 = new WebDriverWait(driver, 60);
		wait4.until(ExpectedConditions.elementToBeClickable(TravelerInfo.BirthDate)).sendKeys("24");
		//	TravelerInfo.BirthDate.sendKeys("12");
		//TravelerInfo.BirthYear.click();
		//WebDriverWait wait5 = new WebDriverWait(driver, 30);
		wait4.until(ExpectedConditions.elementToBeClickable(TravelerInfo.BirthYear)).sendKeys("1987");
		//TravelerInfo.BirthYear.sendKeys("1987");

		Select gender=new Select(TravelerInfo.gender);
		gender.selectByValue("M");
		wait4.until(ExpectedConditions.elementToBeClickable(TravelerInfo.traveler_Mob_number)).sendKeys("8763452341");
		//TravelerInfo.traveler_Mob_number.sendKeys("78945612301");

		TravelerInfo.continuebutton.click();

	}


	@Test (priority = 3)
	public void selectSeats()
	{

		PageFactory.initElements(driver, SelectSeats.class);
		SelectSeats.selectseatOnward.click();
		SelectSeats.seatNextFlight.click();
		SelectSeats.returnflightseat.click();
		SelectSeats.continuebutton.click();

	}

}
