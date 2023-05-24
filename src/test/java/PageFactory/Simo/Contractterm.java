package PageFactory.Simo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contractterm {

    WebDriver driver;
    public Contractterm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='contractLength cntrLenClass_12 selected-text']")
    WebElement select12months;

    public void select_12months() throws InterruptedException {
        Thread.sleep(10000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", select12months);
    }
}
