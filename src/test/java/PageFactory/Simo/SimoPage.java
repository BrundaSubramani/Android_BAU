package PageFactory.Simo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimoPage {

    WebDriver driver;
    public SimoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Shop")
    WebElement shop;

    @FindBy(xpath = "//*[@id=\"j_id0:o2TemplateDSMB:StaticheaderResponseId\"]/div[3]/header/nav/div[2]/div/div[2]/div/ul[1]/li[2]/ul/li[1]/a")
    WebElement simo_link;

    public void Simo_page() {
        Actions action= new Actions(driver);
        action.moveToElement(shop).build().perform();
        simo_link.click();
    }
}