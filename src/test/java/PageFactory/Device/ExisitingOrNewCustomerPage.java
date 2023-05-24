package PageFactory.Device;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExisitingOrNewCustomerPage {

	WebDriver driver;
	public ExisitingOrNewCustomerPage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:j_id31:tabIndex5007\"]")
	WebElement existButton;
	@FindBy(linkText="I’m a new customer")
	WebElement newCustomer;

	public  void existClick() throws InterruptedException {
		Thread.sleep(10000);
		existButton.click();
	}
	
	public void newCustomerClick() { 
		newCustomer.click();
	}
}
