package PageFactory.RU_Device;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class order {
    private final WebDriver driver;

    public order(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"j_id0:o2GWTemplate:summaryForm:chkAcceptTerms\"]")
    WebElement check1;

    @FindBy(xpath = "//*[@id='j_id0:o2GWTemplate:summaryForm:gdprConsent']")
    WebElement check2;

    @FindBy(xpath = "//*[@id='j_id0:o2GWTemplate:summaryForm:waiveCICS']")
    WebElement check3;

    @FindBy(xpath ="//*[@id='orderLink']" )
    WebElement clickOrder;

    public void checkAndClick1(){
    check1.click();
    check2.click();
    check3.click();
    clickOrder.click();
    }

    public void checkAndClick2(){
        check1.click();
        check2.click();
        clickOrder.click();
    }
}
