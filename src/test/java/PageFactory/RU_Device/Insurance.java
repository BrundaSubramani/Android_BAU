package PageFactory.RU_Device;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Insurance {
    WebDriver driver;
    public Insurance(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"j_id0:o2GWTemplate:innerDiv:termsCheckbox\"]")
    WebElement checkbox;

   @FindBy(xpath = "//*[@id=\"proceedLink\"]")
    WebElement enterProceed;

    public void addInsurance() throws InterruptedException {
        Select listbox = new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:o2GWTemplate:innerDiv:insureBOSelection\"]")));
        listbox.selectByVisibleText("O2 Insure - Full Cover");
        Thread.sleep(5000);
        checkbox.click();
        Thread.sleep(3000);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        //enterProceed = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"proceedLink\\\"]")));
        //enterProceed.click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", enterProceed);
        // enterProceed.click();
    }
}
