package PageFactory.RU_Device;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class homepage {
    WebDriver driver;
    public homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void launch(){

        driver.findElement(By.name("username")).sendKeys("brunda.s1@nttdata.com.csupreprod");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("April@23");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        System.out.println("okay");
           }

}
