package PageFactory.SKU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Login_page(){

        driver.findElement(By.name("username")).sendKeys("brunda.s1@nttdata.com.csupreprod");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("brunda@123");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        System.out.println("okay");
    }
}
