package StepDefinition.Device36;


import PageFactory.Device.OrderPage;
import PageFactory.Device.PreprodHomePage;
import PageFactory.Simo.ExisitingOrNewCustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;

public class DeviceJourney36_Steps {
    WebDriver driver;


        @Given("^User did launch the businessshop$")
        public void Customer_did_launch_the_businessshop()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browser_Chrome/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver =new ChromeDriver(opt);
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
            driver.get("https://csupreprod-businessshop.cs88.force.com/");

            try {
                driver.findElement(By.xpath("//*[@id=\"privacy_pref_optin\"]")).click();
            } catch (Exception e) {
            Reporter.log("pop-up is not displayed", true);
            }
        }
        PreprodHomePage homepage;
        @Then("^User navigates to phone section and selects device with name \"([^\"]*)\"$")
        public void navigates_to_phone_section_and_selects_device_with_name(String Device_Name)
        {
            homepage = new PreprodHomePage(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            homepage.hoverAndClick();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.findElement(By.xpath("//*[@class='searchInput ui-autocomplete-input']")).sendKeys(Device_Name);
            driver.findElement(By.xpath("//*[@class='searchImage']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            try{
                driver.findElement(By.xpath("//*[text()='"+Device_Name+"']")).click();
            }
            catch (Exception e) {
                Reporter.log("Device is not available in Online shop", true);
                Assert.fail();
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        @Then("^User selects the \"([^\"]*)\" variant and clicks on view tariff button$")
        public void Customer_selects_the_variant_and_clicks_on_view_tariff_button(String memory) throws InterruptedException {
            try
            {
                driver.findElement(By.xpath("//*[@class='variantSelectionOptionDiv']/UL[2]/li/div[2]")).click();
            }
            catch(Exception e)
            {
                Reporter.log("Only one memory variant is available",true);
            }
            try {
                driver.findElement(By.xpath("//*[text()='" + memory + "']")).click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            }
            catch(Exception e)
            {
                Reporter.log("The device is not available in this memory variant",true);
                Assert.fail();
            }
            //*[@class='variantSelectionOptionDiv']/ul[2]/li/div[text()="128GB"]
            driver.findElement(By.xpath("//a[text()='View all tariffs']")).click();
            Thread.sleep(10000);
        }
        @Then("^User selects the \"([^\"]*)\" and Tariff$")
        public void Customer_selects_term_and_Tariff(String term) throws InterruptedException {
            driver.findElement(By.xpath("//*[text()='"+term+"']")).click();
            Thread.sleep(20000);
            WebElement tariff=driver.findElement(By.xpath("(//div/a[text()='Select'])[1]"));
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("arguments[0].click()",tariff);
            Thread.sleep(20000);
        }
        @Then("^User navigates to review basket page and clicks on proceed button$")
        public void Customer_navigates_to_review_basket_page_and_clicks_on_proceed_button()
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            WebElement gotobasket=driver.findElement(By.xpath("(//*[text()='Go to basket'])[1]"));
            WebDriverWait wait1 = new WebDriverWait(driver, 60);
            wait1.until(ExpectedConditions.elementToBeClickable(gotobasket));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click()", gotobasket);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            WebElement proceed= driver.findElement(By.xpath("(//*[@class= \"blueButtonGlobal blueLight proceed-checkout\"])[2]"));
            proceed.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        ExisitingOrNewCustomerPage EONCP;
        @Then("user clicks on existing cutomer")
        public void user_clicks_on_existing_cutomer() throws InterruptedException {
            EONCP = new ExisitingOrNewCustomerPage(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            EONCP.existClick();
        }
        OrderPage OP;
        @Then("user navigated to order page and enter the details")
        public void user_navigated_to_order_page_and_enter_the_details() {
            OP = new OrderPage(driver);
            OP.enterDetails();
        }
        @Then("user selects upgrading or adding and clicks on the checkbox")
        public void user_selects_upgrading_or_adding_and_clicks_on_the_checkbox() throws InterruptedException {
            OP.clickCheckBox();
            Thread.sleep(3000);
        }

        @Then("clicks the order button and get the order number")
        public void clicks_the_order_button_and_get_the_order_number() throws InterruptedException {
            Thread.sleep(3000);
            OP.clickOrderButton();
            String str = driver.findElement(By.xpath("//*[@id=\"containerId\"]/div/div")).getText();
            System.out.println(str);
        }
    }