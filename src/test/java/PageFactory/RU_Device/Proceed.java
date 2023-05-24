package PageFactory.RU_Device;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Proceed {
    WebDriver driver;
    public Proceed(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"procBtn\"]/a")
    WebElement pc;

    public void cp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        pc.click();
    }
}
