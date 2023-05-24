package PageFactory.Simo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class TariffPage_24months {
    WebDriver driver;
    public TariffPage_24months(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AVV_tbl-btn\"]")
    WebElement select6GB;

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AVQ_tbl-btn\"]")
    WebElement select1GB;

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AWD_tbl-btn\"]")
    WebElement select20GB;

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AWI_tbl-btn\"]")
    WebElement select50GB;

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AWQ_tbl-btn\"]")
    WebElement Unlimited;

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AWV_tbl-btn\"]")
    WebElement select2GB;

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AXA_tbl-btn\"]")
    WebElement select10GB;

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AXD_tbl-btn\"]")
    WebElement select30GB;

    @FindBy(xpath = "//*[@id=\"OthersmartphonesSIMQA2AXG_tbl-btn\"]")
    WebElement select300gb;

    @FindBy(xpath = "//*[@class= \"blueButtonGlobal tariffPageBtn selectedButtonSim continueClicked\"]")
    WebElement Continue;

    public void select_6GB()
    {
        select6GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }

    public void select_1GB()
    {
        select1GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }

    public void select_20GB()
    {
        select20GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }

    public void select_50GB()
    {
        select50GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }

    public void select_unlimited()
    {
        Unlimited.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }

    public void select_2GB()
    {
        select2GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }

    public void select_10GB()
    {
        select10GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }

    public void select_30GB()
    {
        select30GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }

    public void select_300gb()
    {
        select300gb.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Continue.click();
    }


}
