package PageFactory.SKU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sku_color {

    WebDriver driver;
    public Sku_color(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"00N9E000000kODp_ileinner\"]")
    WebElement color;

    public void sku_color(){
        String Clr= color.getText();
        System.out.println("SKU color is: "+Clr);
    }

}
