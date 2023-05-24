package PageFactory.RU_Device;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class upgrade {
    WebDriver driver;
    public upgrade(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='j_id0:o2GWTemplate:divRU:numEmployees']")
    WebElement emp;
    @FindBy(xpath = "(//div[contains(text(),'Select Handset:')]/..//select)[1]")
    WebElement select_headset;

    @FindBy(xpath = "//div[contains(text(),'IMEI Number:')]/..//input")
    WebElement IMEI;
    @FindBy(xpath = "//div[contains(text(),'Select Tariff:')]/..//select")
    WebElement select_Tariff;
    @FindBy(xpath = "//div[text()='Would you like to add a spend cap?']/..//select")
    WebElement spend_cap;

    public void numberOfEmployess() {
        emp.clear();
        int num=50;
        emp.sendKeys(""+num);
    }

    public void update_24(String handset,String arg2, String tariff) throws InterruptedException {
        Select listbox = new Select(select_headset);
        listbox.selectByVisibleText(handset);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        emp.sendKeys("50");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        IMEI.sendKeys(arg2);
        Thread.sleep(8000);

        Select listbox1 = new Select(select_Tariff);
        listbox1.selectByVisibleText(tariff);
        Thread.sleep(10000);
        Select listbox2 = new Select(spend_cap);
        listbox2.selectByVisibleText("No");
        Thread.sleep(8000);
    }



    public void proceedWithInsurance(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"procButton\"]/a")).click();
    }

    @FindBy(xpath = "//*[@id='j_id0:o2GWTemplate:divRU:upgradeTypeRadio:1']")
    WebElement simOnly;



    public void update_sim12(String sim,String arg2, String tariff) throws InterruptedException{
        simOnly.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Select listbox = new Select(driver.findElement(By.xpath("//*[@id='j_id0:o2GWTemplate:divRU:deviceSIMSelection']")));
        listbox.selectByVisibleText(sim);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //emp.sendKeys("50");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@name='j_id0:o2GWTemplate:divRU:j_id122']")).sendKeys(arg2);
        Thread.sleep(8000);

        Select listbox1 = new Select(driver.findElement(By.xpath("//*[@id='j_id0:o2GWTemplate:divRU:tariffSelectionList']")));
        listbox1.selectByVisibleText(tariff);
        Thread.sleep(8000);

        Select listbox2 = new Select(driver.findElement(By.xpath("//*[@id='j_id0:o2GWTemplate:divRU:spendCapCheckList']")));
        listbox2.selectByVisibleText("No");
        Thread.sleep(1000);

        Select listbox3 = new Select(driver.findElement(By.xpath("//*[@id='j_id0:o2GWTemplate:divRU:Ready5GList']")));
        listbox3.selectByVisibleText("No");
        Thread.sleep(1000);

    }



}

