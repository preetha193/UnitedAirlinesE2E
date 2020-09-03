package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageObjects.FindFlights;

public class FindingFlights extends CommonFunctions{

	@Test
	public void findflights() throws InterruptedException, AWTException
	{
		PageFactory.initElements(driver, FindFlights.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*
		String source=FindFlights.source.getText();
		System.out.println("The content in the source textbox is: "+source);
		source.replaceAll(source, "");
		System.out.println("The content in the source textbox is: "+source);
		FindFlights.source.sendKeys("IAH");
		Thread.sleep(3000);
		FindFlights.houston.click();
		 */

		//WebElement source=FindFlights.source;
	//	source.click();
		//sFindFlights.circle.click();
		// source.clear();
	//	source.sendKeys("IAH");
	//	Thread.sleep(3000);
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//FindFlights.houston.click();

		WebElement destination=FindFlights.destination;
		destination.sendKeys("ORD");
		Thread.sleep(3000);
		FindFlights.chicago.click();
		//FindFlights.startdate.click();
		FindFlights.onwarddateSelect.click();
		FindFlights.returndateSelect.click();
		
		// FindFlights.startdate.click();
		// FindFlights.calendarclick.click();
		//FindFlights.startdate.sendKeys("Oct 20");
		
		//FindFlights.returndate.click();
		//FindFlights.returndate.sendKeys("Oct 25");
		
		//WebElement calClose=FindFlights.calendarclose;]
		/*

		FindFlights.departDate.click();*/
		FindFlights.submitbutton.click();

	}

}
