package Grant_Application_page;

import helper.Wait.WaitHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configreader.ObjectRepo;



public class Business_Impact_page {

	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Create_new_account_page.class);
	WaitHelper waitHelper;
	Actions actions;
	
	@FindBy(xpath=".//span[text()='Business Impact']")
	WebElement business;
	
	@FindBy(xpath=".//input[@id='react-project_impact-fy_end_date_0']")
	WebElement Fy_End_date;
	
	public Business_Impact_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	
	public void Fy_End_date(String Fy_End_date) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		
		this.Fy_End_date.sendKeys(Fy_End_date);
	}
	
	public void business() throws InterruptedException
	{
		WaitHelper.waitForElement(driver, business,ObjectRepo.reader.getPageLoadTimeOut());
		WaitHelper.waitForElement(driver, business,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(business);
		
		actions.click().build().perform();
	}
	
}
