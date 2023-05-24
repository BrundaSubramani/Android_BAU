package StepDefinition.RU_24;

import PageFactory.RU_Device.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RU_24_Steps {
    public static WebDriver driver;
    homepage login;
    @Given("^User logins as sales rep for RU portal$")
    public void user_logins_as_sales_rep_for_RU_portal() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browsers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://o2uk--csupreprod--c.cs88.visual.force.com/apex/o2retailupgradechecks?context=07935002424%7C0430%7Ctest");
        login=new homepage(driver);
        login.launch();
    }

    Pincheck pin1;
    @Then("^User enters the \"(.*?)\" and click on check button$")
    public void user_enters_the_and_click_on_check_button(String arg1) throws Throwable {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        pin1=new Pincheck(driver);
        pin1.pinAndCheck(arg1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    Proceed clickProceed;
    @Then("^User can see the page and click on proceed$")
    public void user_can_see_the_page_and_click_on_proceed() throws Throwable {
        clickProceed=new Proceed(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        clickProceed.cp();
    }

    upgrade up;
    @Then("^User can add the Upgrade for all RU products \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
    public void user_can_add_the_Upgrade_for_all_RU_products_and(String handset, String arg2, String tariff) throws Throwable {
        up=new upgrade(driver);
        up.update_24(handset, arg2,tariff);
    }

    @Then("^User can click on proceed to insurance$")
    public void user_can_click_on_proceed_to_insurance() throws Throwable {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        up.proceedWithInsurance();
    }

    proceedWithUpdate clickonproceed;
    @Then("^User click on proceed to upgrade$")
    public void user_click_on_proceed_to_upgrade() throws Throwable {
        clickonproceed=new proceedWithUpdate(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        clickonproceed.update();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    order clickorder;
    @Then("^User can see the order summary page and click on place order$")
    public void user_can_see_the_order_summary_page_and_click_on_place_order() throws Throwable {
        clickorder=new order(driver);
        clickorder.checkAndClick2();
    }
    Ordernumber p;
    @Then("^User can see the total approved page$")
    public void user_can_see_the_total_approved_page() throws Throwable {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        p=new Ordernumber(driver);
        p.printNumber();
        System.out.println("success");
        //System.out.println("Success");
    }




}
