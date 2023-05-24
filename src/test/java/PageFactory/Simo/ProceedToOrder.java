package PageFactory.Simo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ProceedToOrder {
	
	WebDriver driver;
	public ProceedToOrder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="(//*[@class='blueButtonGlobal blueLight proceed-checkout'])[2]")
	WebElement proceedToOrder;
	
	
	
	public void proceedToOderClick() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		proceedToOrder.click();
	}
	
	
}
