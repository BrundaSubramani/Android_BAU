package StepDefinition.RU_Simo12;

import PageFactory.RU_Device.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RU_sim12 {

    WebDriver driver;
    homepage login;
    @Given("User logins as sales rep for RU portal to perform on sim")
    public void user_logins_as_sales_rep_for_ru_portal_to_perform_on_sim() {
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
    @Then("User enters the {string} and click on check")
    public void user_enters_the_and_click_on_check(String str) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        pin1=new Pincheck(driver);
        pin1.pinAndCheck(str);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    Proceed clickProceed;
    @Then("User can verify page and click on proceed")
    public void user_can_verify_page_and_click_on_proceed() {
        clickProceed=new Proceed(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        clickProceed.cp();
    }

    upgrade up;
    @Then("User can add the Upgrade for all RU products by clicking on sim {string} {string} and {string}")
    public void user_can_add_the_upgrade_for_all_ru_products_by_clicking_on_sim_and(String sim, String str2, String tariff) throws InterruptedException {
        up=new upgrade(driver);
        up.numberOfEmployess();
        up.update_sim12(sim, str2,tariff);
    }

    @Then("Then user click on proceed to insurance")
    public void then_user_click_on_proceed_to_insurance() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        up.proceedWithInsurance();
    }

    proceedWithUpdate clickonproceed;
    @Then("User click on proceed to upgrade link")
    public void user_click_on_proceed_to_upgrade_link() throws InterruptedException {
        clickonproceed=new proceedWithUpdate(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        clickonproceed.update();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    order clickorder;
    @Then("User can verify the order summary page and click on place order")
    public void user_can_verify_the_order_summary_page_and_click_on_place_order() {
        clickorder=new order(driver);
        clickorder.checkAndClick2();
    }

    Ordernumber p;
    @Then("User can see and verify the total approved page")
    public void user_can_see_and_verify_the_total_approved_page() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        p=new Ordernumber(driver);
        p.printNumber();
        System.out.println("success");
        System.out.println("Success");
    }

}
