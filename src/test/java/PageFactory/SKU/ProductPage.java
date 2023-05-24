package PageFactory.SKU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"cspmb__Price_Item__c_body\"]/table/tbody/tr[2]/th/a")
    WebElement commercialProduct;

    public void product_page(String str)
    {
        commercialProduct.click();
    }
}
