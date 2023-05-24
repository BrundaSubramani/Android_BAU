package PageFactory.Device;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

	WebDriver driver;
	public OrderPage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:FirstName\"]")
	WebElement firstName;

	
	@FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:LastName\"]")
	WebElement lastName;
	
	@FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:BusinessName\"]")
	WebElement businessName;
	
	@FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:NoofEmployees\"]")
	WebElement noOfEmployees;
	
	@FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:MobileNumber\"]")
	WebElement mobileNumber;
	
	@FindBy(xpath ="//*[@id=\"j_id0:o2TemplateDSMB:theForm:disableEmailtxt\"]")
	WebElement emailTxt;
	
	@FindBy(xpath ="//*[@id=\"upgradeRD\"]")
	WebElement upgradeAd;
	
	@FindBy(xpath ="//*[@id=\"gdprUnchecked\"]")
	WebElement checkBoxCondition;

	@FindBy(xpath = "//*[@id=\"gdprUncheckedm0a9E0000000G8BQAU\"]")
	WebElement time;

	@FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:theForm:enableOrderButton\"]")
	WebElement orderrequest;
	
	
	public void enterDetails() {
		firstName.sendKeys("TTABAAAAAAAAAAA");
		lastName.sendKeys("TTAAAAAAAAAAAAAAAAAA");
		this.businessName.sendKeys("Business Professional");
		this.noOfEmployees.sendKeys("100");
		mobileNumber.sendKeys("07710163471");
		emailTxt.sendKeys("testabc@yopmail.com");
	}
	
	public void clickCheckBox () { 
		upgradeAd.click();
		checkBoxCondition.click();
		time.click();
	}
	public void clickOrderButton() { 
		orderrequest.click();
	}
}

