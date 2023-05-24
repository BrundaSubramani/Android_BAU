package PageFactory.SKU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetails {
    WebDriver driver;
    public productDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"lookupa7H9E0000002kAr00N9E000000kOEs\"]")
    WebElement productfamily;

    @FindBy(xpath = "//*[@id=\"00N9E000000kOEO_ileinner\"]")
    WebElement memorysize;

    @FindBy(xpath = "//*[@id=\"00N9E000000kOFG_ileinner\"]")
    WebElement stockstatus;

    public void product_details(){
        String PF= productfamily.getText();
        System.out.println("Product family is: "+PF);
        String MS= memorysize.getText();
        System.out.println("Memory Size is : "+MS);
        String SS= stockstatus.getText();
        System.out.println("Stock status is: "+SS);
    }
}
