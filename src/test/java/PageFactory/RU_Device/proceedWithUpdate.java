package PageFactory.RU_Device;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceedWithUpdate {
 WebDriver driver;

    public proceedWithUpdate(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='proceedLink']")
    WebElement proceed;

    public void update() throws InterruptedException {
        proceed.click();
    }
}
