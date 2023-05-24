package PageFactory.RU_Device;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.time.Duration;

public class Pincheck {

    WebDriver driver;
    public Pincheck(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='j_id0:o2GWTemplate:j_id53:pin']")
    WebElement pin;

    @FindBy(xpath = "(//a[text()='Check'])[1]")
    WebElement check;

    public void pinAndCheck(String str){
        System.out.println(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        try {
            pin.sendKeys(str);
            check.click();
        }
        catch(Exception e)
        {
            Reporter.log("Pin not generated",true);
        }
    }
}

