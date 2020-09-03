package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelerInfo {

	@FindBy(id="TravelerViewModels_0__FirstName")
	public static WebElement fname;
	
	@FindBy(xpath="//*[@id=\'TravelerViewModels_0__MiddleName\']")
	public static WebElement mname;
	
	@FindBy(xpath="//*[@id=\'TravelerViewModels_0__LastName\']")
	public static WebElement Lname;
	
	
	@FindBy(xpath="//*[@id=\'TravelerViewModels_0__DOB_BirthMonth\']")
	public static WebElement BirthMonth;
	
	@FindBy(id="TravelerViewModels_0__DOB_BirthDay")  
	public static WebElement BirthDate;
	
	@FindBy(id="TravelerViewModels_0__DOB_BirthYear")
	public static WebElement BirthYear;
		
	//@FindBy(id="TravelerViewModels_0__Gender")
	@FindBy(xpath="//*[@id=\'TravelerViewModels_0__Gender\']")
	public static WebElement gender;
	
	@FindBy(id="TravelerViewModels_0__PhoneCountryCode")
	public static WebElement phonecountrycode;
	
//	@FindBy(xpath="//*[@id=\'divPhoneInputFields0\']/div/div[2]/label")
	@FindBy(id="TravelerViewModels_0__PrimaryTravelerPhoneNumber_Input")
	public static WebElement traveler_Mob_number;
	
	@FindBy(id="mmMPEnrollmentCheckBox_$$")
	public static WebElement mpenrollcheckbox;
	
	@FindBy(id="mmMPEnrollment_City__0")
	public static WebElement mpenrolladdrline1;
	
	@FindBy(id="mmMPEnrollment_City__0")
	public static WebElement mpenrollcity;
	
	@FindBy(id="mmMPEnrollment_State__0")
	public static WebElement mpenrollstate;
	
	@FindBy(id="mmMPEnrollment_ZIP__0")
	public static WebElement mpenrollzip;
	
	@FindBy(id="mmMPEnrollment_CountryCode__0")
	public static WebElement countrycode; //dropdown box
	
	@FindBy(id="mmMPEnrollment_PhoneCountryCode__0")
	public static WebElement mp_enroll_phonecountrycode; //dropdown box
	
	@FindBy(id="mmMPEnrollmentPhoneNumber_Input__0")
	public static WebElement mpenroll_Phone_Number;
	
	@FindBy(id="mmMPEnrollment_EmailAddress__0")
	public static WebElement mp_Enroll_Email_addr;
	
	@FindBy(xpath="//*[@id=\'travelerInfoForm\']/section/div[4]/div[4]/div[6]/div[2]/a")
	public static WebElement acceptenrollButton;
	
	
	@FindBy(id="btnContinue")
	public static WebElement continuebutton;
	
	
	
	
	
	
	
	
	
	
	
}
