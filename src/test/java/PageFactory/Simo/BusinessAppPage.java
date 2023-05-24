package PageFactory.Simo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessAppPage {
    WebDriver driver;
    public BusinessAppPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='MCF5RT-btn']")
    WebElement businessApp;

    @FindBy(xpath = "//a[@id='next-button-lower']")
    WebElement next;

    public void select_businessapp()
    {
        businessApp.click();
    }
    public void clickNext()
    {
        next.click();
    }
}