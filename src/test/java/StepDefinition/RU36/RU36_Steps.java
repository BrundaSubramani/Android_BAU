package StepDefinition.RU36;

import PageFactory.RU_Device.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RU36_Steps {

    WebDriver driver;
    homepage login;
    @Given("^User login as sales rep for RU portal$")
    public void user_login_as_sales_rep_for_RU_portal() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browser_Chrome/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver =new ChromeDriver(opt);
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://o2uk--csupreprod--c.cs88.visual.force.com/apex/o2retailupgradechecks?context=07935002424%7C0430%7Ctest");
        login=new homepage(driver);
        login.launch();
    }

    Pincheck pin1;
    @Then("^User enters the \"(.*?)\" then on check button$")
    public void user_enters_the_then_on_check_button(String arg1) throws Throwable {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        pin1=new Pincheck(driver);
        pin1.pinAndCheck(arg1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    Proceed clickProceed;
    @Then("^User can verify the page and click on proceed$")
    public void user_can_verify_the_page_and_click_on_proceed() throws Throwable {
        clickProceed=new Proceed(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        clickProceed.cp();
    }

    upgrade up;
    @Then("^User can add the Upgrade details for all RU products \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
    public void user_can_add_the_Upgrade_details_for_all_RU_products_and(String handset, String arg2, String tariff) throws Throwable {
        up=new upgrade(driver);
        up.numberOfEmployess();
        up.update_24(handset, arg2,tariff);
    }

    @Then("^User can click on proceed to insurance button$")
    public void user_can_click_on_proceed_to_insurance_button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        up.proceedWithInsurance();
    }

    Insurance in;
    @Then("^User click on proceed to upgrade button$")
    public void user_click_on_proceed_to_upgrade_button() throws Throwable {
        in=new Insurance(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        in.addInsurance();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    order clickorder;
    @Then("^User can see the order summary page then click on place order$")
    public void user_can_see_the_order_summary_page_then_click_on_place_order() throws Throwable {
        clickorder=new order(driver);
        clickorder.checkAndClick2();
    }

    Ordernumber p;
    @Then("^User can see the total approved page of ru$")
    public void user_can_see_the_total_approved_page_of_ru() throws Throwable {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        p=new Ordernumber(driver);
        p.printNumber();
        System.out.println("success");
    }

}
