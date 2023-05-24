package PageFactory.Simo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ExtrasPage {
    WebDriver driver;
    public ExtrasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class= \"billCapBtn\"])[3]")
    WebElement Nospendcap;

   // @FindBy(xpath = "//*[@id=\"billCapAmount_15\"]")
   //WebElement capAmount;

    //@FindBy(xpath = "//span[@id='capBtnSecond']")
    //WebElement Cont;

    @FindBy(xpath = "//a[@class='buttonInitial buttonLarge blueLight btnEnable']")
    WebElement nxtbutton;

    public void ClickonSpendCap(){
        Nospendcap.click();
    }


    public void ClickonNextbutton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", nxtbutton);
    }
}