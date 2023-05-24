package PageFactory.RU_Device;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ordernumber {
    WebDriver driver;
    public Ordernumber(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/b")
    WebElement ordernumber;

    public  void printNumber(){
        String number=ordernumber.getText();
        System.out.println("ordernumber is:- "+number);
    }
}
