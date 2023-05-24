package StepDefinition.Simo24;

import PageFactory.Simo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Simo24_5G_Steps {

    WebDriver driver;

    @Given("customer is on Business shop homepage")
    public void customer_is_on_business_shop_homepage() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browser_Chrome/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver =new ChromeDriver(opt);
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
    }

    SimoPage SP;
    @When("customer hovers on shop and clicks on SimOnly")
    public void customer_hovers_on_shop_and_clicks_on_sim_only() {
        SP = new SimoPage(driver);
        SP.Simo_page();
    }
    @Then("customer is navigated to the simo page and selects the {int}")
    public void customer_is_navigated_to_the_simo_page_and_selects_the(Integer int1) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(15000);
    }

    TariffPage_24months T24P;
    @Then("customer clicks on the {int} {string} and clicks on continue button")
    public void customer_clicks_on_the_tc_tc_and_clicks_on_continue_button(Integer Scenario_ID, String SimoTariff) throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(5000);
        T24P= new TariffPage_24months(driver);
        if(Scenario_ID==1)
        {
            System.out.println("Tariff plan is 6GB");
            T24P.select_6GB();
        } else if (Scenario_ID==2) {
            System.out.println("Tariff plan is 1GB");
            T24P.select_1GB();
        } else if (Scenario_ID==3) {
            System.out.println("Tariff plan is 20GB");
            T24P.select_20GB();
        } else if (Scenario_ID==4) {
            System.out.println("Tariff plan is 50GB");
            T24P.select_50GB();
        } else if (Scenario_ID==5) {
            System.out.println("Tariff plan is Unlimited");
            T24P.select_unlimited();
        } else if (Scenario_ID==6) {
            System.out.println("Tariff plan is 2GB");
            T24P.select_2GB();
        } else if (Scenario_ID==7) {
            System.out.println("Tariff plan is 10GB");
            T24P.select_10GB();
        } else if (Scenario_ID==8) {
            System.out.println("Tariff plan is 30GB");
            T24P.select_30GB();
        } else {
            System.out.println("Tariff plan is 300GB");
            T24P.select_300gb();
        }
    }
    @Then("customer clicks on FourG or FiveG Sim {string}")
    public void customer_clicks_on_four_g_or_five_g_sim(String string) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"gen5G\"]")).click();
    }

    ExtrasPage EP;
    @Then("customer is navigated to the Extras page and selects spendcap {string} {int} and clicks on next button")
    public void customer_is_navigated_to_the_extras_page_and_selects_spendcap_and_clicks_on_next_button(String string, Integer int1) throws InterruptedException {
        EP = new ExtrasPage(driver);
        EP.ClickonSpendCap();
        Thread.sleep(2000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        Thread.sleep(2000);
        EP.ClickonNextbutton();
    }

    BusinessAppPage BAP;
    @Then("customer is navigated to businessapps page and select the business app and clicks on next button")
    public void customer_is_navigated_to_businessapps_page_and_select_the_business_app_and_clicks_on_next_button() throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0,300)");
        BAP = new BusinessAppPage(driver);
        BAP.select_businessapp();
        Thread.sleep(3000);
        BAP.clickNext();
    }

    ProceedToOrder order;
    @Then("customer lands on Review basket page and clicks on proceed button")
    public void customer_lands_on_review_basket_page_and_clicks_on_proceed_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        order=new ProceedToOrder(driver);
        order.proceedToOderClick();
    }

    ExisitingOrNewCustomerPage exist;
    @Then("customer selects either new or existing customer")
    public void customer_selects_either_new_or_existing_customer() {
        exist=new ExisitingOrNewCustomerPage(driver);
        exist.existClick();
    }
    PageFactory.Device.OrderPage OP;
    @Then("customer enter all the details {string}")
    public void customer_enter_all_the_details(String string) {
        OP = new PageFactory.Device.OrderPage(driver);
        OP.enterDetails();
        OP.clickCheckBox();
    }

    @Then("customer clicks on order button and get the order number for sim")
    public void customer_clicks_on_order_button_and_get_the_order_number_for_sim() {
        OP.clickOrderButton();
        String str = driver.findElement(By.xpath("//*[@id=\"containerId\"]/div/div")).getText();
        System.out.println(str);
    }
}
