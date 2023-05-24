package PageFactory.Device;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class PreprodHomePage {
	WebDriver driver;
	public PreprodHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Shop")
	WebElement shop_link;

	@FindBy(linkText="All phones")
	WebElement allPhones_link;

	public void hoverAndClick(){
		Actions action = new Actions(driver);
		action.moveToElement(shop_link).build().perform();
		allPhones_link.click();
	}

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
